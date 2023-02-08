package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.CategoriePersonnel;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.CategoriePersonnel;

import java.util.List;


@Repository
public interface CategoriePersonnelDao extends AbstractRepository<CategoriePersonnel,Long> {
    CategoriePersonnel findByCode(String code);
    int deleteByCode(String code);

    List<CategoriePersonnel> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
