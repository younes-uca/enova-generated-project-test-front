package ma.enova.radio.zynerator.service;

import ma.enova.radio.zynerator.security.bean.User;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.dto.BaseDto;
import ma.enova.radio.zynerator.enumeration.ACTION_TYPE;
import ma.enova.radio.zynerator.exception.EntityNotFoundException;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import ma.enova.radio.zynerator.history.HistCriteria;
import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.zynerator.util.RefelexivityUtil;
import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.util.Utils;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public abstract class AbstractServiceImpl<T extends AuditBusinessObject, DTO extends BaseDto, H extends HistBusinessObject, CRITERIA extends BaseCriteria, HC extends HistCriteria, REPO extends AbstractRepository<T, Long>, HISTREPO extends AbstractHistoryRepository<H, Long>, CONV extends AbstractConverter<T, DTO, H>> extends AbstractServiceImplHelper<T>{

    protected AbstractSpecification<CRITERIA, T> specification;
    protected Class<? extends AbstractSpecification<CRITERIA, T>> specificationClass;

    protected HISTREPO historyRepository;
    protected Class<H> historyClass;
    protected Class<HC> historyCriteriaClass;
    protected Class<? extends AbstractHistorySpecification<HC, H>> historySPecificationClass;


    protected REPO dao;

    protected AbstractConverter<T, DTO, H> abstractConverter;

    protected Class<T> itemClass;
    protected Class<DTO> dtoClass;


    public AbstractServiceImpl(REPO dao, HISTREPO historyRepository, CONV abstractConverter) {
        this.dao = dao;
        this.abstractConverter = abstractConverter;
        this.historyRepository = historyRepository;
        this.configure();
    }


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public T create(T t) {
        T saved = dao.save(t);
        return t;
    }
    /*

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public DTO create(DTO dto) {
        T t = converter.toItem(dto);
        T saved = dao.save(t);
        dto.setId(saved.getId());
        return dto;
    }
    */

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
        public List<T> create(List<T> ts) {
        if (ts != null) {
            for (T t : ts) {
                create(t);
            }
        }
        return ts;
    }
//    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
//    public List<DTO> create(List<DTO> dtos) {
    //        if (dtos != null) {
    //            for (DTO dto : dtos) {
    //                create(dto);
    //            }
    //        }
    //        return dtos;
    //    }


    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public DTO update(DTO dto) {
        saveAuditData(dto, ACTION_TYPE.UPDATE);
        T loadedItem = dao.findById(dto.getId()).orElse(null);
        if (loadedItem == null) {
            throw new EntityNotFoundException("errors.notFound", new String[]{itemClass.getSimpleName(), dto.getId().toString()});
        }
        T item = abstractConverter.toItem(dto);
        dao.saveAndFlush(item);
        return dto;
    }

    public T findById(Long id) {
        Optional<T> item = dao.findById(id);
        return item.orElse(null);
    }

    public T findWithAssociatedLists(Long id){
        return findById(id);
    }

    public void deleteWithAssociatedLists(T t){
        delete(t);
    }

    public void updateWithAssociatedLists(T t){

    }
    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public void delete(T t) {
        if (t != null) {
        dao.deleteById(t.getId()); // il fait find by id apres delete !!!
        //constructAndSaveHistory(dto, ACTION_TYPE.DELETE); TO DO
        }
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public void delete(List<T> list) {
        if (list != null) {
            for (T t : list) {
                dao.deleteById(t.getId()); // il fait find by id apres delete !!!
                //constructAndSaveHistory(dto, ACTION_TYPE.DELETE); TO DO
            }
        }
    }



    public List<T> findByCriteria(CRITERIA criteria) {
        List<T> content = null;
        if (criteria != null) {
            addEtablissementConstraint(criteria);
            AbstractSpecification<CRITERIA,T> mySpecification = constructSpecification(criteria);
            if (criteria.isPeagable()) {
                Pageable pageable = PageRequest.of(0, criteria.getMaxResults());
                content = dao.findAll(mySpecification, pageable).getContent();
            } else {
                content = dao.findAll(mySpecification);
            }
        } else {
            content = dao.findAll();
        }
        return content;

    }

    public List<T> findPaginatedByCriteria(CRITERIA criteria, int page, int pageSize, String order, String sortField) {
        addEtablissementConstraint(criteria);
        AbstractSpecification<CRITERIA,T> mySpecification = constructSpecification(criteria);
        order = (order != null && !order.isEmpty()) ? order : "desc";
        sortField = (sortField != null && !sortField.isEmpty()) ? sortField : "id";
        Pageable pageable = PageRequest.of(page, pageSize, Sort.Direction.fromString(order), sortField);
        return dao.findAll(mySpecification, pageable).getContent();
    }

    public int getDataSize(CRITERIA criteria) {
        addEtablissementConstraint(criteria);
        AbstractSpecification<CRITERIA, T> mySpecification = constructSpecification(criteria);
        mySpecification.setDistinct(true);
        return ((Long) dao.count(mySpecification)).intValue();
    }



    public List<T> findAll() {
        return dao.findAll();
    }


    private AbstractSpecification<CRITERIA, T> constructSpecification(CRITERIA criteria) {
        AbstractSpecification<CRITERIA, T> mySpecification = RefelexivityUtil.constructObjectUsingOneParam(specificationClass,criteria);
        return mySpecification;
    }

    //****************************** HISTORY


    public void saveAuditData(DTO dto, ACTION_TYPE action){
        DTO old = abstractConverter.toDto(findById(dto.getId()));
        try {
            if (Utils.compareObjectsDiff(dto, old)) {
                constructAndSaveHistory(dto, action);
            }
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }

    public AuditEntityDto findHistoryById(Long id) {
        H h = historyRepository.findById(id).orElseThrow(() -> new EntityNotFoundException("errors.notFound", new String[]{historyClass.getSimpleName(), id.toString()}));
        return (AuditEntityDto) abstractConverter.copyFromHistory(h);
    }


    public List<AuditEntityDto> findHistoryPaginatedByCriteria(HC historyCriteria, int page, int pageSize, String order, String sortField) {
        AbstractHistorySpecification<HC, H> mySpecification = constructSpecificationHistory(historyCriteria);
        order = StringUtil.isNotEmpty(order) ? order : "desc";
        sortField = StringUtil.isNotEmpty(sortField) ? sortField : "id";
        Pageable pageable = PageRequest.of(page, pageSize, Sort.Direction.fromString(order), sortField);
        List<H> content = historyRepository.findAll(mySpecification, pageable).getContent();
        return content.stream().map(h -> (AuditEntityDto) abstractConverter.copyFromHistory(h)).collect(Collectors.toList());
    }

    public List<AuditEntityDto> findHistoryByCriteria(HC historyCriteria) {
        AbstractHistorySpecification<HC, H> mySpecification = constructSpecificationHistory(historyCriteria);
        List<H> content = null;
        if (historyCriteria.isPeagable()) {
            Pageable pageable = PageRequest.of(0, historyCriteria.getMaxResults());
            content = historyRepository.findAll(mySpecification, pageable).getContent();
        } else {
            content = historyRepository.findAll(mySpecification);
        }
        return content.stream().map(h -> (AuditEntityDto) abstractConverter.copyFromHistory(h)).collect(Collectors.toList());
    }

    public int getHistoryDataSize(HC historyCriteria) {
        AbstractHistorySpecification<HC, H> mySpecification = constructSpecificationHistory(historyCriteria);
        mySpecification.setDistinct(true);
        return ((Long) historyRepository.count(mySpecification)).intValue();
    }

    public void constructAndSaveHistory(DTO dto, ACTION_TYPE action) {
        User currentUser = getCurrentUser();
        H history = RefelexivityUtil.constructObjectUsingDefaultConstr(historyClass);
        history.setActionType(action.name());
        history.setObjectName(itemClass.getSimpleName());
        history.setObjectId(dto.getId());
        history.setUserId(currentUser.getId());
        history.setUsername(currentUser.getUsername());
        String dtoAsJson = null;
        try {
            dtoAsJson = new ObjectMapper().writeValueAsString(dto);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        history.setData(dtoAsJson);
        history.setDate(LocalDateTime.now());
        historyRepository.save(history);
    }


    private AbstractHistorySpecification<HC, H> constructSpecificationHistory(HC hc) {
        AbstractHistorySpecification<HC, H> mySpecification = RefelexivityUtil.constructObjectUsingDefaultConstr(historySPecificationClass);
        mySpecification.setCriteria(hc);
        return mySpecification;
    }

    public void configure(Class<T> itemClass,Class<DTO> dtoClass,Class<H> historyClass,Class<HC> historyCriteriaClass,Class<? extends AbstractSpecification<CRITERIA,T>> specificationClass){
        this.itemClass = itemClass;
        this.dtoClass = dtoClass;
        this.historyClass = historyClass;
        this.historyCriteriaClass = historyCriteriaClass;
        this.specificationClass = specificationClass;
    }

    public abstract void configure();


    private void addEtablissementConstraint(CRITERIA criteria) {
        Object userInfo = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        if (userInfo instanceof User) {
            User currentUser = (User) userInfo;
            criteria.setEtablissementId(currentUser.getEtablissement() != null ? currentUser.getEtablissement().getId() : null);
        }
    }


    public User getCurrentUser() {
        return (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }

 }