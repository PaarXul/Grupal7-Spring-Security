package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Visita;
import com.ejercicio6.jpa.repositories.VisitaRepository;
import com.ejercicio6.jpa.services.VisitaService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;
@Service
public class VisitaServiceImpl implements VisitaService {

    private final VisitaRepository visitaRepository;

    public VisitaServiceImpl(VisitaRepository visitaRepository) {
        this.visitaRepository = visitaRepository;
    }


    @Override
    public Visita saveVisita(Visita visita) {
        return visitaRepository.save(visita);
    }

    @Override
    public Visita UpdateVisita(Visita visita) {
        return visitaRepository.save(visita);
    }

    @Override
    public Visita searchVisitaById(Long idVisita) {
        return visitaRepository.findById(idVisita).orElse(null);
    }

    @Override
    public Set<Visita> SearchVisita() {
        return new HashSet<>(visitaRepository.findAll());
    }

    @Override
    public void deleteVisita(long idVisita) {
        visitaRepository.deleteById(idVisita);
    }
}
