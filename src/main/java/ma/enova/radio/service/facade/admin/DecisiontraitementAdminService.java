package ma.enova.radio.service.facade.admin;

import java.util.List;
import ma.enova.radio.bean.core.Decisiontraitement;
import ma.enova.radio.ws.dto.DecisiontraitementDto;
import ma.enova.radio.zynerator.service.IService;
import ma.enova.radio.dao.criteria.core.DecisiontraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisiontraitementHistoryCriteria;


public interface DecisiontraitementAdminService extends IService<Decisiontraitement, DecisiontraitementDto,DecisiontraitementCriteria, DecisiontraitementHistoryCriteria> {
    //Decisiontraitement findOrSave(Decisiontraitement decisiontraitement);



}
