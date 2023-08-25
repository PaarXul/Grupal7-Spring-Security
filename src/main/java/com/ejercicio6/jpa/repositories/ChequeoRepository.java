package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.Chequeo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface ChequeoRepository  extends JpaRepository<Chequeo, Long> {

}
