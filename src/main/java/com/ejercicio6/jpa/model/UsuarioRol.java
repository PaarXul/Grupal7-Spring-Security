package com.ejercicio6.jpa.model;

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


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_administrativo_id", referencedColumnName = "id")
    private DetalleAdministrativo detalleAdministrativo;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_cliente_id", referencedColumnName = "id")
    private DetalleCliente detalleCliente;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "detalle_profesional_id", referencedColumnName = "id")
    private DetalleProfesional detalleProfesional;

    public UsuarioRol() {
    }

}
