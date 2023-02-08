package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.TypeToxiciteRth;
import ma.enova.radio.bean.history.TypeToxiciteRthHistory;
import ma.enova.radio.dao.criteria.core.TypeToxiciteRthCriteria;
import ma.enova.radio.dao.criteria.history.TypeToxiciteRthHistoryCriteria;
import ma.enova.radio.dao.facade.core.TypeToxiciteRthDao;
import ma.enova.radio.dao.facade.history.TypeToxiciteRthHistoryDao;
import ma.enova.radio.dao.specification.core.TypeToxiciteRthSpecification;
import ma.enova.radio.service.facade.admin.TypeToxiciteRthAdminService;
import ma.enova.radio.ws.converter.TypeToxiciteRthConverter;
import ma.enova.radio.ws.dto.TypeToxiciteRthDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class TypeToxiciteRthAdminServiceImpl extends AbstractServiceImpl<TypeToxiciteRth, TypeToxiciteRthDto,TypeToxiciteRthHistory, TypeToxiciteRthCriteria, TypeToxiciteRthHistoryCriteria, TypeToxiciteRthDao,
TypeToxiciteRthHistoryDao, TypeToxiciteRthConverter> implements TypeToxiciteRthAdminService {

    public TypeToxiciteRthAdminServiceImpl(TypeToxiciteRthDao dao, TypeToxiciteRthHistoryDao historyDao, TypeToxiciteRthConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<TypeToxiciteRth> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(TypeToxiciteRth.class, TypeToxiciteRthDto.class, TypeToxiciteRthHistory.class, TypeToxiciteRthHistoryCriteria.class, TypeToxiciteRthSpecification.class);
    }




}