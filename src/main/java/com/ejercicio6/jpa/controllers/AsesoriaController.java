package com.ejercicio6.jpa.controllers;


import com.ejercicio6.jpa.model.Asesoria;
import com.ejercicio6.jpa.services.AsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/asesoria")
@CrossOrigin("*")
public class AsesoriaController {

    private final AsesoriaService asesoriaService;

    @Autowired
    public AsesoriaController(AsesoriaService asesoriaService) {
        this.asesoriaService = asesoriaService;
    }

    @PostMapping("/")
    public ResponseEntity<Asesoria> agrergarAsesoria(@RequestBody Asesoria asesoria) throws Exception {
        return ResponseEntity.ok(asesoriaService.agrergarAsesoria(asesoria));
    }

    @PutMapping("/")
    public ResponseEntity<Asesoria> actualizarAsesoria(@RequestBody Asesoria asesoria) throws Exception {
        return ResponseEntity.ok(asesoriaService.actualizarAsesoria(asesoria));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> eliminarAsesoria(@PathVariable("id") Long id) {
        ResponseEntity<String> responseEntity = null;
        try {
            asesoriaService.eliminarAsesoria(id);
            responseEntity = ResponseEntity.ok("Asesoria eliminada correctamente");
        } catch (Exception e) {
            responseEntity = ResponseEntity.ok("Error al eliminar la asesoria");
        } catch (Throwable throwable) {
            responseEntity = ResponseEntity.ok("Error al eliminar la asesoria");
        }
        return ResponseEntity.ok(responseEntity);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Asesoria> obtenerAsesoriaPorId(@PathVariable("id") Long id) {
        return ResponseEntity.ok(asesoriaService.obtenerAsesoriaPorId(id));
    }

    @GetMapping("/todos/")
    public ResponseEntity<?> obtenerAsesorias() {

        return ResponseEntity.ok(asesoriaService.obtenerAsesorias());
    }
}
