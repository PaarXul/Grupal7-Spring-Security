package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface VisitaRepository extends JpaRepository<Visita, Long> {

    Optional<Visita> findByRut(Integer rut);

}
