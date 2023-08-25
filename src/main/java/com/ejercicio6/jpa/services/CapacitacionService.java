package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.Capacitacion;

import java.util.Set;

public interface CapacitacionService {
    Capacitacion guardarCapacitacion(Capacitacion capacitacion);

    Capacitacion actualizarCapacitacion(Capacitacion capacitacion);

    void eliminarCapacitacion(Long id);

    Capacitacion buscarCapacitacionId(Long id);

    Set<Capacitacion> buscarCapacitaciones();

    Set<Capacitacion> buscarCapacitacionesPorDetalleCliente(Long id);



}
