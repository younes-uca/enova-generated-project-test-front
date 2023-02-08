package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.DecisiontraitementCriteria;
import ma.enova.radio.bean.core.Decisiontraitement;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class DecisiontraitementSpecification extends AbstractSpecification<DecisiontraitementCriteria, Decisiontraitement> {

    public DecisiontraitementSpecification(DecisiontraitementCriteria criteria) {
        super(criteria);
    }

    public DecisiontraitementSpecification(DecisiontraitementCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<Decisiontraitement> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria);
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
             addPredicate("datedecisiontraitement", criteria.getDatedecisiontraitement(), criteria.getDatedecisiontraitementFrom(), criteria.getDatedecisiontraitementTo());
             addPredicate("decisiontherapeutique", criteria.getDecisiontherapeutique(),criteria.getDecisiontherapeutiqueLike());
             addPredicateBool("urgence", criteria.getUrgence());
            addOrderAndFilter();
          }
        return getResult();
    }

}
