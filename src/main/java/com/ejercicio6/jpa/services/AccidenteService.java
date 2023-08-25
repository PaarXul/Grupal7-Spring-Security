package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.Accidente;

import java.util.List;

public interface AccidenteService {

    Accidente agrergarAccidente(Accidente accidente) throws Exception;

    Accidente obtenerAccidentePorId(Long id);

    void eliminarAccidente(Long id);

    Accidente actualizarAccidente(Accidente accidente) throws Exception;

    List<Accidente> obtenerAccidentes();
}
