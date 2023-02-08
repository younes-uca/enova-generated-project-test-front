package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Immobilistion;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Immobilistion;

import java.util.List;


@Repository
public interface ImmobilistionDao extends AbstractRepository<Immobilistion,Long> {
    Immobilistion findByCode(String code);
    int deleteByCode(String code);

    List<Immobilistion> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
