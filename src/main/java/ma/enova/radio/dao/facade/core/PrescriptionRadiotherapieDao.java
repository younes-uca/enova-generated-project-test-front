package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PrescriptionRadiotherapieDao extends AbstractRepository<PrescriptionRadiotherapie,Long> {

    List<PrescriptionRadiotherapie> findByDecisiontraitementId(Long id);
    int deleteByDecisiontraitementId(Long id);
    List<PrescriptionRadiotherapie> findByMedecinPrescripteurId(Long id);
    int deleteByMedecinPrescripteurId(Long id);
    List<PrescriptionRadiotherapie> findBySiteId(Long id);
    int deleteBySiteId(Long id);
    List<PrescriptionRadiotherapie> findByModaliteRadiotherapieId(Long id);
    int deleteByModaliteRadiotherapieId(Long id);
    List<PrescriptionRadiotherapie> findByViseeId(Long id);
    int deleteByViseeId(Long id);
    List<PrescriptionRadiotherapie> findByProtocoleInclusionId(Long id);
    int deleteByProtocoleInclusionId(Long id);
    List<PrescriptionRadiotherapie> findByValidateurSimulationId(Long id);
    int deleteByValidateurSimulationId(Long id);
    List<PrescriptionRadiotherapie> findByPatientId(Long id);
    int deleteByPatientId(Long id);
}
