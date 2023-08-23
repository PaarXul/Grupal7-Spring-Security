package com.ejercicio6.jpa.controllers;


import com.ejercicio6.jpa.model.PagosCapacitacion;
import com.ejercicio6.jpa.services.PagosCapacitacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/pagoscapacitacion")
@CrossOrigin("*")
public class PagosCapacitacionController {

    private final PagosCapacitacionService pagosCapacitacionService;

    @Autowired
    public PagosCapacitacionController(PagosCapacitacionService pagosCapacitacionService) {
        this.pagosCapacitacionService = pagosCapacitacionService;
    }

    @PostMapping("/")
    public ResponseEntity<PagosCapacitacion> guardarPagosCapacitacion(@RequestBody PagosCapacitacion pagosCapacitacion) {
        return ResponseEntity.ok(pagosCapacitacionService.guardarPagosCapacitacion(pagosCapacitacion));
    }

    @PutMapping("/")
    public ResponseEntity<PagosCapacitacion> actualizarPagosCapacitacion(@RequestBody PagosCapacitacion pagosCapacitacion)  {
        return ResponseEntity.ok(pagosCapacitacionService.actualizarPagosCapacitacion(pagosCapacitacion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarPagosCapacitacion(@PathVariable("id") Long id)  {
        pagosCapacitacionService.eliminarPagosCapacitacion(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<PagosCapacitacion> buscarPagosCapacitacion(@PathVariable("id") Long id) {
        return ResponseEntity.ok(pagosCapacitacionService.buscarPagosCapacitacion(id));
    }

    @GetMapping("/")
    public ResponseEntity<Set<PagosCapacitacion>> listarPagosCapacitacion(){
        return ResponseEntity.ok(pagosCapacitacionService.listarPagosCapacitacion());
    }

    @GetMapping("/capacitacion/{id}")
    public ResponseEntity<Set<PagosCapacitacion>> listarPagosCapacitacionPorCapacitacion(@PathVariable("id") Long id) {
        return ResponseEntity.ok(pagosCapacitacionService.listarPagosCapacitacionPorCapacitacion(id));
    }


}
