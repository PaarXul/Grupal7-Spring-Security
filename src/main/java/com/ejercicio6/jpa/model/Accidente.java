package com.ejercicio6.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "accidente")
public class Accidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dia;
    private String hora;
    private String lugar;
    private String descripcion;
    private String estado;
    private String tipo;
    private String gravedad;

    @ManyToOne(fetch = FetchType.EAGER)
    private DetalleCliente detalleCliente;
}
