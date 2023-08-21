package com.ejercicio6.jpa.repositories;

import com.ejercicio6.jpa.model.DetalleCliente;
import com.ejercicio6.jpa.model.DetalleProfesional;
import com.ejercicio6.jpa.model.Usuario;
import com.ejercicio6.jpa.model.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DetalleProfesionalRepository extends JpaRepository<DetalleProfesional, Long> {

    DetalleProfesional findByUsuariorol(UsuarioRol usuariorol);

}
