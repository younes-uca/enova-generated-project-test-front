package  ma.enova.radio.dao.criteria.core;




import ma.enova.radio.zynerator.criteria.BaseCriteria;
import java.util.List;



public class PositionnementCriteria extends BaseCriteria {

    private String code;
    private String codeLike;
    private String libelle;
    private String libelleLike;
    private Boolean actif;
    private String hl7;
    private String hl7Like;
    private String ordre;
    private String ordreMin;
    private String ordreMax;

    private ServicesCriteria services ;
    private List<ServicesCriteria> servicess ;


    public PositionnementCriteria(){}

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

    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public String getLibelleLike(){
        return this.libelleLike;
    }
    public void setLibelleLike(String libelleLike){
        this.libelleLike = libelleLike;
    }

    public Boolean getActif(){
        return this.actif;
    }
    public void setActif(Boolean actif){
        this.actif = actif;
    }
    public String getHl7(){
        return this.hl7;
    }
    public void setHl7(String hl7){
        this.hl7 = hl7;
    }
    public String getHl7Like(){
        return this.hl7Like;
    }
    public void setHl7Like(String hl7Like){
        this.hl7Like = hl7Like;
    }

    public String getOrdre(){
        return this.ordre;
    }
    public void setOrdre(String ordre){
        this.ordre = ordre;
    }   
    public String getOrdreMin(){
        return this.ordreMin;
    }
    public void setOrdreMin(String ordreMin){
        this.ordreMin = ordreMin;
    }
    public String getOrdreMax(){
        return this.ordreMax;
    }
    public void setOrdreMax(String ordreMax){
        this.ordreMax = ordreMax;
    }
      


    public ServicesCriteria getServices(){
        return this.services;
    }

    public void setServices(ServicesCriteria services){
        this.services = services;
    }
    public List<ServicesCriteria> getServicess(){
        return this.servicess;
    }

    public void setServicess(List<ServicesCriteria> servicess){
        this.servicess = servicess;
    }
}
