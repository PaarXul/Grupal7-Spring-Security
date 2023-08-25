package com.ejercicio6.jpa.services;
import com.ejercicio6.jpa.model.UsuarioRol;
import com.ejercicio6.jpa.model.Chequeo;

import java.util.Set;

public interface ChequeoService {
    Chequeo guardarChequeo(Chequeo chequeo);

    Chequeo actualizarChequeo(Chequeo chequeo);

    Chequeo obtenerChequeoPorId(Long id);

    void eliminarChequeo(Long chequeoId);

    Set<Chequeo> obtenerChequeos();


}
