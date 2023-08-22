package com.ejercicio6.jpa.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
@Table(name = "detalle_profesional")
public class DetalleProfesional {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titulo;
    private Date fechaIngreso;

    @OneToOne(mappedBy = "detalleProfesional")
    @JsonIgnore
    private UsuarioRol usuariorol;

    @OneToMany(mappedBy = "detalleProfesional", fetch = FetchType.LAZY)
    private Set<Visita> visita = new HashSet<Visita>();

}
