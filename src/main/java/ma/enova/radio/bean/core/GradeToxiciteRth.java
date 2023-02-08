package ma.enova.radio.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "grade_toxicite_rth")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="grade_toxicite_rth_seq",sequenceName="grade_toxicite_rth_seq",allocationSize=1, initialValue = 1)
public class GradeToxiciteRth   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Column(columnDefinition = "boolean default false")
    private Boolean actif = false;
    @Column(length = 500)
    private String hl7;
    private Long ordre ;

    private Services services ;


    public GradeToxiciteRth(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="grade_toxicite_rth_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public String getCode(){
        return this.code;
    }
    public void setCode(String code){
        this.code = code;
    }
    public String getLibelle(){
        return this.libelle;
    }
    public void setLibelle(String libelle){
        this.libelle = libelle;
    }
    public Boolean  getActif(){
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
    public Long getOrdre(){
        return this.ordre;
    }
    public void setOrdre(Long ordre){
        this.ordre = ordre;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public Services getServices(){
        return this.services;
    }
    public void setServices(Services services){
        this.services = services;
    }

    @Transient
    public String getLabel() {
        label = libelle;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GradeToxiciteRth gradeToxiciteRth = (GradeToxiciteRth) o;
        return id != null && id.equals(gradeToxiciteRth.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

