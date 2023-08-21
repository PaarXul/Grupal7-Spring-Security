package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.DetalleProfesional;
import com.ejercicio6.jpa.services.DetalleProfesionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/detalleprofesional")
@CrossOrigin("*")
public class DetalleProfesionalController {

    private final DetalleProfesionalService detalleProfesionalService;

    @Autowired
    public DetalleProfesionalController(DetalleProfesionalService detalleProfesionalService) {
        this.detalleProfesionalService = detalleProfesionalService;
    }

    @PostMapping("/")
    public ResponseEntity<DetalleProfesional> guardarProfesional(@RequestBody DetalleProfesional detalleProfesional) throws Exception {
        return ResponseEntity.ok(detalleProfesionalService.guardarProfesional(detalleProfesional));
    }

    @PutMapping("/")
    public ResponseEntity<DetalleProfesional> actualizarProfesional(@RequestBody DetalleProfesional detalleProfesional) {
        return ResponseEntity.ok(detalleProfesionalService.actualizarProfesional(detalleProfesional));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarProfesional(@PathVariable("id") Long id) {
        detalleProfesionalService.eliminarProfesional(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleProfesional> obtenerProfesional(@PathVariable("id") Long id) {
        return ResponseEntity.ok(detalleProfesionalService.obtenerProfesional(id));
    }

    @GetMapping("/")
    public ResponseEntity<Set<DetalleProfesional>> listarProfesionales() {
        return ResponseEntity.ok(detalleProfesionalService.listarProfesionales());
    }


}
