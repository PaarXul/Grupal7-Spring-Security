package com.ejercicio6.jpa.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "contacts")
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idContact;
	@Column(name = "creationDate")
	private Date creationDate;
	@Column(name = "userName")
	private String userName;
	@Column(name = "message")
	private String message;

	public Contact(int idContact, Date creationDate, String userName, String message) {
		super();
		this.idContact = idContact;
		this.creationDate = creationDate;
		this.userName = userName;
		this.message = message;
	}

	public Contact() {
		super();
	}

	public int getIdContact() {
		return idContact;
	}

	public void setIdContact(int idContact) {
		this.idContact = idContact;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "Contact [idContact=" + idContact + ", creationDate=" + creationDate + ", userName=" + userName
				+ ", message=" + message + "]";
	}

}
