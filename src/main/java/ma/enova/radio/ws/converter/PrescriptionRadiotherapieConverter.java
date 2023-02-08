package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ma.enova.radio.zynerator.util.ListUtil;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;

@Component
public class PrescriptionRadiotherapieConverter extends AbstractConverter<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto, PrescriptionRadiotherapieHistory> {

    @Autowired
    private GradeToxiciteRthConverter gradeToxiciteRthConverter ;
    @Autowired
    private PersonnelConverter personnelConverter ;
    @Autowired
    private SiteConverter siteConverter ;
    @Autowired
    private ConsultationRadiotherapieConverter consultationRadiotherapieConverter ;
    @Autowired
    private DecisiontraitementConverter decisiontraitementConverter ;
    @Autowired
    private PatientConverter patientConverter ;
    @Autowired
    private ViseeConverter viseeConverter ;
    @Autowired
    private ProtocoleInclusionConverter protocoleInclusionConverter ;
    @Autowired
    private SeanceRadiotherapieConverter seanceRadiotherapieConverter ;
    @Autowired
    private ModaliteRadiotherapieConverter modaliteRadiotherapieConverter ;
    @Autowired
    private TypeToxiciteRthConverter typeToxiciteRthConverter ;
    @Autowired
    private TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter ;
    private boolean decisiontraitement;
    private boolean medecinPrescripteur;
    private boolean site;
    private boolean modaliteRadiotherapie;
    private boolean visee;
    private boolean protocoleInclusion;
    private boolean validateurSimulation;
    private boolean patient;
    private boolean consultationRadiotherapies;
    private boolean seanceRadiotherapies;

    public  PrescriptionRadiotherapieConverter(){
        super(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieDto.class, PrescriptionRadiotherapieHistory.class);
        init(true);
    }

    @Override
    public PrescriptionRadiotherapie toItem(PrescriptionRadiotherapieDto dto) {
        if (dto == null) {
            return null;
        } else {
        PrescriptionRadiotherapie item = new PrescriptionRadiotherapie();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getDatePrescription()))
                item.setDatePrescription(DateUtil.stringEnToDate(dto.getDatePrescription()));
            if(dto.getRcc() != null)
                item.setRcc(dto.getRcc());
            if(StringUtil.isNotEmpty(dto.getDose()))
                item.setDose(dto.getDose());
            if(StringUtil.isNotEmpty(dto.getFractionnement()))
                item.setFractionnement(dto.getFractionnement());
            if(StringUtil.isNotEmpty(dto.getEtalement()))
                item.setEtalement(dto.getEtalement());
            if(StringUtil.isNotEmpty(dto.getFrequenceRadiotherapie()))
                item.setFrequenceRadiotherapie(dto.getFrequenceRadiotherapie());
            if(StringUtil.isNotEmpty(dto.getDateSouhaiteDebutTraitement()))
                item.setDateSouhaiteDebutTraitement(DateUtil.stringEnToDate(dto.getDateSouhaiteDebutTraitement()));
            if(StringUtil.isNotEmpty(dto.getObservation()))
                item.setObservation(dto.getObservation());
            if(StringUtil.isNotEmpty(dto.getStatutRadiotherapie()))
                item.setStatutRadiotherapie(dto.getStatutRadiotherapie());
            if(StringUtil.isNotEmpty(dto.getDateSimulation()))
                item.setDateSimulation(DateUtil.stringEnToDate(dto.getDateSimulation()));
            if(StringUtil.isNotEmpty(dto.getImmobilistion()))
                item.setImmobilistion(dto.getImmobilistion());
            if(StringUtil.isNotEmpty(dto.getPositionnement()))
                item.setPositionnement(dto.getPositionnement());
            if(StringUtil.isNotEmpty(dto.getFichierTraitements()))
                item.setFichierTraitements(dto.getFichierTraitements());
            if(StringUtil.isNotEmpty(dto.getValidateurSimulationDate()))
                item.setValidateurSimulationDate(DateUtil.stringEnToDate(dto.getValidateurSimulationDate()));
            if(StringUtil.isNotEmpty(dto.getDatePrevu()))
                item.setDatePrevu(DateUtil.stringEnToDate(dto.getDatePrevu()));
            if(StringUtil.isNotEmpty(dto.getDateDebutTraitement()))
                item.setDateDebutTraitement(DateUtil.stringEnToDate(dto.getDateDebutTraitement()));
            if(StringUtil.isNotEmpty(dto.getDateFinTraitement()))
                item.setDateFinTraitement(DateUtil.stringEnToDate(dto.getDateFinTraitement()));
            if(StringUtil.isNotEmpty(dto.getDateDecisionTraitement()))
                item.setDateDecisionTraitement(DateUtil.stringEnToDate(dto.getDateDecisionTraitement()));
            if(StringUtil.isNotEmpty(dto.getCompteRendu()))
                item.setCompteRendu(dto.getCompteRendu());
            if(dto.getActif() != null)
                item.setActif(dto.getActif());
            if(StringUtil.isNotEmpty(dto.getNombreSeanceRealise()))
                item.setNombreSeanceRealise(dto.getNombreSeanceRealise());
            if(StringUtil.isNotEmpty(dto.getNombreTotalSeance()))
                item.setNombreTotalSeance(dto.getNombreTotalSeance());
            if(StringUtil.isNotEmpty(dto.getTypeTraitement()))
                item.setTypeTraitement(dto.getTypeTraitement());
            if(this.decisiontraitement && dto.getDecisiontraitement()!=null)
                item.setDecisiontraitement(decisiontraitementConverter.toItem(dto.getDecisiontraitement())) ;

            if(this.medecinPrescripteur && dto.getMedecinPrescripteur()!=null)
                item.setMedecinPrescripteur(personnelConverter.toItem(dto.getMedecinPrescripteur())) ;

            if(this.site && dto.getSite()!=null)
                item.setSite(siteConverter.toItem(dto.getSite())) ;

            if(this.modaliteRadiotherapie && dto.getModaliteRadiotherapie()!=null)
                item.setModaliteRadiotherapie(modaliteRadiotherapieConverter.toItem(dto.getModaliteRadiotherapie())) ;

            if(this.visee && dto.getVisee()!=null)
                item.setVisee(viseeConverter.toItem(dto.getVisee())) ;

            if(this.protocoleInclusion && dto.getProtocoleInclusion()!=null)
                item.setProtocoleInclusion(protocoleInclusionConverter.toItem(dto.getProtocoleInclusion())) ;

            if(this.validateurSimulation && dto.getValidateurSimulation()!=null)
                item.setValidateurSimulation(personnelConverter.toItem(dto.getValidateurSimulation())) ;

            if(this.patient && dto.getPatient()!=null)
                item.setPatient(patientConverter.toItem(dto.getPatient())) ;


            if(this.consultationRadiotherapies && ListUtil.isNotEmpty(dto.getConsultationRadiotherapies()))
                item.setConsultationRadiotherapies(consultationRadiotherapieConverter.toItem(dto.getConsultationRadiotherapies()));
            if(this.seanceRadiotherapies && ListUtil.isNotEmpty(dto.getSeanceRadiotherapies()))
                item.setSeanceRadiotherapies(seanceRadiotherapieConverter.toItem(dto.getSeanceRadiotherapies()));

        return item;
        }
    }

    @Override
    public PrescriptionRadiotherapieDto toDto(PrescriptionRadiotherapie item) {
        if (item == null) {
            return null;
        } else {
    PrescriptionRadiotherapieDto dto = new PrescriptionRadiotherapieDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(item.getDatePrescription()!=null)
             dto.setDatePrescription(DateUtil.dateTimeToString(item.getDatePrescription()));
            dto.setRcc(item.getRcc());
        if(StringUtil.isNotEmpty(item.getDose()))
             dto.setDose(item.getDose());
        if(StringUtil.isNotEmpty(item.getFractionnement()))
             dto.setFractionnement(item.getFractionnement());
        if(StringUtil.isNotEmpty(item.getEtalement()))
             dto.setEtalement(item.getEtalement());
        if(StringUtil.isNotEmpty(item.getFrequenceRadiotherapie()))
             dto.setFrequenceRadiotherapie(item.getFrequenceRadiotherapie());
        if(item.getDateSouhaiteDebutTraitement()!=null)
             dto.setDateSouhaiteDebutTraitement(DateUtil.dateTimeToString(item.getDateSouhaiteDebutTraitement()));
        if(StringUtil.isNotEmpty(item.getObservation()))
             dto.setObservation(item.getObservation());
        if(StringUtil.isNotEmpty(item.getStatutRadiotherapie()))
             dto.setStatutRadiotherapie(item.getStatutRadiotherapie());
        if(item.getDateSimulation()!=null)
             dto.setDateSimulation(DateUtil.dateTimeToString(item.getDateSimulation()));
        if(StringUtil.isNotEmpty(item.getImmobilistion()))
             dto.setImmobilistion(item.getImmobilistion());
        if(StringUtil.isNotEmpty(item.getPositionnement()))
             dto.setPositionnement(item.getPositionnement());
        if(StringUtil.isNotEmpty(item.getFichierTraitements()))
             dto.setFichierTraitements(item.getFichierTraitements());
        if(item.getValidateurSimulationDate()!=null)
             dto.setValidateurSimulationDate(DateUtil.dateTimeToString(item.getValidateurSimulationDate()));
        if(item.getDatePrevu()!=null)
             dto.setDatePrevu(DateUtil.dateTimeToString(item.getDatePrevu()));
        if(item.getDateDebutTraitement()!=null)
             dto.setDateDebutTraitement(DateUtil.dateTimeToString(item.getDateDebutTraitement()));
        if(item.getDateFinTraitement()!=null)
             dto.setDateFinTraitement(DateUtil.dateTimeToString(item.getDateFinTraitement()));
        if(item.getDateDecisionTraitement()!=null)
             dto.setDateDecisionTraitement(DateUtil.dateTimeToString(item.getDateDecisionTraitement()));
        if(StringUtil.isNotEmpty(item.getCompteRendu()))
             dto.setCompteRendu(item.getCompteRendu());
            dto.setActif(item.getActif());
        if(StringUtil.isNotEmpty(item.getNombreSeanceRealise()))
             dto.setNombreSeanceRealise(item.getNombreSeanceRealise());
        if(StringUtil.isNotEmpty(item.getNombreTotalSeance()))
             dto.setNombreTotalSeance(item.getNombreTotalSeance());
        if(StringUtil.isNotEmpty(item.getTypeTraitement()))
             dto.setTypeTraitement(item.getTypeTraitement());
        if(this.decisiontraitement && item.getDecisiontraitement()!=null) {
            dto.setDecisiontraitementDto(decisiontraitementConverter.toDto(item.getDecisiontraitement())) ;
        }
        if(this.medecinPrescripteur && item.getMedecinPrescripteur()!=null) {
            dto.setMedecinPrescripteurDto(personnelConverter.toDto(item.getMedecinPrescripteur())) ;
        }
        if(this.site && item.getSite()!=null) {
            dto.setSiteDto(siteConverter.toDto(item.getSite())) ;
        }
        if(this.modaliteRadiotherapie && item.getModaliteRadiotherapie()!=null) {
            dto.setModaliteRadiotherapieDto(modaliteRadiotherapieConverter.toDto(item.getModaliteRadiotherapie())) ;
        }
        if(this.visee && item.getVisee()!=null) {
            dto.setViseeDto(viseeConverter.toDto(item.getVisee())) ;
        }
        if(this.protocoleInclusion && item.getProtocoleInclusion()!=null) {
            dto.setProtocoleInclusionDto(protocoleInclusionConverter.toDto(item.getProtocoleInclusion())) ;
        }
        if(this.validateurSimulation && item.getValidateurSimulation()!=null) {
            dto.setValidateurSimulationDto(personnelConverter.toDto(item.getValidateurSimulation())) ;
        }
        if(this.patient && item.getPatient()!=null) {
            dto.setPatientDto(patientConverter.toDto(item.getPatient())) ;
        }
        if(this.consultationRadiotherapies && ListUtil.isNotEmpty(item.getConsultationRadiotherapies())){
            consultationRadiotherapieConverter.init(true);
            consultationRadiotherapieConverter.setPrescriptionRadiotherapie(false);
            dto.setConsultationRadiotherapies(consultationRadiotherapieConverter.toDto(item.getConsultationRadiotherapies()));
            consultationRadiotherapieConverter.setPrescriptionRadiotherapie(true);

        }
        if(this.seanceRadiotherapies && ListUtil.isNotEmpty(item.getSeanceRadiotherapies())){
            seanceRadiotherapieConverter.init(true);
            seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
            dto.setSeanceRadiotherapies(seanceRadiotherapieConverter.toDto(item.getSeanceRadiotherapies()));
            seanceRadiotherapieConverter.setPrescriptionRadiotherapie(true);

        }
        return dto;
        }
    }

    public void initList(boolean value) {
        this.consultationRadiotherapies = value;
        this.seanceRadiotherapies = value;
    }

    public void init(boolean value) {
        initList(value);
    }

    public GradeToxiciteRthConverter getGradeToxiciteRthConverter(){
        return this.gradeToxiciteRthConverter;
    }
    public void setGradeToxiciteRthConverter(GradeToxiciteRthConverter gradeToxiciteRthConverter ){
        this.gradeToxiciteRthConverter = gradeToxiciteRthConverter;
    }
    public PersonnelConverter getPersonnelConverter(){
        return this.personnelConverter;
    }
    public void setPersonnelConverter(PersonnelConverter personnelConverter ){
        this.personnelConverter = personnelConverter;
    }
    public SiteConverter getSiteConverter(){
        return this.siteConverter;
    }
    public void setSiteConverter(SiteConverter siteConverter ){
        this.siteConverter = siteConverter;
    }
    public ConsultationRadiotherapieConverter getConsultationRadiotherapieConverter(){
        return this.consultationRadiotherapieConverter;
    }
    public void setConsultationRadiotherapieConverter(ConsultationRadiotherapieConverter consultationRadiotherapieConverter ){
        this.consultationRadiotherapieConverter = consultationRadiotherapieConverter;
    }
    public DecisiontraitementConverter getDecisiontraitementConverter(){
        return this.decisiontraitementConverter;
    }
    public void setDecisiontraitementConverter(DecisiontraitementConverter decisiontraitementConverter ){
        this.decisiontraitementConverter = decisiontraitementConverter;
    }
    public PatientConverter getPatientConverter(){
        return this.patientConverter;
    }
    public void setPatientConverter(PatientConverter patientConverter ){
        this.patientConverter = patientConverter;
    }
    public ViseeConverter getViseeConverter(){
        return this.viseeConverter;
    }
    public void setViseeConverter(ViseeConverter viseeConverter ){
        this.viseeConverter = viseeConverter;
    }
    public ProtocoleInclusionConverter getProtocoleInclusionConverter(){
        return this.protocoleInclusionConverter;
    }
    public void setProtocoleInclusionConverter(ProtocoleInclusionConverter protocoleInclusionConverter ){
        this.protocoleInclusionConverter = protocoleInclusionConverter;
    }
    public SeanceRadiotherapieConverter getSeanceRadiotherapieConverter(){
        return this.seanceRadiotherapieConverter;
    }
    public void setSeanceRadiotherapieConverter(SeanceRadiotherapieConverter seanceRadiotherapieConverter ){
        this.seanceRadiotherapieConverter = seanceRadiotherapieConverter;
    }
    public ModaliteRadiotherapieConverter getModaliteRadiotherapieConverter(){
        return this.modaliteRadiotherapieConverter;
    }
    public void setModaliteRadiotherapieConverter(ModaliteRadiotherapieConverter modaliteRadiotherapieConverter ){
        this.modaliteRadiotherapieConverter = modaliteRadiotherapieConverter;
    }
    public TypeToxiciteRthConverter getTypeToxiciteRthConverter(){
        return this.typeToxiciteRthConverter;
    }
    public void setTypeToxiciteRthConverter(TypeToxiciteRthConverter typeToxiciteRthConverter ){
        this.typeToxiciteRthConverter = typeToxiciteRthConverter;
    }
    public TypeConsultationRadiotherapieConverter getTypeConsultationRadiotherapieConverter(){
        return this.typeConsultationRadiotherapieConverter;
    }
    public void setTypeConsultationRadiotherapieConverter(TypeConsultationRadiotherapieConverter typeConsultationRadiotherapieConverter ){
        this.typeConsultationRadiotherapieConverter = typeConsultationRadiotherapieConverter;
    }


    public boolean  isDecisiontraitement(){
        return this.decisiontraitement;
    }
    public void  setDecisiontraitement(boolean decisiontraitement){
        this.decisiontraitement = decisiontraitement;
    }
    public boolean  isMedecinPrescripteur(){
        return this.medecinPrescripteur;
    }
    public void  setMedecinPrescripteur(boolean medecinPrescripteur){
        this.medecinPrescripteur = medecinPrescripteur;
    }
    public boolean  isSite(){
        return this.site;
    }
    public void  setSite(boolean site){
        this.site = site;
    }
    public boolean  isModaliteRadiotherapie(){
        return this.modaliteRadiotherapie;
    }
    public void  setModaliteRadiotherapie(boolean modaliteRadiotherapie){
        this.modaliteRadiotherapie = modaliteRadiotherapie;
    }
    public boolean  isVisee(){
        return this.visee;
    }
    public void  setVisee(boolean visee){
        this.visee = visee;
    }
    public boolean  isProtocoleInclusion(){
        return this.protocoleInclusion;
    }
    public void  setProtocoleInclusion(boolean protocoleInclusion){
        this.protocoleInclusion = protocoleInclusion;
    }
    public boolean  isValidateurSimulation(){
        return this.validateurSimulation;
    }
    public void  setValidateurSimulation(boolean validateurSimulation){
        this.validateurSimulation = validateurSimulation;
    }
    public boolean  isPatient(){
        return this.patient;
    }
    public void  setPatient(boolean patient){
        this.patient = patient;
    }
    public boolean  isConsultationRadiotherapies(){
        return this.consultationRadiotherapies ;
    }
    public void  setConsultationRadiotherapies(boolean consultationRadiotherapies ){
        this.consultationRadiotherapies  = consultationRadiotherapies ;
    }
    public boolean  isSeanceRadiotherapies(){
        return this.seanceRadiotherapies ;
    }
    public void  setSeanceRadiotherapies(boolean seanceRadiotherapies ){
        this.seanceRadiotherapies  = seanceRadiotherapies ;
    }
}
