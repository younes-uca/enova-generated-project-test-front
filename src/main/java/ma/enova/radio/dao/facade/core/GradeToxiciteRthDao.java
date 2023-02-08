package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.GradeToxiciteRth;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.GradeToxiciteRth;

import java.util.List;


@Repository
public interface GradeToxiciteRthDao extends AbstractRepository<GradeToxiciteRth,Long> {
    GradeToxiciteRth findByCode(String code);
    int deleteByCode(String code);

    List<GradeToxiciteRth> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
