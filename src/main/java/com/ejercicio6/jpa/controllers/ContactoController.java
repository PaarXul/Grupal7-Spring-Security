package com.ejercicio6.jpa.controllers;


import com.ejercicio6.jpa.model.Contacto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.ejercicio6.jpa.services.ContactoService;

@RestController
@RequestMapping("/contacto")
@CrossOrigin("*")
public class ContactoController  {

    private final ContactoService contactoService;

    @Autowired
    public ContactoController(ContactoService contactoService) {
        this.contactoService = contactoService;
    }

    @PostMapping("/")
    public ResponseEntity<Contacto> guardarContacto(@RequestBody Contacto contacto) throws Exception {
        return ResponseEntity.ok(contactoService.agrergarContacto(contacto));
    }

    @PutMapping("/")
    public ResponseEntity<Contacto> actualizarContacto(@RequestBody Contacto contacto) throws Exception {
        return ResponseEntity.ok(contactoService.actualizarContacto(contacto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarContacto(@PathVariable("id") Long id) {
        ResponseEntity<String> responseEntity = null;
        try {
            contactoService.eliminarContacto(id);
            responseEntity = ResponseEntity.ok("Contacto eliminado correctamente");
        } catch (Exception e) {
            responseEntity = ResponseEntity.ok("Error al eliminar el contacto");
        } catch (Throwable throwable) {
            responseEntity = ResponseEntity.ok("Error al eliminar el contacto");
        }
        return ResponseEntity.ok(responseEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contacto> obtenerContactoPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(contactoService.obtenerContactoPorId(id));
    }

    @GetMapping("/todos/")
    public ResponseEntity<?> obtenerContactos() {
        return ResponseEntity.ok(contactoService.obtenerContactos());
    }



}
