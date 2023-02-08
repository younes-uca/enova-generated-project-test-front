package ma.enova.radio.dao.facade.history;

import ma.enova.radio.zynerator.repository.AbstractHistoryRepository;
import ma.enova.radio.bean.history.ModaliteRadiotherapieHistory;
import org.springframework.stereotype.Repository;

@Repository
public interface ModaliteRadiotherapieHistoryDao extends AbstractHistoryRepository<ModaliteRadiotherapieHistory,Long> {

}
