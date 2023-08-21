package com.ejercicio6.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "usuario_rol")
public class UsuarioRol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioRolId;

    @ManyToOne(fetch = FetchType.EAGER)
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    private Rol rol;


    @OneToOne(mappedBy = "usuariorol" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private DetalleAdministrativo detalleAdministrativo;

    @OneToOne(fetch = FetchType.EAGER)
    private DetalleCliente detalleCliente;

    @OneToOne(mappedBy = "usuariorol", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private DetalleProfesional detalleProfesional;



    public UsuarioRol() {
    }

}
