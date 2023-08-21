package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Capacitacion;
import com.ejercicio6.jpa.model.PagosCapacitacion;
import com.ejercicio6.jpa.repositories.CapacitacionRepository;
import com.ejercicio6.jpa.repositories.PagosCapacitacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejercicio6.jpa.services.PagosCapacitacionService;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Service
public class PagosCapacitacionServiceImpl implements PagosCapacitacionService{

    private final PagosCapacitacionRepository pagoscapacitacionRepository;
    private final CapacitacionRepository capacitacionRepository;

    @Autowired
    public PagosCapacitacionServiceImpl(PagosCapacitacionRepository pagoscapacitacionRepository, CapacitacionRepository capacitacionRepository) {
        this.pagoscapacitacionRepository = pagoscapacitacionRepository;
        this.capacitacionRepository = capacitacionRepository;
    }


    @Override
    public PagosCapacitacion guardarPagosCapacitacion(PagosCapacitacion pagoscapacitacion) {
        return pagoscapacitacionRepository.save(pagoscapacitacion);
    }

    @Override
    public PagosCapacitacion actualizarPagosCapacitacion(PagosCapacitacion pagoscapacitacion) {
        return pagoscapacitacionRepository.save(pagoscapacitacion);
    }

    @Override
    public void eliminarPagosCapacitacion(Long id) {
        pagoscapacitacionRepository.deleteById(id);
    }

    @Override
    public PagosCapacitacion buscarPagosCapacitacion(Long id) {
        return pagoscapacitacionRepository.findById(id).orElse(null);
    }

    @Override
    public Set<PagosCapacitacion> listarPagosCapacitacion() {
        return  new HashSet<>(pagoscapacitacionRepository.findAll());
    }

    @Override
    public Set<PagosCapacitacion> listarPagosCapacitacionPorCapacitacion(Long id) {
        Capacitacion capacitacion = capacitacionRepository.findById(id).orElse(null);
        return new HashSet<>(pagoscapacitacionRepository.findByCapacitacion(capacitacion));
    }

}
