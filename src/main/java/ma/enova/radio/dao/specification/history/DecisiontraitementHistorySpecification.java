package  ma.enova.radio.dao.specification.history;

import ma.enova.radio.zynerator.specification.AbstractHistorySpecification;
import ma.enova.radio.dao.criteria.history.DecisiontraitementHistoryCriteria;
import ma.enova.radio.bean.history.DecisiontraitementHistory;


public class DecisiontraitementHistorySpecification extends AbstractHistorySpecification<DecisiontraitementHistoryCriteria, DecisiontraitementHistory> {

    public DecisiontraitementHistorySpecification(DecisiontraitementHistoryCriteria criteria) {
        super(criteria);
    }

    public DecisiontraitementHistorySpecification(DecisiontraitementHistoryCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }

}
