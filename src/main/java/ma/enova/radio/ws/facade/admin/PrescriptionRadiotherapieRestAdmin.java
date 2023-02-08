package  ma.enova.radio.ws.facade.admin;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import ma.enova.radio.bean.core.PrescriptionRadiotherapie;
import ma.enova.radio.bean.history.PrescriptionRadiotherapieHistory;
import ma.enova.radio.dao.criteria.core.PrescriptionRadiotherapieCriteria;
import ma.enova.radio.dao.criteria.history.PrescriptionRadiotherapieHistoryCriteria;
import ma.enova.radio.service.facade.admin.PrescriptionRadiotherapieAdminService;
import ma.enova.radio.ws.converter.PrescriptionRadiotherapieConverter;
import ma.enova.radio.ws.dto.PrescriptionRadiotherapieDto;
import ma.enova.radio.zynerator.controller.AbstractController;
import ma.enova.radio.zynerator.dto.AuditEntityDto;
import ma.enova.radio.zynerator.util.PaginatedList;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import ma.enova.radio.zynerator.process.Result;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminProcess ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminInput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.save.PrescriptionRadiotherapieSaveAdminOutput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler.PrescriptionRadiotherapieSimulerAdminProcess ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler.PrescriptionRadiotherapieSimulerAdminInput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.simuler.PrescriptionRadiotherapieSimulerAdminOutput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien.PrescriptionRadiotherapieValidatePhysicienAdminProcess ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien.PrescriptionRadiotherapieValidatePhysicienAdminInput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validatephysicien.PrescriptionRadiotherapieValidatePhysicienAdminOutput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validateradiotherapeute.PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcess ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validateradiotherapeute.PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.validateradiotherapeute.PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation.PrescriptionRadiotherapieSuivreConsultationAdminProcess ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation.PrescriptionRadiotherapieSuivreConsultationAdminInput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.suivreconsultation.PrescriptionRadiotherapieSuivreConsultationAdminOutput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement.PrescriptionRadiotherapieFinirTraitementAdminProcess ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement.PrescriptionRadiotherapieFinirTraitementAdminInput ;
import ma.enova.radio.workflow.admin.process.prescriptionradiotherapie.finirtraitement.PrescriptionRadiotherapieFinirTraitementAdminOutput ;

@Api("Manages prescriptionRadiotherapie services")
@RestController
@RequestMapping("/api/prescriptionRadiotherapie")
public class PrescriptionRadiotherapieRestAdmin  extends AbstractController<PrescriptionRadiotherapie, PrescriptionRadiotherapieDto, PrescriptionRadiotherapieHistory, PrescriptionRadiotherapieCriteria, PrescriptionRadiotherapieHistoryCriteria, PrescriptionRadiotherapieAdminService, PrescriptionRadiotherapieConverter> {

     @Autowired
     private PrescriptionRadiotherapieSaveAdminProcess prescriptionRadiotherapieSaveAdminProcess;
     @Autowired
     private PrescriptionRadiotherapieSimulerAdminProcess prescriptionRadiotherapieSimulerAdminProcess;
     @Autowired
     private PrescriptionRadiotherapieValidatePhysicienAdminProcess prescriptionRadiotherapieValidatePhysicienAdminProcess;
     @Autowired
     private PrescriptionRadiotherapieValidateRadiotherapeuteAdminProcess prescriptionRadiotherapieValidateRadiotherapeuteAdminProcess;
     @Autowired
     private PrescriptionRadiotherapieSuivreConsultationAdminProcess prescriptionRadiotherapieSuivreConsultationAdminProcess;
     @Autowired
     private PrescriptionRadiotherapieFinirTraitementAdminProcess prescriptionRadiotherapieFinirTraitementAdminProcess;

    @ApiOperation("save a prescriptionRadiotherapie")
    @PostMapping("process/save")
    public ResponseEntity<Result<PrescriptionRadiotherapieSaveAdminInput,PrescriptionRadiotherapieSaveAdminOutput>> saveProcess(@RequestBody PrescriptionRadiotherapieSaveAdminInput input) throws Exception {
        PrescriptionRadiotherapieSaveAdminOutput output = new PrescriptionRadiotherapieSaveAdminOutput();
        Result<PrescriptionRadiotherapieSaveAdminInput, PrescriptionRadiotherapieSaveAdminOutput> result = prescriptionRadiotherapieSaveAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("simuler a prescriptionRadiotherapie")
    @PostMapping("process/simuler")
    public ResponseEntity<Result<PrescriptionRadiotherapieSimulerAdminInput,PrescriptionRadiotherapieSimulerAdminOutput>> simulerProcess(@RequestBody PrescriptionRadiotherapieSimulerAdminInput input) throws Exception {
        PrescriptionRadiotherapieSimulerAdminOutput output = new PrescriptionRadiotherapieSimulerAdminOutput();
        Result<PrescriptionRadiotherapieSimulerAdminInput, PrescriptionRadiotherapieSimulerAdminOutput> result = prescriptionRadiotherapieSimulerAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("validatePhysicien a prescriptionRadiotherapie")
    @PostMapping("process/validatephysicien")
    public ResponseEntity<Result<PrescriptionRadiotherapieValidatePhysicienAdminInput,PrescriptionRadiotherapieValidatePhysicienAdminOutput>> validatePhysicienProcess(@RequestBody PrescriptionRadiotherapieValidatePhysicienAdminInput input) throws Exception {
        PrescriptionRadiotherapieValidatePhysicienAdminOutput output = new PrescriptionRadiotherapieValidatePhysicienAdminOutput();
        Result<PrescriptionRadiotherapieValidatePhysicienAdminInput, PrescriptionRadiotherapieValidatePhysicienAdminOutput> result = prescriptionRadiotherapieValidatePhysicienAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("validateRadiotherapeute a prescriptionRadiotherapie")
    @PostMapping("process/validateradiotherapeute")
    public ResponseEntity<Result<PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput,PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput>> validateRadiotherapeuteProcess(@RequestBody PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput input) throws Exception {
        PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput output = new PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput();
        Result<PrescriptionRadiotherapieValidateRadiotherapeuteAdminInput, PrescriptionRadiotherapieValidateRadiotherapeuteAdminOutput> result = prescriptionRadiotherapieValidateRadiotherapeuteAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("suivreConsultation a prescriptionRadiotherapie")
    @PostMapping("process/suivreconsultation")
    public ResponseEntity<Result<PrescriptionRadiotherapieSuivreConsultationAdminInput,PrescriptionRadiotherapieSuivreConsultationAdminOutput>> suivreConsultationProcess(@RequestBody PrescriptionRadiotherapieSuivreConsultationAdminInput input) throws Exception {
        PrescriptionRadiotherapieSuivreConsultationAdminOutput output = new PrescriptionRadiotherapieSuivreConsultationAdminOutput();
        Result<PrescriptionRadiotherapieSuivreConsultationAdminInput, PrescriptionRadiotherapieSuivreConsultationAdminOutput> result = prescriptionRadiotherapieSuivreConsultationAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }
    @ApiOperation("finirTraitement a prescriptionRadiotherapie")
    @PostMapping("process/finirtraitement")
    public ResponseEntity<Result<PrescriptionRadiotherapieFinirTraitementAdminInput,PrescriptionRadiotherapieFinirTraitementAdminOutput>> finirTraitementProcess(@RequestBody PrescriptionRadiotherapieFinirTraitementAdminInput input) throws Exception {
        PrescriptionRadiotherapieFinirTraitementAdminOutput output = new PrescriptionRadiotherapieFinirTraitementAdminOutput();
        Result<PrescriptionRadiotherapieFinirTraitementAdminInput, PrescriptionRadiotherapieFinirTraitementAdminOutput> result = prescriptionRadiotherapieFinirTraitementAdminProcess.execute(input, output);
        return new ResponseEntity<>(result, result.getStatus());
    }

    @ApiOperation("Finds a list of all prescriptionRadiotherapies")
    @GetMapping("")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> findAll() throws Exception {
        return super.findAll();
    }


    @ApiOperation("Updates the specified  prescriptionRadiotherapie")
    @PutMapping("")
    public ResponseEntity<PrescriptionRadiotherapieDto> update(@RequestBody PrescriptionRadiotherapieDto dto) throws Exception {
        return super.update(dto);
    }


    @ApiOperation("Finds a prescriptionRadiotherapie by id")
    @GetMapping("{id}")
    public ResponseEntity<PrescriptionRadiotherapieDto> findById(@PathVariable Long id, String[] includes, String[] excludes) throws Exception {
        return super.findById(id, includes, excludes);
    }


    @ApiOperation("Saves the specified  prescriptionRadiotherapie")
    @PostMapping("")
    public ResponseEntity<PrescriptionRadiotherapieDto> save(@RequestBody PrescriptionRadiotherapieDto dto) throws Exception {
        return super.save(dto);
    }

    @ApiOperation("Delete the specified prescriptionRadiotherapie")
    @DeleteMapping("/delete")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> delete(@RequestBody List<PrescriptionRadiotherapieDto> listToDelete) throws Exception {
        return super.delete(listToDelete);
    }









    @ApiOperation("Finds a prescriptionRadiotherapie and associated list by id")
    @GetMapping("detail/id/{id}")
    public ResponseEntity<PrescriptionRadiotherapieDto> findWithAssociatedLists(@PathVariable Long id) {
        return super.findWithAssociatedLists(id);
    }

    @ApiOperation("Deletes a prescriptionRadiotherapie and associated list by id")
    @PostMapping("delete-with-lists")
    public ResponseEntity<PrescriptionRadiotherapieDto> deleteWithAssociatedLists(@RequestBody PrescriptionRadiotherapieDto dto) {
        return super.deleteWithAssociatedLists(dto);
    }


    @PostMapping("listByCriteria")
    public ResponseEntity<List<PrescriptionRadiotherapieDto>> findByCriteria(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.findByCriteria(criteria);
    }

    @PostMapping("paginatedListByCriteria")
    public ResponseEntity<PaginatedList> findPaginatedByCriteria(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.findPaginatedByCriteria(criteria);
    }
    @PostMapping("exportPrescriptionRadiotherapies")
    public ResponseEntity<InputStreamResource> export(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.export(criteria);
    }

    @PostMapping("getPrescriptionRadiotherapiesDataSize")
    public ResponseEntity<Integer> getDataSize(@RequestBody PrescriptionRadiotherapieCriteria criteria) throws Exception {
        return super.getDataSize(criteria);
    }

    @GetMapping("histPrescriptionRadiotherapie/{id}")
    public ResponseEntity<AuditEntityDto> findHistoryById(@PathVariable("id") Long id) throws Exception {
        return super.findHistoryById(id);
    }
    @PostMapping("paginatedListHistByCriteria")
    public ResponseEntity<PaginatedList> findHistoryPaginatedByCriteria(@RequestBody PrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.findHistoryPaginatedByCriteria(criteria);
    }
    @PostMapping("exportPrescriptionRadiotherapiesHist")
    public ResponseEntity<InputStreamResource> exportHistory(@RequestBody PrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.exportHistory(criteria);
    }
    @PostMapping("getHistPrescriptionRadiotherapiesDataSize")
    public ResponseEntity<Integer> getHistoryDataSize(@RequestBody PrescriptionRadiotherapieHistoryCriteria criteria) throws Exception {
        return super.getHistoryDataSize(criteria);
    }

    public PrescriptionRadiotherapieRestAdmin (PrescriptionRadiotherapieAdminService service, PrescriptionRadiotherapieConverter converter) {
        super(service, converter);
    }

}