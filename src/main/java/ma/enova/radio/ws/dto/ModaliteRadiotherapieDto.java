package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;



@JsonInclude(JsonInclude.Include.NON_NULL)
public class ModaliteRadiotherapieDto  extends AuditBaseDto {

    private String code  ;
    private String libelle  ;
    private String description  ;
    private Boolean actif  ;
    private String hl7  ;
    private Long ordre  ;

    private ServicesDto services ;


    public ModaliteRadiotherapieDto(){
        super();
    }



    @Log
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
         this.code = code;
    }

    @Log
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
         this.libelle = libelle;
    }

    @Log
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
         this.description = description;
    }

    @Log
    public Boolean getActif(){
        return this.actif;
    }
    public void setActif(Boolean actif){
         this.actif = actif;
    }

    @Log
    public String getHl7(){
        return this.hl7;
    }
    public void setHl7(String hl7){
         this.hl7 = hl7;
    }

    @Log
    public Long getOrdre(){
        return this.ordre;
    }
    public void setOrdre(Long ordre){
         this.ordre = ordre;
    }


    public ServicesDto getServices(){
        return this.services;
    }

    public void setServicesDto(ServicesDto services){
        this.services = services;
    }


}
