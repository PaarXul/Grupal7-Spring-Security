package com.ejercicio6.jpa.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trainings")
public class Training {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idTraining;
	@Column(name = "clientRun")
	private String clientRun;
	@Column(name = "trainingDate")
	private Date trainingDate;
	@Column(name = "trainingTime")
	private String trainingTime;
	@Column(name = "trainingPlace")
	private String trainingPlace;
	@Column(name = "trainingDuration")
	private String trainingDuration;
	@Column(name = "attendeesNumber")
	private int attendeesNumber;

	public Training() {
		super();
	}

	public Training(int idTraining, String clientRun, Date trainingDate, String trainingTime, String trainingPlace,
			String trainingDuration, int attendeesNumber) {
		super();
		this.idTraining = idTraining;
		this.clientRun = clientRun;
		this.trainingDate = trainingDate;
		this.trainingTime = trainingTime;
		this.trainingPlace = trainingPlace;
		this.trainingDuration = trainingDuration;
		this.attendeesNumber = attendeesNumber;
	}

	public Training(int idTraining, String clientRun, String trainingDate, String trainingTime, String trainingPlace,
			String trainingDuration, int attendeesNumber) {
		super();
		this.idTraining = idTraining;
		this.clientRun = clientRun;
		this.trainingDate = Date.valueOf(trainingDate);
		this.trainingTime = trainingTime;
		this.trainingPlace = trainingPlace;
		this.trainingDuration = trainingDuration;
		this.attendeesNumber = attendeesNumber;
	}

	public int getIdTraining() {
		return idTraining;
	}

	public void setIdTraining(int idTraining) {
		this.idTraining = idTraining;
	}

	public String getClientRun() {
		return clientRun;
	}

	public void setClientRun(String clientRun) {
		this.clientRun = clientRun;
	}

	public Date getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}

	public String getTrainingTime() {
		return trainingTime;
	}

	public void setTrainingTime(String trainingTime) {
		this.trainingTime = trainingTime;
	}

	public String getTrainingPlace() {
		return trainingPlace;
	}

	public void setTrainingPlace(String trainingPlace) {
		this.trainingPlace = trainingPlace;
	}

	public String getTrainingDuration() {
		return trainingDuration;
	}

	public void setTrainingDuration(String trainingDuration) {
		this.trainingDuration = trainingDuration;
	}

	public int getAttendeesNumber() {
		return attendeesNumber;
	}

	public void setAttendeesNumber(int attendeesNumber) {
		this.attendeesNumber = attendeesNumber;
	}

	@Override
	public String toString() {
		return "Training [idTraining=" + idTraining + ", clientRun=" + clientRun + ", trainingDate=" + trainingDate
				+ ", trainingTime=" + trainingTime + ", trainingPlace=" + trainingPlace + ", trainingDuration="
				+ trainingDuration + ", attendeesNumber=" + attendeesNumber + "]";
	}
}
