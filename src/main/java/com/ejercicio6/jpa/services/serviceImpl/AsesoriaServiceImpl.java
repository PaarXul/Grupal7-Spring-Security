package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Asesoria;
import com.ejercicio6.jpa.repositories.AsesoriaRepository;
import com.ejercicio6.jpa.services.AsesoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AsesoriaServiceImpl implements AsesoriaService {

    private final AsesoriaRepository asesoriaRepository;
    @Autowired
    public AsesoriaServiceImpl(AsesoriaRepository asesoriaRepository) {
        this.asesoriaRepository = asesoriaRepository;
    }


    @Override
    public Asesoria agrergarAsesoria(Asesoria asesoria) throws Exception {
        Asesoria asesoriaLocal = asesoriaRepository.findById(asesoria.getId()).orElse(null);
        if (asesoriaLocal != null) {
            throw new Exception("Ya existe una asesoria con ese id");
        } else {
            asesoriaLocal = asesoriaRepository.save(asesoria);
        }
        return asesoriaLocal;
    }

    @Override
    public Asesoria obtenerAsesoriaPorId(Long id) {
        return asesoriaRepository.findById(id).orElseThrow(() -> new RuntimeException("Asesoria no encontrada"));
    }

    @Override
    public void eliminarAsesoria(Long id) {
        asesoriaRepository.deleteById(id);
    }

    @Override
    public Asesoria actualizarAsesoria(Asesoria asesoria) throws Exception {
        return asesoriaRepository.save(asesoria);
    }

    @Override
    public List<Asesoria> obtenerAsesorias() {
        return asesoriaRepository.findAll();
    }
}
