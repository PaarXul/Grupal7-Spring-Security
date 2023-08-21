package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.Capacitacion;
import com.ejercicio6.jpa.model.DetalleCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@EnableJpaRepositories
public interface CapacitacionRepository extends JpaRepository<Capacitacion, Long> {

    Set<Capacitacion> findByDetalleCliente (DetalleCliente detallecliente);



}
