package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.DecisiontraitementHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface DecisiontraitementHistoryDao extends AbstractHistoryRepository<DecisiontraitementHistory,Long> {

}
