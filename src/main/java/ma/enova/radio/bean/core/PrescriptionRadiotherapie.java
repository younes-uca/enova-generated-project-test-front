package ma.enova.radio.bean.core;

import java.util.Objects;
import java.util.List;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;




@Entity
@Table(name = "prescription_radiotherapie")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="prescription_radiotherapie_seq",sequenceName="prescription_radiotherapie_seq",allocationSize=1, initialValue = 1)
public class PrescriptionRadiotherapie   extends AuditBusinessObject  {

    private Long id;

    private LocalDateTime datePrescription ;
    @Column(columnDefinition = "boolean default false")
    private Boolean rcc = false;
    private BigDecimal dose = BigDecimal.ZERO;
    private Integer fractionnement = 0;
    private Integer etalement = 0;
    @Column(length = 500)
    private String frequenceRadiotherapie;
    private LocalDateTime dateSouhaiteDebutTraitement ;
    @Lob
    @Column(columnDefinition="TEXT")
    private String observation;
    @Column(length = 500)
    private String statutRadiotherapie;
    private LocalDateTime dateSimulation ;
    @Column(length = 500)
    private String immobilistion;
    @Column(length = 500)
    private String positionnement;
    @Column(length = 500)
    private String fichierTraitements;
    private LocalDateTime validateurSimulationDate ;
    private LocalDateTime datePrevu ;
    private LocalDateTime dateDebutTraitement ;
    private LocalDateTime dateFinTraitement ;
    private LocalDateTime dateDecisionTraitement ;
    @Column(length = 500)
    private String compteRendu;
    @Column(columnDefinition = "boolean default false")
    private Boolean actif = false;
    private Integer nombreSeanceRealise = 0;
    private Integer nombreTotalSeance = 0;
    @Column(length = 500)
    private String typeTraitement;

    private Decisiontraitement decisiontraitement ;
    private Personnel medecinPrescripteur ;
    private Site site ;
    private ModaliteRadiotherapie modaliteRadiotherapie ;
    private Visee visee ;
    private ProtocoleInclusion protocoleInclusion ;
    private Personnel validateurSimulation ;
    private Patient patient ;

    private List<ConsultationRadiotherapie> consultationRadiotherapies ;
    private List<SeanceRadiotherapie> seanceRadiotherapies ;

    public PrescriptionRadiotherapie(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="prescription_radiotherapie_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Decisiontraitement getDecisiontraitement(){
        return this.decisiontraitement;
    }
    public void setDecisiontraitement(Decisiontraitement decisiontraitement){
        this.decisiontraitement = decisiontraitement;
    }
    public LocalDateTime getDatePrescription(){
        return this.datePrescription;
    }
    public void setDatePrescription(LocalDateTime datePrescription){
        this.datePrescription = datePrescription;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Personnel getMedecinPrescripteur(){
        return this.medecinPrescripteur;
    }
    public void setMedecinPrescripteur(Personnel medecinPrescripteur){
        this.medecinPrescripteur = medecinPrescripteur;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Site getSite(){
        return this.site;
    }
    public void setSite(Site site){
        this.site = site;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ModaliteRadiotherapie getModaliteRadiotherapie(){
        return this.modaliteRadiotherapie;
    }
    public void setModaliteRadiotherapie(ModaliteRadiotherapie modaliteRadiotherapie){
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Visee getVisee(){
        return this.visee;
    }
    public void setVisee(Visee visee){
        this.visee = visee;
    }
    public Boolean  getRcc(){
        return this.rcc;
    }
    public void setRcc(Boolean rcc){
        this.rcc = rcc;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public ProtocoleInclusion getProtocoleInclusion(){
        return this.protocoleInclusion;
    }
    public void setProtocoleInclusion(ProtocoleInclusion protocoleInclusion){
        this.protocoleInclusion = protocoleInclusion;
    }
    public BigDecimal getDose(){
        return this.dose;
    }
    public void setDose(BigDecimal dose){
        this.dose = dose;
    }
    public Integer getFractionnement(){
        return this.fractionnement;
    }
    public void setFractionnement(Integer fractionnement){
        this.fractionnement = fractionnement;
    }
    public Integer getEtalement(){
        return this.etalement;
    }
    public void setEtalement(Integer etalement){
        this.etalement = etalement;
    }
    public String getFrequenceRadiotherapie(){
        return this.frequenceRadiotherapie;
    }
    public void setFrequenceRadiotherapie(String frequenceRadiotherapie){
        this.frequenceRadiotherapie = frequenceRadiotherapie;
    }
    public LocalDateTime getDateSouhaiteDebutTraitement(){
        return this.dateSouhaiteDebutTraitement;
    }
    public void setDateSouhaiteDebutTraitement(LocalDateTime dateSouhaiteDebutTraitement){
        this.dateSouhaiteDebutTraitement = dateSouhaiteDebutTraitement;
    }
    public String getObservation(){
        return this.observation;
    }
    public void setObservation(String observation){
        this.observation = observation;
    }
    public String getStatutRadiotherapie(){
        return this.statutRadiotherapie;
    }
    public void setStatutRadiotherapie(String statutRadiotherapie){
        this.statutRadiotherapie = statutRadiotherapie;
    }
    public LocalDateTime getDateSimulation(){
        return this.dateSimulation;
    }
    public void setDateSimulation(LocalDateTime dateSimulation){
        this.dateSimulation = dateSimulation;
    }
    public String getImmobilistion(){
        return this.immobilistion;
    }
    public void setImmobilistion(String immobilistion){
        this.immobilistion = immobilistion;
    }
    public String getPositionnement(){
        return this.positionnement;
    }
    public void setPositionnement(String positionnement){
        this.positionnement = positionnement;
    }
    public String getFichierTraitements(){
        return this.fichierTraitements;
    }
    public void setFichierTraitements(String fichierTraitements){
        this.fichierTraitements = fichierTraitements;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Personnel getValidateurSimulation(){
        return this.validateurSimulation;
    }
    public void setValidateurSimulation(Personnel validateurSimulation){
        this.validateurSimulation = validateurSimulation;
    }
    public LocalDateTime getValidateurSimulationDate(){
        return this.validateurSimulationDate;
    }
    public void setValidateurSimulationDate(LocalDateTime validateurSimulationDate){
        this.validateurSimulationDate = validateurSimulationDate;
    }
    @OneToMany(mappedBy = "prescriptionRadiotherapie")
    public List<ConsultationRadiotherapie> getConsultationRadiotherapies(){
        return this.consultationRadiotherapies;
    }
    public void setConsultationRadiotherapies(List<ConsultationRadiotherapie> consultationRadiotherapies){
        this.consultationRadiotherapies = consultationRadiotherapies;
    }
    public LocalDateTime getDatePrevu(){
        return this.datePrevu;
    }
    public void setDatePrevu(LocalDateTime datePrevu){
        this.datePrevu = datePrevu;
    }
    public LocalDateTime getDateDebutTraitement(){
        return this.dateDebutTraitement;
    }
    public void setDateDebutTraitement(LocalDateTime dateDebutTraitement){
        this.dateDebutTraitement = dateDebutTraitement;
    }
    public LocalDateTime getDateFinTraitement(){
        return this.dateFinTraitement;
    }
    public void setDateFinTraitement(LocalDateTime dateFinTraitement){
        this.dateFinTraitement = dateFinTraitement;
    }
    public LocalDateTime getDateDecisionTraitement(){
        return this.dateDecisionTraitement;
    }
    public void setDateDecisionTraitement(LocalDateTime dateDecisionTraitement){
        this.dateDecisionTraitement = dateDecisionTraitement;
    }
    public String getCompteRendu(){
        return this.compteRendu;
    }
    public void setCompteRendu(String compteRendu){
        this.compteRendu = compteRendu;
    }
    @OneToMany(mappedBy = "prescriptionRadiotherapie")
    public List<SeanceRadiotherapie> getSeanceRadiotherapies(){
        return this.seanceRadiotherapies;
    }
    public void setSeanceRadiotherapies(List<SeanceRadiotherapie> seanceRadiotherapies){
        this.seanceRadiotherapies = seanceRadiotherapies;
    }
    public Boolean  getActif(){
        return this.actif;
    }
    public void setActif(Boolean actif){
        this.actif = actif;
    }
    public Integer getNombreSeanceRealise(){
        return this.nombreSeanceRealise;
    }
    public void setNombreSeanceRealise(Integer nombreSeanceRealise){
        this.nombreSeanceRealise = nombreSeanceRealise;
    }
    public Integer getNombreTotalSeance(){
        return this.nombreTotalSeance;
    }
    public void setNombreTotalSeance(Integer nombreTotalSeance){
        this.nombreTotalSeance = nombreTotalSeance;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Patient getPatient(){
        return this.patient;
    }
    public void setPatient(Patient patient){
        this.patient = patient;
    }
    public String getTypeTraitement(){
        return this.typeTraitement;
    }
    public void setTypeTraitement(String typeTraitement){
        this.typeTraitement = typeTraitement;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PrescriptionRadiotherapie prescriptionRadiotherapie = (PrescriptionRadiotherapie) o;
        return id != null && id.equals(prescriptionRadiotherapie.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

