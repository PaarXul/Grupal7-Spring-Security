package com.ejercicio6.jpa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ejercicio6.jpa.model.Training;

public interface TrainingsService {

	public List<Training> getTrainings();

	public ResponseEntity<Object> newTraining(Training training);

	public ResponseEntity<Object> updateTraining(Training training);

	public ResponseEntity<Object> deleteTraining(int id);

	public ResponseEntity<Object> getTraining(int id);
}
