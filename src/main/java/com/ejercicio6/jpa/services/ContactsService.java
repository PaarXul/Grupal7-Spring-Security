package com.ejercicio6.jpa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ejercicio6.jpa.model.Contact;

public interface ContactsService {

	public List<Contact> getContacts();

	public Contact newContact(Contact contact);

	public ResponseEntity<Object> updateContact(Contact contact);

	public ResponseEntity<Object> deleteContact(int id);

	public ResponseEntity<Object> getContact(int id);
}
