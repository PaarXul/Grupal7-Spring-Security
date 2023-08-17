package com.ejercicio6.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejercicio6.jpa.model.Training;

public interface TrainingsRepository extends JpaRepository<Training, Integer> {

}
