package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Specialite;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Specialite;

import java.util.List;


@Repository
public interface SpecialiteDao extends AbstractRepository<Specialite,Long> {
    Specialite findByCode(String code);
    int deleteByCode(String code);

    List<Specialite> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
