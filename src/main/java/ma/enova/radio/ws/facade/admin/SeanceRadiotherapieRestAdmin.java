package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.SeanceRadiotherapie;
import ma.enova.radio.bean.history.SeanceRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.SeanceRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.SeanceRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.SeanceRadiotherapieAdminService;
import ma.enova.radio.ws.converter.SeanceRadiotherapieConverter;
import ma.enova.radio.ws.dto.SeanceRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages seanceRadiotherapie services")
@RestController
@RequestMapping("/api/seanceRadiotherapie")
public class SeanceRadiotherapieRestAdmin  extends AbstractController<SeanceRadiotherapie, SeanceRadiotherapieDto, SeanceRadiotherapieHistory, SeanceRadiotherapieCriteria, SeanceRadiotherapieHistoryCriteria, SeanceRadiotherapieAdminService, SeanceRadiotherapieConverter> {



    @ApiOperation("Finds a list of all seanceRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<SeanceRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  seanceRadiotherapie")
    @PutMapping("")
    public ResponseEntity<SeanceRadiotherapieDto> update(@RequestBody SeanceRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a seanceRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<SeanceRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  seanceRadiotherapie")
    @PostMapping("")
    public ResponseEntity<SeanceRadiotherapieDto> save(@RequestBody SeanceRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified seanceRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<SeanceRadiotherapieDto>> delete(@RequestBody List<SeanceRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<SeanceRadiotherapieDto>> findByCriteria(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportSeanceRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getSeanceRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody SeanceRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histSeanceRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SeanceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportSeanceRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SeanceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistSeanceRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SeanceRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public SeanceRadiotherapieRestAdmin (SeanceRadiotherapieAdminService service, SeanceRadiotherapieConverter converter) {
        super(service, converter);
    }

}