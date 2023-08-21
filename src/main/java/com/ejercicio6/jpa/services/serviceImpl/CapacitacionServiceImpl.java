package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Capacitacion;
import com.ejercicio6.jpa.model.DetalleCliente;
import com.ejercicio6.jpa.repositories.CapacitacionRepository;
import com.ejercicio6.jpa.repositories.DetalleClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejercicio6.jpa.services.CapacitacionService;

import java.util.HashSet;
import java.util.Set;

@Service
public class CapacitacionServiceImpl  implements CapacitacionService{

    private final CapacitacionRepository capacitacionRepository;
    private final DetalleClienteRepository detalleclienteRepository;

     @Autowired
    public CapacitacionServiceImpl(CapacitacionRepository capacitacionRepository, DetalleClienteRepository detalleclienteRepository) {
        this.capacitacionRepository = capacitacionRepository;
        this.detalleclienteRepository = detalleclienteRepository;
    }

    @Override
    public Capacitacion guardarCapacitacion(Capacitacion capacitacion) {
        return capacitacionRepository.save(capacitacion);
    }

    @Override
    public Capacitacion actualizarCapacitacion(Capacitacion capacitacion) {
        return capacitacionRepository.save(capacitacion);
    }

    @Override
    public void eliminarCapacitacion(Long id) {
        capacitacionRepository.deleteById(id);

    }

    @Override
    public Capacitacion buscarCapacitacionId(Long id) {
        return capacitacionRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Capacitacion> buscarCapacitaciones() {
        return new HashSet<>(capacitacionRepository.findAll());
    }

    @Override
    public Set<Capacitacion> buscarCapacitacionesPorDetalleCliente(Long id) {
         DetalleCliente detallecliente = detalleclienteRepository.findById(id).orElse(null);

        return capacitacionRepository.findByDetalleCliente(detallecliente);
    }
}
