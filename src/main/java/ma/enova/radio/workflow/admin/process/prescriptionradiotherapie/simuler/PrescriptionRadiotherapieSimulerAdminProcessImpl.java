package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieSimulerAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput> implements PrescriptionRadiotherapieSimulerAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapieSimulerAdminOutput output) {
        
    }

    @Override
    public void validate(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapieSimulerAdminOutput output, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieSimulerAdminInput input, PrescriptionRadiotherapieSimulerAdminOutput output, Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieSimulerAdminProcessImpl(PrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
