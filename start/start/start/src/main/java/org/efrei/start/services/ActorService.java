package org.efrei.start.services;

import org.efrei.start.models.Acteur;
import org.efrei.start.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActorService {

    private final ActorRepository repository;

    @Autowired
    public ActorService(ActorRepository repository) {
        this.repository = repository;
    }

    public List<Acteur> findAll(){
        // SELECT * from actor
        System.out.println(repository.findAll());
        return repository.findAll();
    }

    public void create(Acteur acteur) {
        // INSERT INTO actor VALUES(":firstname", ":values")
        repository.save(acteur);
    }

    public Acteur findById(String id) {
        // SELECT * FROM actor WERE id = :id
        return repository.findById(id).orElse(null);
    }

    public void deleteById(String id) {
        repository.deleteById(id);
    }

}
