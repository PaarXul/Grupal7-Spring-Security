package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.PagosCapacitacion;

import java.util.Set;

public interface PagosCapacitacionService {

    PagosCapacitacion guardarPagosCapacitacion(PagosCapacitacion pagoscapacitacion);

    PagosCapacitacion actualizarPagosCapacitacion(PagosCapacitacion pagoscapacitacion);

    void eliminarPagosCapacitacion(Long id);

    PagosCapacitacion buscarPagosCapacitacion(Long id);

    Set<PagosCapacitacion> listarPagosCapacitacion();

    Set<PagosCapacitacion> listarPagosCapacitacionPorCapacitacion(Long id);

}
