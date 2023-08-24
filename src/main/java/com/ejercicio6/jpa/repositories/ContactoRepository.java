package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.Contacto;
import com.ejercicio6.jpa.model.DetalleCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
@EnableJpaRepositories
public interface ContactoRepository extends JpaRepository<Contacto, Long> {

    Set<Contacto> findByDetalleCliente (DetalleCliente detalleCliente);

}
