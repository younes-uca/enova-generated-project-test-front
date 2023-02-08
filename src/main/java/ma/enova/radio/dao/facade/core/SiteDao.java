package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Site;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Site;

import java.util.List;


@Repository
public interface SiteDao extends AbstractRepository<Site,Long> {
    Site findByCode(String code);
    int deleteByCode(String code);

    List<Site> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
