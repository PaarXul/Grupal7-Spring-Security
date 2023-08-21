package com.ejercicio6.jpa.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "chek")
public class Chek { //Cheklist Visita
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String Detalle;
    private String estado; //( 1 Sin Problemas, 2 Con Observaciones, 3 No Aprueba)

    @ManyToOne(fetch = FetchType.LAZY)
    private Visita visita;

}
