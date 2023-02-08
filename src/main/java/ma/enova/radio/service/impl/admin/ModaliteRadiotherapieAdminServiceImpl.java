package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.ModaliteRadiotherapie;
import ma.enova.radio.bean.history.ModaliteRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.ModaliteRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ModaliteRadiotherapieHistoryCriteria;
import ma.enova.radio.dao.facade.core.ModaliteRadiotherapieDao;
import ma.enova.radio.dao.facade.history.ModaliteRadiotherapieHistoryDao;
import ma.enova.radio.dao.specification.core.ModaliteRadiotherapieSpecification;
import ma.enova.radio.service.facade.admin.ModaliteRadiotherapieAdminService;
import ma.enova.radio.ws.converter.ModaliteRadiotherapieConverter;
import ma.enova.radio.ws.dto.ModaliteRadiotherapieDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class ModaliteRadiotherapieAdminServiceImpl extends AbstractServiceImpl<ModaliteRadiotherapie, ModaliteRadiotherapieDto,ModaliteRadiotherapieHistory, ModaliteRadiotherapieCriteria, ModaliteRadiotherapieHistoryCriteria, ModaliteRadiotherapieDao,
ModaliteRadiotherapieHistoryDao, ModaliteRadiotherapieConverter> implements ModaliteRadiotherapieAdminService {

    public ModaliteRadiotherapieAdminServiceImpl(ModaliteRadiotherapieDao dao, ModaliteRadiotherapieHistoryDao historyDao, ModaliteRadiotherapieConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<ModaliteRadiotherapie> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(ModaliteRadiotherapie.class, ModaliteRadiotherapieDto.class, ModaliteRadiotherapieHistory.class, ModaliteRadiotherapieHistoryCriteria.class, ModaliteRadiotherapieSpecification.class);
    }




}