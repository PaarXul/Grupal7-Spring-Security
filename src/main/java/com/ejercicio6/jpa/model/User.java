package com.ejercicio6.jpa.model;

import java.sql.Date;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idUser;
	@Column(name = "userName")
	private String userName;
	@Column(name = "userRun")
	private String userRun;
	@Column(name = "birthDate")
	private Date birthDate;

	public User() {
		super();
	}

	public User(int idUser, String userName, String userRun, Date birthDate) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.userRun = userRun;
		this.birthDate = birthDate;
	}

	public User(int idUser, String userName, String userRun, String birthDate) {
		super();
		this.idUser = idUser;
		this.userName = userName;
		this.userRun = userRun;
		this.birthDate = Date.valueOf(birthDate);
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRun() {
		return userRun;
	}

	public void setUserRun(String userRun) {
		this.userRun = userRun;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", userName=" + userName + ", userRun=" + userRun + ", birthDate=" + birthDate
				+ "]";
	}
}
