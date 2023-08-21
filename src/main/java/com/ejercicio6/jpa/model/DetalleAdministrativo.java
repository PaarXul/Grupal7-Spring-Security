package com.ejercicio6.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "detalle_administrativo")
public class DetalleAdministrativo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String area;
    private String experienciaPrevia;

    @OneToOne(fetch = FetchType.LAZY)
    private UsuarioRol usuariorol;

}