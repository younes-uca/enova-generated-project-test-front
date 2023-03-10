package  ma.enova.radio.dao.specification.core;




import ma.enova.radio.zynerator.specification.AbstractSpecification;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PrescriptionRadiotherapieSpecification extends AbstractSpecification<PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapie> {

    public PrescriptionRadiotherapieSpecification(PrescriptionRadiotherapieCriteria criteria) {
        super(criteria);
    }

    public PrescriptionRadiotherapieSpecification(PrescriptionRadiotherapieCriteria criteria, boolean distinct) {
        super(criteria, distinct);
    }


    @Override
    public Predicate toPredicate(Root<PrescriptionRadiotherapie> root, CriteriaQuery<?> query, CriteriaBuilder builder) {
        List<Predicate> predicates = new ArrayList<>();
            attachSearchElement(root, query, builder, predicates);
            if (criteria != null) {
             addPredicateId("id", criteria);
             addPredicate("datePrescription", criteria.getDatePrescription(), criteria.getDatePrescriptionFrom(), criteria.getDatePrescriptionTo());
             addPredicateBool("rcc", criteria.getRcc());
             addPredicateBigDecimal("dose", criteria.getDose());
             addPredicateBigDecimal("dose", criteria.getDoseMin(), criteria.getDoseMax());
             addPredicateInt("fractionnement", criteria.getFractionnement());
             addPredicateInt("fractionnement", criteria.getFractionnementMin(), criteria.getFractionnementMax());
             addPredicateInt("etalement", criteria.getEtalement());
             addPredicateInt("etalement", criteria.getEtalementMin(), criteria.getEtalementMax());
             addPredicate("frequenceRadiotherapie", criteria.getFrequenceRadiotherapie(),criteria.getFrequenceRadiotherapieLike());
             addPredicate("dateSouhaiteDebutTraitement", criteria.getDateSouhaiteDebutTraitement(), criteria.getDateSouhaiteDebutTraitementFrom(), criteria.getDateSouhaiteDebutTraitementTo());
             addPredicate("statutRadiotherapie", criteria.getStatutRadiotherapie(),criteria.getStatutRadiotherapieLike());
             addPredicate("dateSimulation", criteria.getDateSimulation(), criteria.getDateSimulationFrom(), criteria.getDateSimulationTo());
             addPredicate("immobilistion", criteria.getImmobilistion(),criteria.getImmobilistionLike());
             addPredicate("positionnement", criteria.getPositionnement(),criteria.getPositionnementLike());
             addPredicate("fichierTraitements", criteria.getFichierTraitements(),criteria.getFichierTraitementsLike());
             addPredicate("validateurSimulationDate", criteria.getValidateurSimulationDate(), criteria.getValidateurSimulationDateFrom(), criteria.getValidateurSimulationDateTo());
             addPredicate("datePrevu", criteria.getDatePrevu(), criteria.getDatePrevuFrom(), criteria.getDatePrevuTo());
             addPredicate("dateDebutTraitement", criteria.getDateDebutTraitement(), criteria.getDateDebutTraitementFrom(), criteria.getDateDebutTraitementTo());
             addPredicate("dateFinTraitement", criteria.getDateFinTraitement(), criteria.getDateFinTraitementFrom(), criteria.getDateFinTraitementTo());
             addPredicate("dateDecisionTraitement", criteria.getDateDecisionTraitement(), criteria.getDateDecisionTraitementFrom(), criteria.getDateDecisionTraitementTo());
             addPredicate("compteRendu", criteria.getCompteRendu(),criteria.getCompteRenduLike());
             addPredicateBool("actif", criteria.getActif());
             addPredicateInt("nombreSeanceRealise", criteria.getNombreSeanceRealise());
             addPredicateInt("nombreSeanceRealise", criteria.getNombreSeanceRealiseMin(), criteria.getNombreSeanceRealiseMax());
             addPredicateInt("nombreTotalSeance", criteria.getNombreTotalSeance());
             addPredicateInt("nombreTotalSeance", criteria.getNombreTotalSeanceMin(), criteria.getNombreTotalSeanceMax());
             addPredicate("typeTraitement", criteria.getTypeTraitement(),criteria.getTypeTraitementLike());
            addPredicate("decisiontraitement.id", criteria.getDecisiontraitement());
            addPredicate("decisiontraitement.id", criteria.getDecisiontraitements());
            addPredicate("medecinPrescripteur.id", criteria.getMedecinPrescripteur());
            addPredicate("medecinPrescripteur.id", criteria.getMedecinPrescripteurs());
            addPredicate("site.id", criteria.getSite());
            addPredicate("site.id", criteria.getSites());
            addPredicate("modaliteRadiotherapie.id", criteria.getModaliteRadiotherapie());
            addPredicate("modaliteRadiotherapie.id", criteria.getModaliteRadiotherapies());
            addPredicate("visee.id", criteria.getVisee());
            addPredicate("visee.id", criteria.getVisees());
            addPredicate("protocoleInclusion.id", criteria.getProtocoleInclusion());
            addPredicate("protocoleInclusion.id", criteria.getProtocoleInclusions());
            addPredicate("validateurSimulation.id", criteria.getValidateurSimulation());
            addPredicate("validateurSimulation.id", criteria.getValidateurSimulations());
            addPredicate("patient.id", criteria.getPatient());
            addPredicate("patient.id", criteria.getPatients());
            addOrderAndFilter();
          }
        return getResult();
    }

}
