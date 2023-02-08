package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.FrequenceRadiotherapie;
import ma.enova.radio.bean.history.FrequenceRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.FrequenceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.FrequenceRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.FrequenceRadiotherapieDao;
import ma.enova.radio.dao.facade.history.FrequenceRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.FrequenceRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.FrequenceRadiotherapieAdminService;
import ma.enova.radio.ws.converter.FrequenceRadiotherapieConverter;
import ma.enova.radio.ws.dto.FrequenceRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class FrequenceRadiotherapieAdminServiceImpl extends AbstractServiceImpl<FrequenceRadiotherapie, FrequenceRadiotherapieDto,FrequenceRadiotherapieHistory, FrequenceRadiotherapieCriteria, FrequenceRadiotherapieHistoryCriteria, FrequenceRadiotherapieDao,
FrequenceRadiotherapieHistoryDao, FrequenceRadiotherapieConverter> implements FrequenceRadiotherapieAdminService {

    public FrequenceRadiotherapieAdminServiceImpl(FrequenceRadiotherapieDao dao, FrequenceRadiotherapieHistoryDao historyDao, FrequenceRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<FrequenceRadiotherapie> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(FrequenceRadiotherapie.class, FrequenceRadiotherapieDto.class, FrequenceRadiotherapieHistory.class, FrequenceRadiotherapieHistoryCriteria.class, FrequenceRadiotherapieSpecification.class);
    }




}