package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.CategoriePersonnel;
import ma.enova.radio.bean.history.CategoriePersonnelHistory;
import ma.enova.radio.dao.criteria.core.CategoriePersonnelCriteria;
import ma.enova.radio.dao.criteria.history.CategoriePersonnelHistoryCriteria;
import ma.enova.radio.dao.facade.core.CategoriePersonnelDao;
import ma.enova.radio.dao.facade.history.CategoriePersonnelHistoryDao;
import ma.enova.radio.dao.specification.core.CategoriePersonnelSpecification;
import ma.enova.radio.service.facade.admin.CategoriePersonnelAdminService;
import ma.enova.radio.ws.converter.CategoriePersonnelConverter;
import ma.enova.radio.ws.dto.CategoriePersonnelDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class CategoriePersonnelAdminServiceImpl extends AbstractServiceImpl<CategoriePersonnel, CategoriePersonnelDto,CategoriePersonnelHistory, CategoriePersonnelCriteria, CategoriePersonnelHistoryCriteria, CategoriePersonnelDao,
CategoriePersonnelHistoryDao, CategoriePersonnelConverter> implements CategoriePersonnelAdminService {

    public CategoriePersonnelAdminServiceImpl(CategoriePersonnelDao dao, CategoriePersonnelHistoryDao historyDao, CategoriePersonnelConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<CategoriePersonnel> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(CategoriePersonnel.class, CategoriePersonnelDto.class, CategoriePersonnelHistory.class, CategoriePersonnelHistoryCriteria.class, CategoriePersonnelSpecification.class);
    }




}