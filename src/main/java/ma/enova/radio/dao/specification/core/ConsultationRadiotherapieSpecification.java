package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ConsultationRadiotherapieSpecification extends AbstractSpecification<ConsultationRadiotherapieCriteria, ConsultationRadiotherapie> {

    public ConsultationRadiotherapieSpecification(ConsultationRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public ConsultationRadiotherapieSpecification(ConsultationRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<ConsultationRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria);
             addPredicate("dateConsultation", criteria.getDateConsultation(), criteria.getDateConsultationFrom(), criteria.getDateConsultationTo());
             addPredicate("classificationOms", criteria.getClassificationOms(),criteria.getClassificationOmsLike());
             addPredicate("statutMedicale", criteria.getStatutMedicale(),criteria.getStatutMedicaleLike());
            addPredicate("medecin.id", criteria.getMedecin());
            addPredicate("medecin.id", criteria.getMedecins());
            addPredicate("typeConsultationRadiotherapie.id", criteria.getTypeConsultationRadiotherapie());
            addPredicate("typeConsultationRadiotherapie.id", criteria.getTypeConsultationRadiotherapies());
            addPredicate("typeToxiciteRth.id", criteria.getTypeToxiciteRth());
            addPredicate("typeToxiciteRth.id", criteria.getTypeToxiciteRths());
            addPredicate("gradeToxiciteRth.id", criteria.getGradeToxiciteRth());
            addPredicate("gradeToxiciteRth.id", criteria.getGradeToxiciteRths());
            addPredicate("prescriptionRadiotherapie.id", criteria.getPrescriptionRadiotherapie());
            addPredicate("prescriptionRadiotherapie.id", criteria.getPrescriptionRadiotherapies());
            addOrderAndFilter();
          }
        return getResult();
    }

}
