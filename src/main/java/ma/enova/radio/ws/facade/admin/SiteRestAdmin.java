package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Site;
import ma.enova.radio.bean.history.SiteHistory;
import ma.enova.radio.dao.criteria.core.SiteCriteria;
import ma.enova.radio.dao.criteria.history.SiteHistoryCriteria;
import ma.enova.radio.service.facade.admin.SiteAdminService;
import ma.enova.radio.ws.converter.SiteConverter;
import ma.enova.radio.ws.dto.SiteDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages site services")
@RestController
@RequestMapping("/api/site")
public class SiteRestAdmin  extends AbstractController<Site, SiteDto, SiteHistory, SiteCriteria, SiteHistoryCriteria, SiteAdminService, SiteConverter> {



    @ApiOperation("Finds a list of all sites")
    @GetMapping("")
    public ResponseEntity<List<SiteDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  site")
    @PutMapping("")
    public ResponseEntity<SiteDto> update(@RequestBody SiteDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a site by id")
    @GetMapping("{id}")
    public ResponseEntity<SiteDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  site")
    @PostMapping("")
    public ResponseEntity<SiteDto> save(@RequestBody SiteDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified site")
    @DeleteMapping("/delete")
    public ResponseEntity<List<SiteDto>> delete(@RequestBody List<SiteDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<SiteDto>> findByCriteria(@RequestBody SiteCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody SiteCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportSites")
    public ResponseEntity<InputStreamResource> export(@RequestBody SiteCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getSitesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody SiteCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histSite/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody SiteHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportSitesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody SiteHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistSitesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody SiteHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public SiteRestAdmin (SiteAdminService service, SiteConverter converter) {
        super(service, converter);
    }

}