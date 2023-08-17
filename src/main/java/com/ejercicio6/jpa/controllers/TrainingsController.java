package com.ejercicio6.jpa.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ejercicio6.jpa.model.Training;
import com.ejercicio6.jpa.services.TrainingsService;

@RestController
@RequestMapping("api/v1/trainings")
public class TrainingsController {

	private TrainingsService trainingsService;

	public TrainingsController(TrainingsService trainingsService) {
		this.trainingsService = trainingsService;
	}

	@GetMapping
	public List<Training> trainingsList() {
		return trainingsService.getTrainings();
	}

	@PostMapping
	public ResponseEntity<Object> saveTraining(@RequestBody Training training) {
		return trainingsService.newTraining(training);
	}

	@PutMapping
	public ResponseEntity<Object> editTraining(@RequestBody Training training) {
		return trainingsService.updateTraining(training);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deteleTraining(@PathVariable int id) {
		return trainingsService.deleteTraining(id);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getTrainingById(@PathVariable int id) {
		return trainingsService.getTraining(id);
	}
}
