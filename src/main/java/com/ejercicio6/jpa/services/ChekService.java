package com.ejercicio6.jpa.services;

import com.ejercicio6.jpa.model.Chek;

import java.util.Set;

public interface ChekService {

    Chek saveChek(Chek chek);
    Chek UpdateChek(Chek chek);
    Chek searchChekById(Long idChek);
    Set<Chek> SearchCheks();
    void deleteChek(long idChek);
}
