package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput> implements PrescriptionRadiotherapieValidatePhysicienAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapieValidatePhysicienAdminOutput output) {
        
    }

    @Override
    public void validate(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapieValidatePhysicienAdminOutput output, Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieValidatePhysicienAdminInput input, PrescriptionRadiotherapieValidatePhysicienAdminOutput output, Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieValidatePhysicienAdminProcessImpl(PrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
