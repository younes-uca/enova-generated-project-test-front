package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput> implements PrescriptionRadiotherapieSaveAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapieSaveAdminOutput output) {
        
    }

    @Override
    public void validate(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapieSaveAdminOutput output, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieSaveAdminInput input, PrescriptionRadiotherapieSaveAdminOutput output, Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieSaveAdminProcessImpl(PrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
