package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Services;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Services;

import java.util.List;


@Repository
public interface ServicesDao extends AbstractRepository<Services,Long> {
    Services findByCode(String code);
    int deleteByCode(String code);

}
