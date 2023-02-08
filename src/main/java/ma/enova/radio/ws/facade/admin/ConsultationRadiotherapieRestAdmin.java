package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.ConsultationRadiotherapie;
import ma.enova.radio.bean.history.ConsultationRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.ConsultationRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ConsultationRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.ConsultationRadiotherapieAdminService;
import ma.enova.radio.ws.converter.ConsultationRadiotherapieConverter;
import ma.enova.radio.ws.dto.ConsultationRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.workflow.admin.process.consultationradiotherapie.save.ConsultationRadiotherapieSaveAdminProcess ;
import ma.enova.radio.workflow.admin.process.consultationradiotherapie.save.ConsultationRadiotherapieSaveAdminInput ;
import ma.enova.radio.workflow.admin.process.consultationradiotherapie.save.ConsultationRadiotherapieSaveAdminOutput ;

@Api("Manages consultationRadiotherapie services")
@RestController
@RequestMapping("/consultationRadiotherapie")
public class ConsultationRadiotherapieRestAdmin  extends AbstractController<ConsultationRadiotherapie, ConsultationRadiotherapieDto, ConsultationRadiotherapieHistory, ConsultationRadiotherapieCriteria, ConsultationRadiotherapieHistoryCriteria, ConsultationRadiotherapieAdminService, ConsultationRadiotherapieConverter> {

     @Autowired
     private ConsultationRadiotherapieSaveAdminProcess consultationRadiotherapieSaveAdminProcess;

    @ApiOperation("save a consultationRadiotherapie")
    @PostMapping("process/save")
    public ResponseEntity<Result<ConsultationRadiotherapieSaveAdminInput,ConsultationRadiotherapieSaveAdminOutput>> saveProcess(@RequestBody ConsultationRadiotherapieSaveAdminInput input) throws Exception {
        ConsultationRadiotherapieSaveAdminOutput output = new ConsultationRadiotherapieSaveAdminOutput();
        Result<ConsultationRadiotherapieSaveAdminInput, ConsultationRadiotherapieSaveAdminOutput> result = consultationRadiotherapieSaveAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("Finds a list of all consultationRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<ConsultationRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  consultationRadiotherapie")
    @PutMapping("")
    public ResponseEntity<ConsultationRadiotherapieDto> update(@RequestBody ConsultationRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a consultationRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<ConsultationRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  consultationRadiotherapie")
    @PostMapping("")
    public ResponseEntity<ConsultationRadiotherapieDto> save(@RequestBody ConsultationRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified consultationRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ConsultationRadiotherapieDto>> delete(@RequestBody List<ConsultationRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }








    @PostMapping("listByCriteria")
    public ResponseEntity<List<ConsultationRadiotherapieDto>> findByCriteria(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportConsultationRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ConsultationRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histConsultationRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportConsultationRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistConsultationRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ConsultationRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public ConsultationRadiotherapieRestAdmin (ConsultationRadiotherapieAdminService service, ConsultationRadiotherapieConverter converter) {
        super(service, converter);
    }

}