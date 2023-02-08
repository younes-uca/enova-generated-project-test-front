package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieSuivreConsultationAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput> implements PrescriptionRadiotherapieSuivreConsultationAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSuivreConsultationAdminInput input, PrescriptionRadiotherapieSuivreConsultationAdminOutput output) {
        
    }

    @Override
    public void validate(PrescriptionRadiotherapieSuivreConsultationAdminInput input, PrescriptionRadiotherapieSuivreConsultationAdminOutput output, Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieSuivreConsultationAdminInput input, PrescriptionRadiotherapieSuivreConsultationAdminOutput output, Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieSuivreConsultationAdminProcessImpl(PrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
