package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Asistentes;
import com.ejercicio6.jpa.model.Capacitacion;
import com.ejercicio6.jpa.repositories.AsistentesRepository;
import com.ejercicio6.jpa.repositories.CapacitacionRepository;
import com.ejercicio6.jpa.services.AsistentesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;



@Service
public class AsistentesServiceImpl implements AsistentesService {

    private final AsistentesRepository asistentesRepository;
    private final CapacitacionRepository capacitacionRepository;

    @Autowired
    public AsistentesServiceImpl(AsistentesRepository asistentesRepository, CapacitacionRepository capacitacionRepository) {
        this.asistentesRepository = asistentesRepository;
        this.capacitacionRepository = capacitacionRepository;
    }
    @Override
    public Asistentes guardarAsistentes(Asistentes asistentes)  {

        return asistentesRepository.save(asistentes);
    }

    @Override
    public Asistentes actualizarAsistentes(Asistentes asistentes) {
        return asistentesRepository.save(asistentes);
    }

    @Override
    public void eliminarAsistentes(Long id) {
        asistentesRepository.deleteById(id);
    }

    @Override
    public Asistentes buscarAsistentes(Long id) {
        return asistentesRepository.findById(id).orElse(null);
    }

    @Override
    public Set<Asistentes> obtenerAsistentes() {
        return new HashSet<>(asistentesRepository.findAll());
    }

    @Override
    public Set<Asistentes> obtenerAsistentesPorCapacitacion(Long id) {
        Capacitacion capacitacion = capacitacionRepository.findById(id).orElse(null);
        return new HashSet<>(asistentesRepository.findAsistentesByCapacitacion(capacitacion));
    }
}
