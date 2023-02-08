package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.FrequenceRadiotherapie;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.FrequenceRadiotherapie;

import java.util.List;


@Repository
public interface FrequenceRadiotherapieDao extends AbstractRepository<FrequenceRadiotherapie,Long> {
    FrequenceRadiotherapie findByCode(String code);
    int deleteByCode(String code);

    List<FrequenceRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
