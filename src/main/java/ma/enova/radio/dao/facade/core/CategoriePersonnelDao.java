package ma.enova.radio.dao.facade.core;


import ma.enova.radio.bean.core.CategoriePersonnel;
import ma.enova.radio.zynerator.repository.AbstractRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface CategoriePersonnelDao extends AbstractRepository<CategoriePersonnel,Long> {
    CategoriePersonnel findByCode(String code);
    int deleteByCode(String code);

    List<CategoriePersonnel> findByServicesId(Long id);
    int deleteByServicesId(Long id);


    //@Query(value = "SELECT MAX(ordre) FROM CategoriePersonnel c where c.eta = :etablissementId")
   // public Long getMaxOrdre(@Param("etablissementId") Long etablissementId);
}
