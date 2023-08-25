package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Chequeo;
import com.ejercicio6.jpa.repositories.ChequeoRepository;
import com.ejercicio6.jpa.repositories.DetalleClienteRepository;
import com.ejercicio6.jpa.services.ChequeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ChequeoServiceImpl implements ChequeoService {

    private final ChequeoRepository chequeoRepository;
    private final DetalleClienteRepository detalleclienteRepository;

    @Autowired
    public ChequeoServiceImpl(ChequeoRepository chequeoRepository, DetalleClienteRepository detalleclienteRepository) {

        this.chequeoRepository = chequeoRepository;
        this.detalleclienteRepository = detalleclienteRepository;
    }

    @Override
    public Chequeo guardarChequeo(Chequeo chequeo) {
        return chequeoRepository.save(chequeo);
    }

    @Override
    public Chequeo obtenerChequeoPorId(Long id) {
        return chequeoRepository.findById(id).orElse(null);
    }

    @Override
    public void eliminarChequeo(Long chequeoId) {
        chequeoRepository.deleteById(chequeoId);
    }

    @Override
    public Set<Chequeo> obtenerChequeos() {
        return new HashSet<>(chequeoRepository.findAll());
    }

    @Override
    public Chequeo actualizarChequeo(Chequeo chequeo) {
        return chequeoRepository.save(chequeo);
    }
}
