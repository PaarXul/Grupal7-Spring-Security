package com.ejercicio6.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "asesoria")
public class Asesoria {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dia;
    private String hora;
    private String lugar;
    private String duracion;
    private String descripcion;
    private String estado;

    @ManyToOne(fetch = FetchType.EAGER)
    private DetalleProfesional detalleProfesional;

    @ManyToOne(fetch = FetchType.EAGER)
    private DetalleCliente detalleCliente;
}
