package org.efrei.start.repositories;

import org.efrei.start.models.Acteur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Acteur, String> {


}
