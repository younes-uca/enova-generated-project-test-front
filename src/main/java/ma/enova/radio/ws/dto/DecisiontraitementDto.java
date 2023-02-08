package  ma.enova.radio.ws.dto;

import ma.enova.radio.zynerator.audit.Log;
import ma.enova.radio.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.fasterxml.jackson.annotation.JsonFormat;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class DecisiontraitementDto  extends AuditBaseDto {

    private String code  ;
    private String datedecisiontraitement ;
    private String decisiontherapeutique  ;
    private Boolean urgence  ;



    public DecisiontraitementDto(){
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
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy HH:mm")
    public String getDatedecisiontraitement(){
        return this.datedecisiontraitement;
    }
    public void setDatedecisiontraitement(String datedecisiontraitement){
        this.datedecisiontraitement = datedecisiontraitement;
    }

    @Log
    public String getDecisiontherapeutique(){
        return this.decisiontherapeutique;
    }
    public void setDecisiontherapeutique(String decisiontherapeutique){
         this.decisiontherapeutique = decisiontherapeutique;
    }

    @Log
    public Boolean getUrgence(){
        return this.urgence;
    }
    public void setUrgence(Boolean urgence){
         this.urgence = urgence;
    }




}
