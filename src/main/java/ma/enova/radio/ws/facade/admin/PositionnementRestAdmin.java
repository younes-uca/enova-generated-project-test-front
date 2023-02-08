package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Positionnement;
import ma.enova.radio.bean.history.PositionnementHistory;
import ma.enova.radio.dao.criteria.core.PositionnementCriteria;
import ma.enova.radio.dao.criteria.history.PositionnementHistoryCriteria;
import ma.enova.radio.service.facade.admin.PositionnementAdminService;
import ma.enova.radio.ws.converter.PositionnementConverter;
import ma.enova.radio.ws.dto.PositionnementDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages positionnement services")
@RestController
@RequestMapping("/api/positionnement")
public class PositionnementRestAdmin  extends AbstractController<Positionnement, PositionnementDto, PositionnementHistory, PositionnementCriteria, PositionnementHistoryCriteria, PositionnementAdminService, PositionnementConverter> {



    @ApiOperation("Finds a list of all positionnements")
    @GetMapping("")
    public ResponseEntity<List<PositionnementDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  positionnement")
    @PutMapping("")
    public ResponseEntity<PositionnementDto> update(@RequestBody PositionnementDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a positionnement by id")
    @GetMapping("{id}")
    public ResponseEntity<PositionnementDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  positionnement")
    @PostMapping("")
    public ResponseEntity<PositionnementDto> save(@RequestBody PositionnementDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified positionnement")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PositionnementDto>> delete(@RequestBody List<PositionnementDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<PositionnementDto>> findByCriteria(@RequestBody PositionnementCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PositionnementCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportPositionnements")
    public ResponseEntity<InputStreamResource> export(@RequestBody PositionnementCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getPositionnementsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PositionnementCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histPositionnement/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PositionnementHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportPositionnementsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PositionnementHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistPositionnementsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PositionnementHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public PositionnementRestAdmin (PositionnementAdminService service, PositionnementConverter converter) {
        super(service, converter);
    }

}