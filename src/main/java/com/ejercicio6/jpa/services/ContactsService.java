package com.ejercicio6.jpa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ejercicio6.jpa.model.Contacto;

public interface ContactsService {

	public List<Contacto> getContacts();

	public Contacto newContact(Contacto contacto);

	public ResponseEntity<Object> updateContact(Contacto contacto);

	public ResponseEntity<Object> deleteContact(int id);

	public ResponseEntity<Object> getContact(int id);
}
