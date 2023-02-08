package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.PrescriptionRadiotherapieDao;
import ma.enova.radio.dao.facade.history.PrescriptionRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.PrescriptionRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.ws.converter.PrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;

import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService ;
import ma.enova.radio.ws.converter.ConsultationRadiotherapieConverter ;
import ma.enova.radio.service.facade.admin.SeanceRadiotherapieAdminService ;
import ma.enova.radio.ws.converter.SeanceRadiotherapieConverter ;

import java.util.List;

@Service
public class PrescriptionRadiotherapieAdminServiceImpl extends AbstractServiceImpl<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto,PrescriptionRadiotherapieHistory, PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria, PrescriptionRadiotherapieDao,
PrescriptionRadiotherapieHistoryDao, PrescriptionRadiotherapieConverter> implements PrescriptionRadiotherapieAdminService {

    private ConsultationRadiotherapieAdminService consultationRadiotherapieService ;
    private ConsultationRadiotherapieConverter consultationRadiotherapieConverter ;
    private SeanceRadiotherapieAdminService seanceRadiotherapieService ;
    private SeanceRadiotherapieConverter seanceRadiotherapieConverter ;
    public PrescriptionRadiotherapieAdminServiceImpl(PrescriptionRadiotherapieDao dao, PrescriptionRadiotherapieHistoryDao historyDao, PrescriptionRadiotherapieConverter converter, ConsultationRadiotherapieAdminService consultationRadiotherapieService , ConsultationRadiotherapieConverter consultationRadiotherapieConverter, SeanceRadiotherapieAdminService seanceRadiotherapieService , SeanceRadiotherapieConverter seanceRadiotherapieConverter) {
        super(dao, historyDao, converter);
        this.consultationRadiotherapieService = consultationRadiotherapieService;
        this.consultationRadiotherapieConverter = consultationRadiotherapieConverter;
        this.seanceRadiotherapieService = seanceRadiotherapieService;
        this.seanceRadiotherapieConverter = seanceRadiotherapieConverter;
    }

    public List<PrescriptionRadiotherapie> findByDecisiontraitementId(Long id){
        return dao.findByDecisiontraitementId(id);
    }
    public int deleteByDecisiontraitementId(Long id){
        return dao.deleteByDecisiontraitementId(id);
    }
    public List<PrescriptionRadiotherapie> findByMedecinPrescripteurId(Long id){
        return dao.findByMedecinPrescripteurId(id);
    }
    public int deleteByMedecinPrescripteurId(Long id){
        return dao.deleteByMedecinPrescripteurId(id);
    }
    public List<PrescriptionRadiotherapie> findBySiteId(Long id){
        return dao.findBySiteId(id);
    }
    public int deleteBySiteId(Long id){
        return dao.deleteBySiteId(id);
    }
    public List<PrescriptionRadiotherapie> findByModaliteRadiotherapieId(Long id){
        return dao.findByModaliteRadiotherapieId(id);
    }
    public int deleteByModaliteRadiotherapieId(Long id){
        return dao.deleteByModaliteRadiotherapieId(id);
    }
    public List<PrescriptionRadiotherapie> findByViseeId(Long id){
        return dao.findByViseeId(id);
    }
    public int deleteByViseeId(Long id){
        return dao.deleteByViseeId(id);
    }
    public List<PrescriptionRadiotherapie> findByProtocoleInclusionId(Long id){
        return dao.findByProtocoleInclusionId(id);
    }
    public int deleteByProtocoleInclusionId(Long id){
        return dao.deleteByProtocoleInclusionId(id);
    }
    public List<PrescriptionRadiotherapie> findByValidateurSimulationId(Long id){
        return dao.findByValidateurSimulationId(id);
    }
    public int deleteByValidateurSimulationId(Long id){
        return dao.deleteByValidateurSimulationId(id);
    }
    public List<PrescriptionRadiotherapie> findByPatientId(Long id){
        return dao.findByPatientId(id);
    }
    public int deleteByPatientId(Long id){
        return dao.deleteByPatientId(id);
    }


    public void configure() {
        super.configure(PrescriptionRadiotherapie.class, PrescriptionRadiotherapieDto.class, PrescriptionRadiotherapieHistory.class, PrescriptionRadiotherapieHistoryCriteria.class, PrescriptionRadiotherapieSpecification.class);
    }



    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, readOnly = false)
    public PrescriptionRadiotherapie create(PrescriptionRadiotherapie t) {
        super.create(t);

        consultationRadiotherapieConverter.setPrescriptionRadiotherapie(false);
        if (t.getConsultationRadiotherapies() != null) {
                t.getConsultationRadiotherapies().forEach(element-> {
                    element.setPrescriptionRadiotherapie(t);
                    consultationRadiotherapieService.create(element);
            });
        }
        seanceRadiotherapieConverter.setPrescriptionRadiotherapie(false);
        if (t.getSeanceRadiotherapies() != null) {
                t.getSeanceRadiotherapies().forEach(element-> {
                    element.setPrescriptionRadiotherapie(t);
                    seanceRadiotherapieService.create(element);
            });
        }
        return t;
    }

    public PrescriptionRadiotherapie findWithAssociatedLists(Long id){
        PrescriptionRadiotherapie result = dao.findById(id).orElse(null);
        if(result!=null && result.getId() != null) {
            result.setConsultationRadiotherapies(consultationRadiotherapieService.findByPrescriptionRadiotherapieId(id));
            result.setSeanceRadiotherapies(seanceRadiotherapieService.findByPrescriptionRadiotherapieId(id));
        }
        return result;
    }

    @Transactional
    public void deleteWithAssociatedLists(Long id){
        if(id != null ) {
            consultationRadiotherapieService.deleteByPrescriptionRadiotherapieId(id);
            seanceRadiotherapieService.deleteByPrescriptionRadiotherapieId(id);
            dao.deleteById(id);
        }
    }

    public void updateWithAssociatedLists(PrescriptionRadiotherapie prescriptionRadiotherapie){
    if(prescriptionRadiotherapie !=null && prescriptionRadiotherapie.getId() != null){
            //List<List<ConsultationRadiotherapie>> resultConsultationRadiotherapies= consultationRadiotherapieService.getToBeSavedAndToBeDeleted(consultationRadiotherapieService.findByPrescriptionRadiotherapieId(prescriptionRadiotherapie.getId()),prescriptionRadiotherapie.getConsultationRadiotherapies());
            //consultationRadiotherapieService.delete(resultConsultationRadiotherapies.get(1));
            //associateConsultationRadiotherapie(prescriptionRadiotherapie,resultConsultationRadiotherapies.get(0));
            //consultationRadiotherapieService.update(resultConsultationRadiotherapies.get(0));
            //List<List<SeanceRadiotherapie>> resultSeanceRadiotherapies= seanceRadiotherapieService.getToBeSavedAndToBeDeleted(seanceRadiotherapieService.findByPrescriptionRadiotherapieId(prescriptionRadiotherapie.getId()),prescriptionRadiotherapie.getSeanceRadiotherapies());
            //seanceRadiotherapieService.delete(resultSeanceRadiotherapies.get(1));
            //associateSeanceRadiotherapie(prescriptionRadiotherapie,resultSeanceRadiotherapies.get(0));
            //seanceRadiotherapieService.update(resultSeanceRadiotherapies.get(0));
    }
    }


}