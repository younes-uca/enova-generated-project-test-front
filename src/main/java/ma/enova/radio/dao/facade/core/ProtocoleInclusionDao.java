package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.ProtocoleInclusion;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.ProtocoleInclusion;

import java.util.List;


@Repository
public interface ProtocoleInclusionDao extends AbstractRepository<ProtocoleInclusion,Long> {
    ProtocoleInclusion findByCode(String code);
    int deleteByCode(String code);

    List<ProtocoleInclusion> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
