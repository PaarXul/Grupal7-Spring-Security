package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.Chequeo;
import com.ejercicio6.jpa.services.ChequeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chequeos")
@CrossOrigin("*")
public class ChequeoController {

    private final ChequeoService chequeoService;

    @Autowired
    public ChequeoController(ChequeoService chequeoService) {
        this.chequeoService = chequeoService;
    }

    @PostMapping("/")
    public ResponseEntity<Chequeo> guardarChequeo(@RequestBody Chequeo chequeo) {
        return ResponseEntity.ok(chequeoService.guardarChequeo(chequeo));
    }

    @PutMapping("/")
    public ResponseEntity<Chequeo> actualizarChequeo(@RequestBody Chequeo chequeo) {
        return ResponseEntity.ok(chequeoService.actualizarChequeo(chequeo));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Chequeo> eliminarChequeo(@PathVariable("id") Long id) {
        chequeoService.eliminarChequeo(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chequeo> buscarChequeoPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(chequeoService.obtenerChequeoPorId(id));
    }

    @GetMapping("/")
    public ResponseEntity<?> buscarCapacitaciones() {
        return ResponseEntity.ok(chequeoService.obtenerChequeos());
    }

}
