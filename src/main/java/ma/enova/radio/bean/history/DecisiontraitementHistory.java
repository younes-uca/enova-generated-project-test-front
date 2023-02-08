package ma.enova.radio.bean.history;

import com.fasterxml.jackson.annotation.JsonInclude;
import ma.enova.radio.zynerator.history.HistBusinessObject;
import javax.persistence.*;


@Entity
@Table(name = "decisiontraitement")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="decisiontraitement_seq",sequenceName="decisiontraitement_seq",allocationSize=1, initialValue = 1)
public class DecisiontraitementHistory extends HistBusinessObject  {


    public DecisiontraitementHistory() {
    super();
    }

    public DecisiontraitementHistory (Long id) {
    super(id);
    }

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="decisiontraitement_seq")
    public Long getId() {
    return id;
    }
}

