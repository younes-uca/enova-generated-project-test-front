package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.bean.history.PersonnelHistory;
import ma.enova.radio.dao.criteria.core.PersonnelCriteria;
import ma.enova.radio.dao.criteria.history.PersonnelHistoryCriteria;
import ma.enova.radio.dao.facade.core.PersonnelDao;
import ma.enova.radio.dao.facade.history.PersonnelHistoryDao;
import ma.enova.radio.dao.specification.core.PersonnelSpecification;
import ma.enova.radio.service.facade.admin.PersonnelAdminService;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class PersonnelAdminServiceImpl extends AbstractServiceImpl<Personnel, PersonnelDto,PersonnelHistory, PersonnelCriteria, PersonnelHistoryCriteria, PersonnelDao,
PersonnelHistoryDao, PersonnelConverter> implements PersonnelAdminService {

    public PersonnelAdminServiceImpl(PersonnelDao dao, PersonnelHistoryDao historyDao, PersonnelConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<Personnel> findByCategoriePersonnelId(Long id){
        return dao.findByCategoriePersonnelId(id);
    }
    public int deleteByCategoriePersonnelId(Long id){
        return dao.deleteByCategoriePersonnelId(id);
    }
    public List<Personnel> findBySpecialiteId(Long id){
        return dao.findBySpecialiteId(id);
    }
    public int deleteBySpecialiteId(Long id){
        return dao.deleteBySpecialiteId(id);
    }


    public void configure() {
        super.configure(Personnel.class, PersonnelDto.class, PersonnelHistory.class, PersonnelHistoryCriteria.class, PersonnelSpecification.class);
    }




}