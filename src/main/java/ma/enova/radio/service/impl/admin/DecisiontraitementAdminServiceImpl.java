package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.Decisiontraitement;
import ma.enova.radio.bean.history.DecisiontraitementHistory;
import ma.enova.radio.dao.criteria.core.DecisiontraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisiontraitementHistoryCriteria;
import ma.enova.radio.dao.facade.core.DecisiontraitementDao;
import ma.enova.radio.dao.facade.history.DecisiontraitementHistoryDao;
import ma.enova.radio.dao.specification.core.DecisiontraitementSpecification;
import ma.enova.radio.service.facade.admin.DecisiontraitementAdminService;
import ma.enova.radio.ws.converter.DecisiontraitementConverter;
import ma.enova.radio.ws.dto.DecisiontraitementDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class DecisiontraitementAdminServiceImpl extends AbstractServiceImpl<Decisiontraitement, DecisiontraitementDto,DecisiontraitementHistory, DecisiontraitementCriteria, DecisiontraitementHistoryCriteria, DecisiontraitementDao,
DecisiontraitementHistoryDao, DecisiontraitementConverter> implements DecisiontraitementAdminService {

    public DecisiontraitementAdminServiceImpl(DecisiontraitementDao dao, DecisiontraitementHistoryDao historyDao, DecisiontraitementConverter converter) {
        super(dao, historyDao, converter);
    }



    public void configure() {
        super.configure(Decisiontraitement.class, DecisiontraitementDto.class, DecisiontraitementHistory.class, DecisiontraitementHistoryCriteria.class, DecisiontraitementSpecification.class);
    }




}