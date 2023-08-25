package com.ejercicio6.jpa.controllers;

import com.ejercicio6.jpa.model.Chek;
import com.ejercicio6.jpa.services.ChekService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chek")
@CrossOrigin("*")
public class ChekController {

    private final ChekService chekService;

    public ChekController(ChekService chekService) {
        this.chekService = chekService;
    }

    @PostMapping("/")
    public ResponseEntity<Chek> saveChek(@RequestBody Chek chek){
        return ResponseEntity.ok(chekService.saveChek(chek));
    }

    @PutMapping("/")
    public ResponseEntity<Chek> UpdateChek(@RequestBody Chek chek) {
        return ResponseEntity.ok(chekService.UpdateChek(chek));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteChek(@PathVariable("id") Long id) {
        chekService.deleteChek(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Chek> searchChekById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(chekService.searchChekById(id));
    }
    @GetMapping("/")
    public ResponseEntity<?> searchChek() {
        return ResponseEntity.ok(chekService.SearchCheks());
    }
}
