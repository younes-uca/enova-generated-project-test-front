package  ma.enova.radio.dao.criteria.core;




import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonFormat;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.time.LocalDateTime;



public class DecisiontraitementCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private LocalDateTime datedecisiontraitement;
    private LocalDateTime datedecisiontraitementFrom;
    private LocalDateTime datedecisiontraitementTo;
    private String decisiontherapeutique;
    private String decisiontherapeutiqueLike;
    private Boolean urgence;



    public DecisiontraitementCriteria(){}

    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getCodeLike(){
        return this.codeLike;
    }
    public void setCodeLike(String codeLike){
        this.codeLike = codeLike;
    }

    public LocalDateTime getDatedecisiontraitement(){
        return this.datedecisiontraitement;
    }
    public void setDatedecisiontraitement(LocalDateTime datedecisiontraitement){
        this.datedecisiontraitement = datedecisiontraitement;
    }
    public LocalDateTime getDatedecisiontraitementFrom(){
        return this.datedecisiontraitementFrom;
    }
    public void setDatedecisiontraitementFrom(LocalDateTime datedecisiontraitementFrom){
        this.datedecisiontraitementFrom = datedecisiontraitementFrom;
    }
    public LocalDateTime getDatedecisiontraitementTo(){
        return this.datedecisiontraitementTo;
    }
    public void setDatedecisiontraitementTo(LocalDateTime datedecisiontraitementTo){
        this.datedecisiontraitementTo = datedecisiontraitementTo;
    }
    public String getDecisiontherapeutique(){
        return this.decisiontherapeutique;
    }
    public void setDecisiontherapeutique(String decisiontherapeutique){
        this.decisiontherapeutique = decisiontherapeutique;
    }
    public String getDecisiontherapeutiqueLike(){
        return this.decisiontherapeutiqueLike;
    }
    public void setDecisiontherapeutiqueLike(String decisiontherapeutiqueLike){
        this.decisiontherapeutiqueLike = decisiontherapeutiqueLike;
    }

    public Boolean getUrgence(){
        return this.urgence;
    }
    public void setUrgence(Boolean urgence){
        this.urgence = urgence;
    }

}
