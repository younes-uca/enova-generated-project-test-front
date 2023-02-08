package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.DecisiontraitementHistory;
import ma.enova.radio.bean.core.Decisiontraitement;
import ma.enova.radio.ws.dto.DecisiontraitementDto;

@Component
public class DecisiontraitementConverter extends AbstractConverter<Decisiontraitement, DecisiontraitementDto, DecisiontraitementHistory> {


    public  DecisiontraitementConverter(){
        super(Decisiontraitement.class, DecisiontraitementDto.class, DecisiontraitementHistory.class);
    }

    @Override
    public Decisiontraitement toItem(DecisiontraitementDto dto) {
        if (dto == null) {
            return null;
        } else {
        Decisiontraitement item = new Decisiontraitement();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getDatedecisiontraitement()))
                item.setDatedecisiontraitement(DateUtil.stringEnToDate(dto.getDatedecisiontraitement()));
            if(StringUtil.isNotEmpty(dto.getDecisiontherapeutique()))
                item.setDecisiontherapeutique(dto.getDecisiontherapeutique());
            if(dto.getUrgence() != null)
                item.setUrgence(dto.getUrgence());


        return item;
        }
    }

    @Override
    public DecisiontraitementDto toDto(Decisiontraitement item) {
        if (item == null) {
            return null;
        } else {
    DecisiontraitementDto dto = new DecisiontraitementDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(item.getDatedecisiontraitement()!=null)
             dto.setDatedecisiontraitement(DateUtil.dateTimeToString(item.getDatedecisiontraitement()));
        if(StringUtil.isNotEmpty(item.getDecisiontherapeutique()))
             dto.setDecisiontherapeutique(item.getDecisiontherapeutique());
            dto.setUrgence(item.getUrgence());
        return dto;
        }
    }





}
