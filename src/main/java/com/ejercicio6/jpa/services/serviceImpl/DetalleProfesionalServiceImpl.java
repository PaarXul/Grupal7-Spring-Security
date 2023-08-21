package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.DetalleProfesional;
import com.ejercicio6.jpa.repositories.DetalleProfesionalRepository;
import com.ejercicio6.jpa.services.DetalleProfesionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.HashSet;
import java.util.Set;

@Service
public class DetalleProfesionalServiceImpl implements DetalleProfesionalService {
    private final DetalleProfesionalRepository detalleprofesionalRepository;

    @Autowired
    public DetalleProfesionalServiceImpl(DetalleProfesionalRepository detalleprofesionalRepository) {
        this.detalleprofesionalRepository = detalleprofesionalRepository;
    }



    @Override
    public DetalleProfesional guardarProfesional(DetalleProfesional detalleProfesional) throws Exception {
        DetalleProfesional detalleProfesionalLocal = detalleprofesionalRepository.findByUsuariorol(detalleProfesional.getUsuariorol());

        if (detalleProfesionalLocal != null) {
            throw new Exception("El detalleprofesional ya existe");
        } else {
            detalleProfesionalLocal = detalleprofesionalRepository.save(detalleProfesional);
        }
        return detalleProfesionalLocal;
    }

    @Override
    public DetalleProfesional actualizarProfesional(DetalleProfesional detalleProfesional) {
        return detalleprofesionalRepository.save(detalleProfesional);
    }

    @Override
    public void eliminarProfesional(Long id) {
        detalleprofesionalRepository.deleteById(id);
    }

    @Override
    public DetalleProfesional obtenerProfesional(Long id) {
        return detalleprofesionalRepository.findById(id).orElse(null);
    }

    @Override
    public Set<DetalleProfesional> listarProfesionales() {
        return new HashSet<>(detalleprofesionalRepository.findAll());
    }
}
