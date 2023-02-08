package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.Personnel;
import ma.enova.radio.bean.history.PersonnelHistory;
import ma.enova.radio.dao.criteria.core.PersonnelCriteria;
import ma.enova.radio.dao.criteria.history.PersonnelHistoryCriteria;
import ma.enova.radio.service.facade.admin.PersonnelAdminService;
import ma.enova.radio.ws.converter.PersonnelConverter;
import ma.enova.radio.ws.dto.PersonnelDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages personnel services")
@RestController
@RequestMapping("/api/personnel")
public class PersonnelRestAdmin  extends AbstractController<Personnel, PersonnelDto, PersonnelHistory, PersonnelCriteria, PersonnelHistoryCriteria, PersonnelAdminService, PersonnelConverter> {



    @ApiOperation("Finds a list of all personnels")
    @GetMapping("")
    public ResponseEntity<List<PersonnelDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  personnel")
    @PutMapping("")
    public ResponseEntity<PersonnelDto> update(@RequestBody PersonnelDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a personnel by id")
    @GetMapping("{id}")
    public ResponseEntity<PersonnelDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  personnel")
    @PostMapping("")
    public ResponseEntity<PersonnelDto> save(@RequestBody PersonnelDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified personnel")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PersonnelDto>> delete(@RequestBody List<PersonnelDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }





    @PostMapping("listByCriteria")
    public ResponseEntity<List<PersonnelDto>> findByCriteria(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportPersonnels")
    public ResponseEntity<InputStreamResource> export(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getPersonnelsDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PersonnelCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histPersonnel/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PersonnelHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportPersonnelsHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PersonnelHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistPersonnelsDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PersonnelHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public PersonnelRestAdmin (PersonnelAdminService service, PersonnelConverter converter) {
        super(service, converter);
    }

}