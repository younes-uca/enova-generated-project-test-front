package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.FrequenceRadiotherapieCriteria;
import ma.enova.radio.bean.core.FrequenceRadiotherapie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class FrequenceRadiotherapieSpecification extends AbstractSpecification<FrequenceRadiotherapieCriteria, FrequenceRadiotherapie> {

    public FrequenceRadiotherapieSpecification(FrequenceRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public FrequenceRadiotherapieSpecification(FrequenceRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<FrequenceRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria);
             addPredicate("code", criteria.getCode(),criteria.getCodeLike());
             addPredicate("libelle", criteria.getLibelle(),criteria.getLibelleLike());
             addPredicateBool("actif", criteria.getActif());
             addPredicate("hl7", criteria.getHl7(),criteria.getHl7Like());
             addPredicateLong("ordre", criteria.getOrdre());
             addPredicateLong("ordre", criteria.getOrdreMin(), criteria.getOrdreMax());
            addPredicate("services.id", criteria.getServices());
            addPredicate("services.id", criteria.getServicess());
            addOrderAndFilter();
          }
        return getResult();
    }

}