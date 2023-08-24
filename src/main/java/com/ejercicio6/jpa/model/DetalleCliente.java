package com.ejercicio6.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "detalle_cliente")
public class DetalleCliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombres;
    private String apellidos;
    private String telefono;
    private String afp;
    private int sistemaSalud;
    private String direccion;
    private String comuna;

    @OneToOne(mappedBy = "detalleCliente")
    @JsonIgnoreProperties("detalleCliente")
    private UsuarioRol usuariorol;

    @OneToMany(mappedBy = "detalleCliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Visita> visita = new HashSet<Visita>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detalleCliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Capacitacion> capacitaciones = new HashSet<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "detalleCliente", cascade = CascadeType.ALL)
    @JsonIgnore
    private Set<Accidente> accidentes = new HashSet<>();

}