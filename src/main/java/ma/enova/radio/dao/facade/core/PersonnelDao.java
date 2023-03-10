package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Personnel;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Personnel;

import java.util.List;


@Repository
public interface PersonnelDao extends AbstractRepository<Personnel,Long> {
    Personnel findByIpp(String ipp);
    int deleteByIpp(String ipp);

    List<Personnel> findByCategoriePersonnelId(Long id);
    int deleteByCategoriePersonnelId(Long id);
    List<Personnel> findBySpecialiteId(Long id);
    int deleteBySpecialiteId(Long id);
}
