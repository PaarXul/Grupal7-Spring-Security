package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.Chek;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ChekRepository extends JpaRepository<Chek, Long> {
    Optional<Chek> findByNombre(String nombre);
}
