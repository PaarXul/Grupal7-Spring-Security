package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.DetalleAdministrativo;
import com.ejercicio6.jpa.services.DetalleAdministrativoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/detalleadministrativo")
@CrossOrigin("*")
public class DetalleAdministrativoController {

    private final DetalleAdministrativoService detalleadministrativoService;

    @Autowired
    public DetalleAdministrativoController(DetalleAdministrativoService detalleadministrativoService) {
        this.detalleadministrativoService = detalleadministrativoService;
    }

    @PostMapping("/")
    public ResponseEntity<DetalleAdministrativo> crearDetalleAdministrativo(@RequestBody DetalleAdministrativo detalleadministrativo) throws Exception {
        return ResponseEntity.ok(detalleadministrativoService.crearDetalleAdministrativo(detalleadministrativo));
    }

    @PutMapping("/")
    public ResponseEntity<DetalleAdministrativo> actualizarDetalleAdministrativo(@RequestBody DetalleAdministrativo detalleadministrativo) throws Exception {
        return ResponseEntity.ok(detalleadministrativoService.actualizarDetalleAdministrativo(detalleadministrativo));
    }

    @PreAuthorize("hasRole('NORMAL') or hasRole('ADMIN')")
    @Secured({"NORMAL", "ADMIN"})
    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDetalleAdministrativo(@PathVariable("id") Long id) throws Exception {
        detalleadministrativoService.eliminarDetalleAdministrativo(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleAdministrativo> obtenerDetalleAdministrativo(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(detalleadministrativoService.obtenerDetalleAdministrativo(id));
    }

    @GetMapping("/todos")
    public ResponseEntity<?> listarDetalleAdministrativos() {
        return ResponseEntity.ok(detalleadministrativoService.listarDetalleAdministrativos());
    }


}
