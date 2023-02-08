package  ma.enova.radio.dao.criteria.core;




import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class ConsultationRadiotherapieCriteria extends BaseCriteria {

    private LocalDateTime dateConsultation;
    private LocalDateTime dateConsultationFrom;
    private LocalDateTime dateConsultationTo;
    private String classificationOms;
    private String classificationOmsLike;
    private String statutMedicale;
    private String statutMedicaleLike;

    private PersonnelCriteria medecin ;
    private List<PersonnelCriteria> medecins ;
    private TypeConsultationRadiotherapieCriteria typeConsultationRadiotherapie ;
    private List<TypeConsultationRadiotherapieCriteria> typeConsultationRadiotherapies ;
    private TypeToxiciteRthCriteria typeToxiciteRth ;
    private List<TypeToxiciteRthCriteria> typeToxiciteRths ;
    private GradeToxiciteRthCriteria gradeToxiciteRth ;
    private List<GradeToxiciteRthCriteria> gradeToxiciteRths ;
    private PrescriptionRadiotherapieCriteria prescriptionRadiotherapie ;
    private List<PrescriptionRadiotherapieCriteria> prescriptionRadiotherapies ;


    public ConsultationRadiotherapieCriteria(){}

    public LocalDateTime getDateConsultation(){
        return this.dateConsultation;
    }
    public void setDateConsultation(LocalDateTime dateConsultation){
        this.dateConsultation = dateConsultation;
    }
    public LocalDateTime getDateConsultationFrom(){
        return this.dateConsultationFrom;
    }
    public void setDateConsultationFrom(LocalDateTime dateConsultationFrom){
        this.dateConsultationFrom = dateConsultationFrom;
    }
    public LocalDateTime getDateConsultationTo(){
        return this.dateConsultationTo;
    }
    public void setDateConsultationTo(LocalDateTime dateConsultationTo){
        this.dateConsultationTo = dateConsultationTo;
    }
    public String getClassificationOms(){
        return this.classificationOms;
    }
    public void setClassificationOms(String classificationOms){
        this.classificationOms = classificationOms;
    }
    public String getClassificationOmsLike(){
        return this.classificationOmsLike;
    }
    public void setClassificationOmsLike(String classificationOmsLike){
        this.classificationOmsLike = classificationOmsLike;
    }

    public String getStatutMedicale(){
        return this.statutMedicale;
    }
    public void setStatutMedicale(String statutMedicale){
        this.statutMedicale = statutMedicale;
    }
    public String getStatutMedicaleLike(){
        return this.statutMedicaleLike;
    }
    public void setStatutMedicaleLike(String statutMedicaleLike){
        this.statutMedicaleLike = statutMedicaleLike;
    }



    public PersonnelCriteria getMedecin(){
        return this.medecin;
    }

    public void setMedecin(PersonnelCriteria medecin){
        this.medecin = medecin;
    }
    public List<PersonnelCriteria> getMedecins(){
        return this.medecins;
    }

    public void setMedecins(List<PersonnelCriteria> medecins){
        this.medecins = medecins;
    }

    public TypeConsultationRadiotherapieCriteria getTypeConsultationRadiotherapie(){
        return this.typeConsultationRadiotherapie;
    }

    public void setTypeConsultationRadiotherapie(TypeConsultationRadiotherapieCriteria typeConsultationRadiotherapie){
        this.typeConsultationRadiotherapie = typeConsultationRadiotherapie;
    }
    public List<TypeConsultationRadiotherapieCriteria> getTypeConsultationRadiotherapies(){
        return this.typeConsultationRadiotherapies;
    }

    public void setTypeConsultationRadiotherapies(List<TypeConsultationRadiotherapieCriteria> typeConsultationRadiotherapies){
        this.typeConsultationRadiotherapies = typeConsultationRadiotherapies;
    }

    public TypeToxiciteRthCriteria getTypeToxiciteRth(){
        return this.typeToxiciteRth;
    }

    public void setTypeToxiciteRth(TypeToxiciteRthCriteria typeToxiciteRth){
        this.typeToxiciteRth = typeToxiciteRth;
    }
    public List<TypeToxiciteRthCriteria> getTypeToxiciteRths(){
        return this.typeToxiciteRths;
    }

    public void setTypeToxiciteRths(List<TypeToxiciteRthCriteria> typeToxiciteRths){
        this.typeToxiciteRths = typeToxiciteRths;
    }

    public GradeToxiciteRthCriteria getGradeToxiciteRth(){
        return this.gradeToxiciteRth;
    }

    public void setGradeToxiciteRth(GradeToxiciteRthCriteria gradeToxiciteRth){
        this.gradeToxiciteRth = gradeToxiciteRth;
    }
    public List<GradeToxiciteRthCriteria> getGradeToxiciteRths(){
        return this.gradeToxiciteRths;
    }

    public void setGradeToxiciteRths(List<GradeToxiciteRthCriteria> gradeToxiciteRths){
        this.gradeToxiciteRths = gradeToxiciteRths;
    }

    public PrescriptionRadiotherapieCriteria getPrescriptionRadiotherapie(){
        return this.prescriptionRadiotherapie;
    }

    public void setPrescriptionRadiotherapie(PrescriptionRadiotherapieCriteria prescriptionRadiotherapie){
        this.prescriptionRadiotherapie = prescriptionRadiotherapie;
    }
    public List<PrescriptionRadiotherapieCriteria> getPrescriptionRadiotherapies(){
        return this.prescriptionRadiotherapies;
    }

    public void setPrescriptionRadiotherapies(List<PrescriptionRadiotherapieCriteria> prescriptionRadiotherapies){
        this.prescriptionRadiotherapies = prescriptionRadiotherapies;
    }
}
