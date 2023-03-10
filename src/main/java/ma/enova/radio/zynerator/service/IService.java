package ma.enova.radio.zynerator.service;

import ma.enova.radio.zynerator.bean.BusinessObject;
import ma.enova.radio.zynerator.criteria.BaseCriteria;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.dto.BaseDto;

import java.util.List;

public interface IService<T extends BusinessObject, DTO extends BaseDto, Criteria extends BaseCriteria, HistoryCriteria> {


    T create(T t);

    DTO update(DTO dto);

    T findById(Long id);

    T findWithAssociatedLists(Long id);

    void deleteWithAssociatedLists(T t);

    void updateWithAssociatedLists(T t);

    List<T> findByCriteria(Criteria critera);

    List<T> findPaginatedByCriteria(Criteria critera, int page, int pageSize, String order, String sortField);

    int getDataSize(Criteria criteria);

    void delete(List<T> ts);


    // History

    AuditEntityDto findHistoryById(Long id);

    List<AuditEntityDto> findHistoryByCriteria(HistoryCriteria historyCriteria);

    List<AuditEntityDto> findHistoryPaginatedByCriteria(HistoryCriteria historyCriteria, int page, int pageSize, String order, String sortField);

    int getHistoryDataSize(HistoryCriteria historyCriteria);


}
