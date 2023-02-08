package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.ModaliteRadiotherapie;
import ma.enova.radio.bean.history.ModaliteRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.ModaliteRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.ModaliteRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.ModaliteRadiotherapieAdminService;
import ma.enova.radio.ws.converter.ModaliteRadiotherapieConverter;
import ma.enova.radio.ws.dto.ModaliteRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;

@Api("Manages modaliteRadiotherapie services")
@RestController
@RequestMapping("/api/modaliteRadiotherapie")
public class ModaliteRadiotherapieRestAdmin  extends AbstractController<ModaliteRadiotherapie, ModaliteRadiotherapieDto, ModaliteRadiotherapieHistory, ModaliteRadiotherapieCriteria, ModaliteRadiotherapieHistoryCriteria, ModaliteRadiotherapieAdminService, ModaliteRadiotherapieConverter> {



    @ApiOperation("Finds a list of all modaliteRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<ModaliteRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  modaliteRadiotherapie")
    @PutMapping("")
    public ResponseEntity<ModaliteRadiotherapieDto> update(@RequestBody ModaliteRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a modaliteRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<ModaliteRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  modaliteRadiotherapie")
    @PostMapping("")
    public ResponseEntity<ModaliteRadiotherapieDto> save(@RequestBody ModaliteRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified modaliteRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<ModaliteRadiotherapieDto>> delete(@RequestBody List<ModaliteRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }




    @PostMapping("listByCriteria")
    public ResponseEntity<List<ModaliteRadiotherapieDto>> findByCriteria(@RequestBody ModaliteRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody ModaliteRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportModaliteRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody ModaliteRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getModaliteRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody ModaliteRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histModaliteRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody ModaliteRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportModaliteRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody ModaliteRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistModaliteRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody ModaliteRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public ModaliteRadiotherapieRestAdmin (ModaliteRadiotherapieAdminService service, ModaliteRadiotherapieConverter converter) {
        super(service, converter);
    }

}