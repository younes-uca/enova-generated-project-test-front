package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.TypeConsultationRadiotherapie;
import ma.enova.radio.bean.history.TypeConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.TypeConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.TypeConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.TypeConsultationRadiotherapieDao;
import ma.enova.radio.dao.facade.history.TypeConsultationRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.TypeConsultationRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.TypeConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.TypeConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.TypeConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class TypeConsultationRadiotherapieAdminServiceImpl extends AbstractServiceImpl<TypeConsultationRadiotherapie, TypeConsultationRadiotherapieDto,TypeConsultationRadiotherapieHistory, TypeConsultationRadiotherapieCriteria, TypeConsultationRadiotherapieHistoryCriteria, TypeConsultationRadiotherapieDao,
TypeConsultationRadiotherapieHistoryDao, TypeConsultationRadiotherapieConverter> implements TypeConsultationRadiotherapieAdminService {

    public TypeConsultationRadiotherapieAdminServiceImpl(TypeConsultationRadiotherapieDao dao, TypeConsultationRadiotherapieHistoryDao historyDao, TypeConsultationRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<TypeConsultationRadiotherapie> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(TypeConsultationRadiotherapie.class, TypeConsultationRadiotherapieDto.class, TypeConsultationRadiotherapieHistory.class, TypeConsultationRadiotherapieHistoryCriteria.class, TypeConsultationRadiotherapieSpecification.class);
    }




}