package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Visee;
import ma.enova.radio.bean.history.ViseeHistory;
import ma.enova.radio.dao.criteria.core.ViseeCriteria;
import ma.enova.radio.dao.criteria.history.ViseeHistoryCriteria;
import ma.enova.radio.service.facade.admin.ViseeAdminService;
import ma.enova.radio.ws.converter.ViseeConverter;
import ma.enova.radio.ws.dto.ViseeDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages visee services")
@RestController
@RequestMapping("/visee")
public class ViseeRestAdmin  extends AbstractController<Visee, ViseeDto, ViseeHistory, ViseeCriteria, ViseeHistoryCriteria, ViseeAdminService, ViseeConverter> {



    @ApiOperation("Finds a list of all visees")
    @GetMapping("")
    public ResponseEntity<List<ViseeDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  visee")
    @PutMapping("")
    public ResponseEntity<ViseeDto> update(@RequestBody ViseeDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a visee by id")
    @GetMapping("{id}")
    public ResponseEntity<ViseeDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  visee")
    @PostMapping("")
    public ResponseEntity<ViseeDto> save(@RequestBody ViseeDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified visee")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ViseeDto>> delete(@RequestBody List<ViseeDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<ViseeDto>> findByCriteria(@RequestBody ViseeCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ViseeCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportVisees")
    public ResponseEntity<InputStreamResource> export(@RequestBody ViseeCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getViseesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ViseeCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histVisee/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ViseeHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportViseesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ViseeHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistViseesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ViseeHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public ViseeRestAdmin (ViseeAdminService service, ViseeConverter converter) {
        super(service, converter);
    }

}