package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Services;
import ma.enova.radio.bean.history.ServicesHistory;
import ma.enova.radio.dao.criteria.core.ServicesCriteria;
import ma.enova.radio.dao.criteria.history.ServicesHistoryCriteria;
import ma.enova.radio.dao.facade.core.ServicesDao;
import ma.enova.radio.dao.facade.history.ServicesHistoryDao;
import ma.enova.radio.dao.specification.core.ServicesSpecification;
import ma.enova.radio.service.facade.admin.ServicesAdminService;
import ma.enova.radio.ws.converter.ServicesConverter;
import ma.enova.radio.ws.dto.ServicesDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class ServicesAdminServiceImpl extends AbstractServiceImpl<Services, ServicesDto,ServicesHistory, ServicesCriteria, ServicesHistoryCriteria, ServicesDao,
ServicesHistoryDao, ServicesConverter> implements ServicesAdminService {

    public ServicesAdminServiceImpl(ServicesDao dao, ServicesHistoryDao historyDao, ServicesConverter converter) {
        super(dao, historyDao, converter);
    }



    public void configure() {
        super.configure(Services.class, ServicesDto.class, ServicesHistory.class, ServicesHistoryCriteria.class, ServicesSpecification.class);
    }




}