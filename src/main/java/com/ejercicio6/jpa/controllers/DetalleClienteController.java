package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.DetalleCliente;
import com.ejercicio6.jpa.services.DetalleClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@RequestMapping("/detallecliente")
@CrossOrigin("*")
public class DetalleClienteController {

    private final DetalleClienteService detalleClienteService;

    @Autowired
    public DetalleClienteController(DetalleClienteService detalleClienteService) {
        this.detalleClienteService = detalleClienteService;
    }

    @PostMapping("/")
    public ResponseEntity<DetalleCliente> guardarDetalleCliente(@RequestBody DetalleCliente detallecliente) throws Exception {
        return ResponseEntity.ok(detalleClienteService.guardarDetalleCliente(detallecliente));
    }

    @PutMapping("/")
    public ResponseEntity<DetalleCliente> actualizarDetalleCliente(@RequestBody DetalleCliente detallecliente) {
        return ResponseEntity.ok(detalleClienteService.actualizarDetalleCliente(detallecliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarDetalleCliente(@PathVariable("id") Long id) {
        detalleClienteService.eliminarDetalleCliente(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DetalleCliente> buscarDetalleCliente(@PathVariable("id") Long id) throws Exception {
        return ResponseEntity.ok(detalleClienteService.buscarDetalleCliente(id));
    }

    @GetMapping("/todos")
    public ResponseEntity<Set<DetalleCliente>> obtenerDetalleClientes() {
        return ResponseEntity.ok(detalleClienteService.obtenerDetalleClientes());
    }


}
