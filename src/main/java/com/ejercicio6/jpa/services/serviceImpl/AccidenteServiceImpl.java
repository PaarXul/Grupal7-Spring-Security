package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Accidente;
import com.ejercicio6.jpa.repositories.AccidenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ejercicio6.jpa.services.AccidenteService;

import java.util.List;

@Service
public class AccidenteServiceImpl  implements AccidenteService{

    private final AccidenteRepository accidenteRepository;

    @Autowired
    public AccidenteServiceImpl(AccidenteRepository accidenteRepository) {
        this.accidenteRepository = accidenteRepository;
    }
    @Override
    public Accidente agrergarAccidente(Accidente accidente) throws Exception {
        Accidente accidenteLocal = accidenteRepository.findById(accidente.getId()).orElse(null);
        if(accidenteLocal != null){
            throw new Exception("Ya existe un accidente con ese id");
        }else{
            accidenteLocal = accidenteRepository.save(accidente);
        }
        return accidenteLocal;
    }

    @Override
    public Accidente obtenerAccidentePorId(Long id) {
        return accidenteRepository.findById(id).orElseThrow(() -> new RuntimeException("Accidente no encontrado"));
    }

    @Override
    public void eliminarAccidente(Long id) {
        accidenteRepository.deleteById(id);
    }

    @Override
    public Accidente actualizarAccidente(Accidente accidente){
        return accidenteRepository.save(accidente);
    }

    @Override
    public List<Accidente> obtenerAccidentes() {
        return accidenteRepository.findAll();
    }
}
