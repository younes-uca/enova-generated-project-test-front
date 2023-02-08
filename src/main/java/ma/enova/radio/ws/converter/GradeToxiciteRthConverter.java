package  ma.enova.radio.ws.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import ma.enova.radio.zynerator.util.StringUtil;
import ma.enova.radio.zynerator.converter.AbstractConverter;
import ma.enova.radio.zynerator.util.DateUtil;
import ma.enova.radio.bean.history.GradeToxiciteRthHistory;
import ma.enova.radio.bean.core.GradeToxiciteRth;
import ma.enova.radio.ws.dto.GradeToxiciteRthDto;

@Component
public class GradeToxiciteRthConverter extends AbstractConverter<GradeToxiciteRth, GradeToxiciteRthDto, GradeToxiciteRthHistory> {

    @Autowired
    private ServicesConverter servicesConverter ;
    private boolean services;

    public  GradeToxiciteRthConverter(){
        super(GradeToxiciteRth.class, GradeToxiciteRthDto.class, GradeToxiciteRthHistory.class);
    }

    @Override
    public GradeToxiciteRth toItem(GradeToxiciteRthDto dto) {
        if (dto == null) {
            return null;
        } else {
        GradeToxiciteRth item = new GradeToxiciteRth();
            if(StringUtil.isNotEmpty(dto.getId()))
                item.setId(dto.getId());
            if(StringUtil.isNotEmpty(dto.getCode()))
                item.setCode(dto.getCode());
            if(StringUtil.isNotEmpty(dto.getLibelle()))
                item.setLibelle(dto.getLibelle());
            if(dto.getActif() != null)
                item.setActif(dto.getActif());
            if(StringUtil.isNotEmpty(dto.getHl7()))
                item.setHl7(dto.getHl7());
            if(StringUtil.isNotEmpty(dto.getOrdre()))
                item.setOrdre(dto.getOrdre());
            if(this.services && dto.getServices()!=null)
                item.setServices(servicesConverter.toItem(dto.getServices())) ;



        return item;
        }
    }

    @Override
    public GradeToxiciteRthDto toDto(GradeToxiciteRth item) {
        if (item == null) {
            return null;
        } else {
    GradeToxiciteRthDto dto = new GradeToxiciteRthDto();
        if(StringUtil.isNotEmpty(item.getId()))
             dto.setId(item.getId());
        if(StringUtil.isNotEmpty(item.getCode()))
             dto.setCode(item.getCode());
        if(StringUtil.isNotEmpty(item.getLibelle()))
             dto.setLibelle(item.getLibelle());
            dto.setActif(item.getActif());
        if(StringUtil.isNotEmpty(item.getHl7()))
             dto.setHl7(item.getHl7());
        if(StringUtil.isNotEmpty(item.getOrdre()))
             dto.setOrdre(item.getOrdre());
        if(this.services && item.getServices()!=null) {
            dto.setServicesDto(servicesConverter.toDto(item.getServices())) ;
        }
        return dto;
        }
    }



    public ServicesConverter getServicesConverter(){
        return this.servicesConverter;
    }
    public void setServicesConverter(ServicesConverter servicesConverter ){
        this.servicesConverter = servicesConverter;
    }


    public boolean  isServices(){
        return this.services;
    }
    public void  setServices(boolean services){
        this.services = services;
    }
}
