package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.TypeToxiciteRth;
import ma.enova.radio.bean.history.TypeToxiciteRthHistory;
import ma.enova.radio.dao.criteria.core.TypeToxiciteRthCriteria;
import ma.enova.radio.dao.criteria.history.TypeToxiciteRthHistoryCriteria;
import ma.enova.radio.service.facade.admin.TypeToxiciteRthAdminService;
import ma.enova.radio.ws.converter.TypeToxiciteRthConverter;
import ma.enova.radio.ws.dto.TypeToxiciteRthDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages typeToxiciteRth services")
@RestController
@RequestMapping("/api/typeToxiciteRth")
public class TypeToxiciteRthRestAdmin  extends AbstractController<TypeToxiciteRth, TypeToxiciteRthDto, TypeToxiciteRthHistory, TypeToxiciteRthCriteria, TypeToxiciteRthHistoryCriteria, TypeToxiciteRthAdminService, TypeToxiciteRthConverter> {



    @ApiOperation("Finds a list of all typeToxiciteRths")
    @GetMapping("")
    public ResponseEntity<List<TypeToxiciteRthDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  typeToxiciteRth")
    @PutMapping("")
    public ResponseEntity<TypeToxiciteRthDto> update(@RequestBody TypeToxiciteRthDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a typeToxiciteRth by id")
    @GetMapping("{id}")
    public ResponseEntity<TypeToxiciteRthDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  typeToxiciteRth")
    @PostMapping("")
    public ResponseEntity<TypeToxiciteRthDto> save(@RequestBody TypeToxiciteRthDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified typeToxiciteRth")
    @DeleteMapping("/delete")
    public ResponseEntity<List<TypeToxiciteRthDto>> delete(@RequestBody List<TypeToxiciteRthDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<TypeToxiciteRthDto>> findByCriteria(@RequestBody TypeToxiciteRthCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody TypeToxiciteRthCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportTypeToxiciteRths")
    public ResponseEntity<InputStreamResource> export(@RequestBody TypeToxiciteRthCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getTypeToxiciteRthsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody TypeToxiciteRthCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histTypeToxiciteRth/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody TypeToxiciteRthHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportTypeToxiciteRthsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody TypeToxiciteRthHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistTypeToxiciteRthsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody TypeToxiciteRthHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public TypeToxiciteRthRestAdmin (TypeToxiciteRthAdminService service, TypeToxiciteRthConverter converter) {
        super(service, converter);
    }

}