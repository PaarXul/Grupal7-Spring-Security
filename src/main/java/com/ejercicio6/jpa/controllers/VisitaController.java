package com.ejercicio6.jpa.controllers;



import com.ejercicio6.jpa.model.Visita;
import com.ejercicio6.jpa.services.VisitaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/visita")
@CrossOrigin("*")
public class VisitaController {
    private final VisitaService visitaService;

    public VisitaController(VisitaService visitaService) {
        this.visitaService = visitaService;
    }

    @PostMapping("/")
    public ResponseEntity<Visita> saveVisita(@RequestBody Visita visita){
        return ResponseEntity.ok(visitaService.saveVisita(visita));
    }

    @PutMapping("/")
    public ResponseEntity<Visita> UpdateVisita(@RequestBody Visita visita) {
        return ResponseEntity.ok(visitaService.UpdateVisita(visita));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteVisita(@PathVariable("id") Long id) {
        visitaService.deleteVisita(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Visita> searchVisitaById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(visitaService.searchVisitaById(id));
    }
    @GetMapping("/")
    public ResponseEntity<?> searchVisita() {
        return ResponseEntity.ok(visitaService.SearchVisita());
    }

}
