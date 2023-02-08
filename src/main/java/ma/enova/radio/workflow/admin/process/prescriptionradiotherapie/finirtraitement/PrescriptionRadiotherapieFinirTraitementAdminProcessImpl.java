package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;

import ma.enova.radio.zynerator.process.AbstractProcessImpl;
import ma.enova.radio.zynerator.process.Result;

public class PrescriptionRadiotherapieFinirTraitementAdminProcessImpl extends AbstractProcessImpl<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput> implements PrescriptionRadiotherapieFinirTraitementAdminProcess {

    @Override
    public void init(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapieFinirTraitementAdminOutput output) {
        
    }

    @Override
    public void validate(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapieFinirTraitementAdminOutput output, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput> result) {
        
    }

    @Override
    public void run(PrescriptionRadiotherapieFinirTraitementAdminInput input, PrescriptionRadiotherapieFinirTraitementAdminOutput output, Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput> result) {
        
    }
    


    private PrescriptionRadiotherapieAdminService service;
    public PrescriptionRadiotherapieFinirTraitementAdminProcessImpl(PrescriptionRadiotherapieAdminService service) {
        this.service = service;
    }

}
