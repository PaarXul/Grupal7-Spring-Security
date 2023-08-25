package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.Contacto;

import java.util.List;

public interface ContactoService {

    Contacto agrergarContacto(Contacto contacto) throws Exception;

    Contacto obtenerContactoPorId(Long id);

    void eliminarContacto(Long id);

    Contacto actualizarContacto(Contacto contacto) throws Exception;

    List<Contacto> obtenerContactos();

}
