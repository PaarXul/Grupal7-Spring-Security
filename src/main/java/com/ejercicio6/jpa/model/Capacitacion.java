package com.ejercicio6.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "capacitacion")
public class Capacitacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private int cantidadAsistentes;

    private Double ValorAPagar;

    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleCliente detalleCliente;

    @OneToMany(mappedBy = "capacitacion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<PagosCapacitacion> pagosCapacitacion = new HashSet<>();

    @OneToMany(mappedBy = "capacitacion", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonIgnore
    private Set<Asistentes> asistentes = new HashSet<>();

}
