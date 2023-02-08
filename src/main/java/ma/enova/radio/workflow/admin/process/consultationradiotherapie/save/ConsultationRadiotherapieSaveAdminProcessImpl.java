package ma.enova.radio.workflow.admin.process.consultationradiotherapie.save;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class ConsultationRadiotherapieSaveAdminProcessImpl extends AbstractProcessImpl<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput> implements ConsultationRadiotherapieSaveAdminProcess {

    @Override
    public void init(ConsultationRadiotherapieSaveAdminInput input, ConsultationRadiotherapieSaveAdminOutput output) {
        
    }

    @Override
    public void validate(ConsultationRadiotherapieSaveAdminInput input, ConsultationRadiotherapieSaveAdminOutput output, Result<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput> result) {
        
    }

    @Override
    public void run(ConsultationRadiotherapieSaveAdminInput input, ConsultationRadiotherapieSaveAdminOutput output, Result<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput> result) {
        
    }
    


    private ConsultationRadiotherapieAdminService service;
    public ConsultationRadiotherapieSaveAdminProcessImpl(ConsultationRadiotherapieAdminService service) {
        this.service = service;
    }

}
