package ma.enova.radio.dao.facade.core;



import ma.enova.radio.zynerator.repository.AbstractRepository;
import ma.enova.radio.bean.core.Patient;
import org.springframework.stereotype.Repository;
import ma.enova.radio.bean.core.Patient;

import java.util.List;


@Repository
public interface PatientDao extends AbstractRepository<Patient,Long> {
    Patient findByIpp(String ipp);
    int deleteByIpp(String ipp);

}
