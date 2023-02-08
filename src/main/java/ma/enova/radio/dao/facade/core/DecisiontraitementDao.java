package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Decisiontraitement;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Decisiontraitement;

import java.util.List;


@Repository
public interface DecisiontraitementDao extends AbstractRepository<Decisiontraitement,Long> {
    Decisiontraitement findByCode(String code);
    int deleteByCode(String code);

}
