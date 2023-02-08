package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validateradiotherapeute;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput> implements PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput input, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput output) {
        
    }

    @Override
    public void validate(PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput input, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput output, Result<PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput input, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput output, Result<PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcessImpl(PrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
