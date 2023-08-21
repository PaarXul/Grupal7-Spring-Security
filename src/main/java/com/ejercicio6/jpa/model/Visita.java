package com.ejercicio6.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "visita")
public class Visita {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer rut;
    private Date fechaAccidente;
    private Date hora;
    private String lugar;
    private String comentario;


    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleCliente detalleCliente;

    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleProfesional detalleProfesional;

    @OneToMany(mappedBy = "visita", fetch = FetchType.LAZY)
    private Set<Chek> detalleVisita = new HashSet<Chek>();

}
