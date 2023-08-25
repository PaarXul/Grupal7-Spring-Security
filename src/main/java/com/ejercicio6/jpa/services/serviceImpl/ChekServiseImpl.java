package com.ejercicio6.jpa.services.serviceImpl;

import com.ejercicio6.jpa.model.Chek;
import com.ejercicio6.jpa.repositories.ChekRepository;
import com.ejercicio6.jpa.services.ChekService;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class ChekServiseImpl implements ChekService {

    private final ChekRepository chekRepository;

    public ChekServiseImpl(ChekRepository chekRepository) {
        this.chekRepository = chekRepository;
    }

    @Override
    public Chek saveChek(Chek chek) {
        return chekRepository.save(chek);
    }

    @Override
    public Chek UpdateChek(Chek chek) {
        return chekRepository.save(chek);
    }

    @Override
    public Chek searchChekById(Long idChek) {
        return chekRepository.findById(idChek).orElse(null);
    }

    @Override
    public Set<Chek> SearchCheks() {
        return new HashSet<>(chekRepository.findAll());
    }

    @Override
    public void deleteChek(long idChek) {
        chekRepository.deleteById(idChek);

    }
}
