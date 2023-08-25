package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.Asesoria;

import java.util.List;

public interface AsesoriaService {

    Asesoria agrergarAsesoria(Asesoria asesoria) throws Exception;

    Asesoria obtenerAsesoriaPorId(Long id);

    void eliminarAsesoria(Long id);

    Asesoria actualizarAsesoria(Asesoria asesoria) throws Exception;

    List<Asesoria> obtenerAsesorias();

}
