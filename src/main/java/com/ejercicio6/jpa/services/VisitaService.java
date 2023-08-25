package com.ejercicio6.jpa.services;



import com.ejercicio6.jpa.model.Visita;

import java.util.Set;

public interface VisitaService {

    Visita saveVisita(Visita visita);
    Visita UpdateVisita(Visita visita);
    Visita searchVisitaById(Long idVisita);
    Set<Visita> SearchVisita();
    void deleteVisita(long idVisita);
}
