package ma.enova.radio.bean.core;

import java.util.Objects;

import java.time.LocalDateTime;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;



import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;






@Entity
@Table(name = "decisiontraitement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="decisiontraitement_seq",sequenceName="decisiontraitement_seq",allocationSize=1, initialValue = 1)
public class Decisiontraitement   extends AuditBusinessObject  {

    private Long id;

    @Column(length = 500)
    private String code;
    private LocalDateTime datedecisiontraitement ;
    @Column(length = 500)
    private String decisiontherapeutique;
    @Column(columnDefinition = "boolean default false")
    private Boolean urgence = false;



    public Decisiontraitement(){
        super();
    }




    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="decisiontraitement_seq")
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
    public LocalDateTime getDatedecisiontraitement(){
        return this.datedecisiontraitement;
    }
    public void setDatedecisiontraitement(LocalDateTime datedecisiontraitement){
        this.datedecisiontraitement = datedecisiontraitement;
    }
    public String getDecisiontherapeutique(){
        return this.decisiontherapeutique;
    }
    public void setDecisiontherapeutique(String decisiontherapeutique){
        this.decisiontherapeutique = decisiontherapeutique;
    }
    public Boolean  getUrgence(){
        return this.urgence;
    }
    public void setUrgence(Boolean urgence){
        this.urgence = urgence;
    }

    @Transient
    public String getLabel() {
        label = code;
        return label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Decisiontraitement decisiontraitement = (Decisiontraitement) o;
        return id != null && id.equals(decisiontraitement.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

