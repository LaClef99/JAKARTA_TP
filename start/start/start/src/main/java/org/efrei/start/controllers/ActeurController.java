package org.efrei.start.controllers;

import org.efrei.start.models.Acteur;
import org.efrei.start.services.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/acteur")
public class ActeurController {

    private final ActorService service;

    @Autowired
    public ActeurController(ActorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<Acteur>> findAll() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Acteur> findById(@PathVariable String id) {
        Acteur acteur = service.findById(id);
        if (acteur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteById(@PathVariable String id) {
        Acteur acteur = service.findById(id);
        if (acteur == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        service.deleteById(id);
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Acteur acteur) {
        service.create(acteur);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


}
