package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.Capacitacion;
import com.ejercicio6.jpa.model.PagosCapacitacion;
import com.ejercicio6.jpa.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@EnableJpaRepositories
public interface PagosCapacitacionRepository extends JpaRepository<PagosCapacitacion, Long> {

    Set <PagosCapacitacion> findByCapacitacion (Capacitacion capacitacion);

}
