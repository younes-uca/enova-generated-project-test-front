package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Positionnement;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Positionnement;

import java.util.List;


@Repository
public interface PositionnementDao extends AbstractRepository<Positionnement,Long> {
    Positionnement findByCode(String code);
    int deleteByCode(String code);

    List<Positionnement> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
