package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.ModaliteRadiotherapie;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.ModaliteRadiotherapie;

import java.util.List;


@Repository
public interface ModaliteRadiotherapieDao extends AbstractRepository<ModaliteRadiotherapie,Long> {
    ModaliteRadiotherapie findByCode(String code);
    int deleteByCode(String code);

    List<ModaliteRadiotherapie> findByServicesId(Long id);
    int deleteByServicesId(Long id);
}
