package ma.enova.radio.bean.core;

import java.util.Objects;





import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import ma.enova.radio.zynerator.audit.ReferentielBusinessObject;

import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "visee")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="visee_seq",sequenceName="visee_seq",allocationSize=1, initialValue = 1)
public class Visee   extends ReferentielBusinessObject {

    private Long id;

    @Column(length = 500)
    private String code;
    @Column(length = 500)
    private String libelle;
    @Lob
    @Column(columnDefinition="TEXT")
    private String description;
    @Column(columnDefinition = "boolean default false")
    private Boolean actif = false;
    @Column(length = 500)
    private String hl7;
    private Long ordre ;

    private Services services ;


    public Visee(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="visee_seq")
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
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
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
        Visee visee = (Visee) o;
        return id != null && id.equals(visee.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

