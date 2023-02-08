package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Visee;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Visee;

import java.util.List;


@Repository
public interface ViseeDao extends AbstractRepository<Visee,Long> {
    Visee findByCode(String code);
    int deleteByCode(String code);

    List<Visee> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
