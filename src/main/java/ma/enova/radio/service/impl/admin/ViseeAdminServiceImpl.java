package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Visee;
import ma.enova.radio.bean.history.ViseeHistory;
import ma.enova.radio.dao.criteria.core.ViseeCriteria;
import ma.enova.radio.dao.criteria.history.ViseeHistoryCriteria;
import ma.enova.radio.dao.facade.core.ViseeDao;
import ma.enova.radio.dao.facade.history.ViseeHistoryDao;
import ma.enova.radio.dao.specification.core.ViseeSpecification;
import ma.enova.radio.service.facade.admin.ViseeAdminService;
import ma.enova.radio.ws.converter.ViseeConverter;
import ma.enova.radio.ws.dto.ViseeDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class ViseeAdminServiceImpl extends AbstractServiceImpl<Visee, ViseeDto,ViseeHistory, ViseeCriteria, ViseeHistoryCriteria, ViseeDao,
ViseeHistoryDao, ViseeConverter> implements ViseeAdminService {

    public ViseeAdminServiceImpl(ViseeDao dao, ViseeHistoryDao historyDao, ViseeConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<Visee> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(Visee.class, ViseeDto.class, ViseeHistory.class, ViseeHistoryCriteria.class, ViseeSpecification.class);
    }




}