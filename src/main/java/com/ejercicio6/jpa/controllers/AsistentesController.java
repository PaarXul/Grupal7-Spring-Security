package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.Asistentes;
import com.ejercicio6.jpa.services.AsistentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asistentes")
@CrossOrigin("*")
public class AsistentesController {

    private AsistentesService asistentesService;

    @Autowired
    public AsistentesController(AsistentesService asistentesService) {
        this.asistentesService = asistentesService;
    }


    @PostMapping("/")
    public ResponseEntity<Asistentes> guardarAsistentes(@RequestBody Asistentes asistentes){
        return ResponseEntity.ok(asistentesService.guardarAsistentes(asistentes));
    }


    @PutMapping("/")
    public ResponseEntity<Asistentes> actualizarAsistentes(@RequestBody Asistentes asistentes){
        return ResponseEntity.ok(asistentesService.actualizarAsistentes(asistentes));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asistentes> obtenerAsistentesPorId(@PathVariable("id") Long id){
        return ResponseEntity.ok(asistentesService.buscarAsistentes(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAsistentesPorId(@PathVariable("id") Long id){
        asistentesService.eliminarAsistentes(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/todos/")
    public ResponseEntity<Iterable<Asistentes>> obtenerAsistentes(){
        return ResponseEntity.ok(asistentesService.obtenerAsistentes());
    }

    @GetMapping("/capacitacion/{id}")
    public ResponseEntity<Iterable<Asistentes>> obtenerAsistentesPorCapacitacion(@PathVariable("id") Long id){
        return ResponseEntity.ok(asistentesService.obtenerAsistentesPorCapacitacion(id));
    }


}
