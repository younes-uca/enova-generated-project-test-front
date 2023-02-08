package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Decisiontraitement;
import ma.enova.radio.bean.history.DecisiontraitementHistory;
import ma.enova.radio.dao.criteria.core.DecisiontraitementCriteria;
import ma.enova.radio.dao.criteria.history.DecisiontraitementHistoryCriteria;
import ma.enova.radio.service.facade.admin.DecisiontraitementAdminService;
import ma.enova.radio.ws.converter.DecisiontraitementConverter;
import ma.enova.radio.ws.dto.DecisiontraitementDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages decisiontraitement services")
@RestController
@RequestMapping("/decisiontraitement")
public class DecisiontraitementRestAdmin  extends AbstractController<Decisiontraitement, DecisiontraitementDto, DecisiontraitementHistory, DecisiontraitementCriteria, DecisiontraitementHistoryCriteria, DecisiontraitementAdminService, DecisiontraitementConverter> {



    @ApiOperation("Finds a list of all decisiontraitements")
    @GetMapping("")
    public ResponseEntity<List<DecisiontraitementDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  decisiontraitement")
    @PutMapping("")
    public ResponseEntity<DecisiontraitementDto> update(@RequestBody DecisiontraitementDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a decisiontraitement by id")
    @GetMapping("{id}")
    public ResponseEntity<DecisiontraitementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  decisiontraitement")
    @PostMapping("")
    public ResponseEntity<DecisiontraitementDto> save(@RequestBody DecisiontraitementDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified decisiontraitement")
    @DeleteMapping("/delete")
    public ResponseEntity<List<DecisiontraitementDto>> delete(@RequestBody List<DecisiontraitementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }



    @PostMapping("listByCriteria")
    public ResponseEntity<List<DecisiontraitementDto>> findByCriteria(@RequestBody DecisiontraitementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody DecisiontraitementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportDecisiontraitements")
    public ResponseEntity<InputStreamResource> export(@RequestBody DecisiontraitementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getDecisiontraitementsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody DecisiontraitementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histDecisiontraitement/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody DecisiontraitementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportDecisiontraitementsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody DecisiontraitementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistDecisiontraitementsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody DecisiontraitementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public DecisiontraitementRestAdmin (DecisiontraitementAdminService service, DecisiontraitementConverter converter) {
        super(service, converter);
    }

}