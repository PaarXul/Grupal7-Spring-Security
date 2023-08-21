package com.ejercicio6.jpa.repositories;


import com.ejercicio6.jpa.model.DetalleAdministrativo;
import com.ejercicio6.jpa.model.Usuario;
import com.ejercicio6.jpa.model.UsuarioRol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories
public interface DetalleAdministrativoRepository extends JpaRepository<DetalleAdministrativo, Long> {

    DetalleAdministrativo findByUsuariorol(UsuarioRol usuarioRol);

}
