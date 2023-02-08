package ma.enova.radio.service.impl.admin;

import ma.enova.radio.bean.core.GradeToxiciteRth;
import ma.enova.radio.bean.history.GradeToxiciteRthHistory;
import ma.enova.radio.dao.criteria.core.GradeToxiciteRthCriteria;
import ma.enova.radio.dao.criteria.history.GradeToxiciteRthHistoryCriteria;
import ma.enova.radio.dao.facade.core.GradeToxiciteRthDao;
import ma.enova.radio.dao.facade.history.GradeToxiciteRthHistoryDao;
import ma.enova.radio.dao.specification.core.GradeToxiciteRthSpecification;
import ma.enova.radio.service.facade.admin.GradeToxiciteRthAdminService;
import ma.enova.radio.ws.converter.GradeToxiciteRthConverter;
import ma.enova.radio.ws.dto.GradeToxiciteRthDto;
import ma.enova.radio.zynerator.service.AbstractServiceImpl;
import org.springframework.stereotype.Service;
import java.util.List;


import java.util.List;

@Service
public class GradeToxiciteRthAdminServiceImpl extends AbstractServiceImpl<GradeToxiciteRth, GradeToxiciteRthDto,GradeToxiciteRthHistory, GradeToxiciteRthCriteria, GradeToxiciteRthHistoryCriteria, GradeToxiciteRthDao,
GradeToxiciteRthHistoryDao, GradeToxiciteRthConverter> implements GradeToxiciteRthAdminService {

    public GradeToxiciteRthAdminServiceImpl(GradeToxiciteRthDao dao, GradeToxiciteRthHistoryDao historyDao, GradeToxiciteRthConverter converter) {
        super(dao, historyDao, converter);
    }

    public List<GradeToxiciteRth> findByServicesId(Long id){
        return dao.findByServicesId(id);
    }
    public int deleteByServicesId(Long id){
        return dao.deleteByServicesId(id);
    }


    public void configure() {
        super.configure(GradeToxiciteRth.class, GradeToxiciteRthDto.class, GradeToxiciteRthHistory.class, GradeToxiciteRthHistoryCriteria.class, GradeToxiciteRthSpecification.class);
    }




}