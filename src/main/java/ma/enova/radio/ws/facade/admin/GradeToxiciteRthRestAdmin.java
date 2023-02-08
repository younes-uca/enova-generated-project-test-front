package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.GradeToxiciteRth;
import ma.enova.radio.bean.history.GradeToxiciteRthHistory;
import ma.enova.radio.dao.criteria.core.GradeToxiciteRthCriteria;
import ma.enova.radio.dao.criteria.history.GradeToxiciteRthHistoryCriteria;
import ma.enova.radio.service.facade.admin.GradeToxiciteRthAdminService;
import ma.enova.radio.ws.converter.GradeToxiciteRthConverter;
import ma.enova.radio.ws.dto.GradeToxiciteRthDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages gradeToxiciteRth services")
@RestController
@RequestMapping("/gradeToxiciteRth")
public class GradeToxiciteRthRestAdmin  extends AbstractController<GradeToxiciteRth, GradeToxiciteRthDto, GradeToxiciteRthHistory, GradeToxiciteRthCriteria, GradeToxiciteRthHistoryCriteria, GradeToxiciteRthAdminService, GradeToxiciteRthConverter> {



    @ApiOperation("Finds a list of all gradeToxiciteRths")
    @GetMapping("")
    public ResponseEntity<List<GradeToxiciteRthDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  gradeToxiciteRth")
    @PutMapping("")
    public ResponseEntity<GradeToxiciteRthDto> update(@RequestBody GradeToxiciteRthDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a gradeToxiciteRth by id")
    @GetMapping("{id}")
    public ResponseEntity<GradeToxiciteRthDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  gradeToxiciteRth")
    @PostMapping("")
    public ResponseEntity<GradeToxiciteRthDto> save(@RequestBody GradeToxiciteRthDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified gradeToxiciteRth")
    @DeleteMapping("/delete")
    public ResponseEntity<List<GradeToxiciteRthDto>> delete(@RequestBody List<GradeToxiciteRthDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<GradeToxiciteRthDto>> findByCriteria(@RequestBody GradeToxiciteRthCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody GradeToxiciteRthCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportGradeToxiciteRths")
    public ResponseEntity<InputStreamResource> export(@RequestBody GradeToxiciteRthCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getGradeToxiciteRthsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody GradeToxiciteRthCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histGradeToxiciteRth/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody GradeToxiciteRthHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportGradeToxiciteRthsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody GradeToxiciteRthHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistGradeToxiciteRthsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody GradeToxiciteRthHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public GradeToxiciteRthRestAdmin (GradeToxiciteRthAdminService service, GradeToxiciteRthConverter converter) {
        super(service, converter);
    }

}