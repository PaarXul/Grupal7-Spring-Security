package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.Accidente;
import com.ejercicio6.jpa.services.AccidenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/accidente")
@CrossOrigin("*")
public class AccidenteController {

    private final AccidenteService accidenteService;
    @Autowired
    public AccidenteController(AccidenteService accidenteService) {
        this.accidenteService = accidenteService;
    }

    @PostMapping("/")
    public ResponseEntity<Accidente> guardarAccidente(@RequestBody Accidente accidente) throws Exception {
        return ResponseEntity.ok(accidenteService.agrergarAccidente(accidente));
    }

    @PutMapping("/")
    public ResponseEntity<Accidente> actualizarAccidente(@RequestBody Accidente accidente) throws Exception {
        return ResponseEntity.ok(accidenteService.actualizarAccidente(accidente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAccidente(@PathVariable("id") Long id) {
        ResponseEntity<String> responseEntity = null;
        try {
            accidenteService.eliminarAccidente(id);
            responseEntity = ResponseEntity.ok("Accidente eliminado correctamente");
        } catch (Exception e) {
            responseEntity = ResponseEntity.ok("Error al eliminar el accidente");
        } catch (Throwable throwable) {
            responseEntity = ResponseEntity.ok("Error al eliminar el accidente");
        }
        return ResponseEntity.ok(responseEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Accidente> obtenerAccidentePorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(accidenteService.obtenerAccidentePorId(id));
    }

    @GetMapping("/todos/")
    public ResponseEntity<?> obtenerAccidentes() {

        return ResponseEntity.ok(accidenteService.obtenerAccidentes());
    }
}
