package ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validateradiotherapeute;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PrescriptionRadiotherapieValidateRadiotherapeuteAdminInjector{

    @Bean
    public PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcess prescriptionRadiotherapieValidateRadiotherapeuteAdmin(PrescriptionRadiotherapieAdminService service) {
        return new PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcessImpl(service);
    }

}
