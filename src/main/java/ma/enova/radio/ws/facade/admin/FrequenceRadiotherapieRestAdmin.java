package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.FrequenceRadiotherapie;
import ma.enova.radio.bean.history.FrequenceRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.FrequenceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.FrequenceRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.FrequenceRadiotherapieAdminService;
import ma.enova.radio.ws.converter.FrequenceRadiotherapieConverter;
import ma.enova.radio.ws.dto.FrequenceRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages frequenceRadiotherapie services")
@RestController
@RequestMapping("/frequenceRadiotherapie")
public class FrequenceRadiotherapieRestAdmin  extends AbstractController<FrequenceRadiotherapie, FrequenceRadiotherapieDto, FrequenceRadiotherapieHistory, FrequenceRadiotherapieCriteria, FrequenceRadiotherapieHistoryCriteria, FrequenceRadiotherapieAdminService, FrequenceRadiotherapieConverter> {



    @ApiOperation("Finds a list of all frequenceRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<FrequenceRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  frequenceRadiotherapie")
    @PutMapping("")
    public ResponseEntity<FrequenceRadiotherapieDto> update(@RequestBody FrequenceRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a frequenceRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<FrequenceRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  frequenceRadiotherapie")
    @PostMapping("")
    public ResponseEntity<FrequenceRadiotherapieDto> save(@RequestBody FrequenceRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified frequenceRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<FrequenceRadiotherapieDto>> delete(@RequestBody List<FrequenceRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<FrequenceRadiotherapieDto>> findByCriteria(@RequestBody FrequenceRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody FrequenceRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportFrequenceRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody FrequenceRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getFrequenceRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody FrequenceRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histFrequenceRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody FrequenceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportFrequenceRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody FrequenceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistFrequenceRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody FrequenceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public FrequenceRadiotherapieRestAdmin (FrequenceRadiotherapieAdminService service, FrequenceRadiotherapieConverter converter) {
        super(service, converter);
    }

}