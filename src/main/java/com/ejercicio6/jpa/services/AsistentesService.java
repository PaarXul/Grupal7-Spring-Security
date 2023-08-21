package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.Asistentes;

import java.util.Set;

public interface AsistentesService {

    Asistentes guardarAsistentes(Asistentes asistentes);

    Asistentes actualizarAsistentes(Asistentes asistentes);

    void eliminarAsistentes(Long id);

    Asistentes buscarAsistentes(Long id);

    Set<Asistentes> obtenerAsistentes();

    Set<Asistentes> obtenerAsistentesPorCapacitacion(Long id);


}
