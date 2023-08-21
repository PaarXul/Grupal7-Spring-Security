package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.DetalleProfesional;

import java.util.Set;

public interface DetalleProfesionalService {

    DetalleProfesional guardarProfesional(DetalleProfesional detalleProfesional) throws Exception;

    DetalleProfesional actualizarProfesional(DetalleProfesional detalleProfesional);

    void eliminarProfesional(Long id);

    DetalleProfesional obtenerProfesional(Long id);

    Set<DetalleProfesional> listarProfesionales();



}
