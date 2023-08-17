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

import com.ejercicio6.jpa.model.Contact;
import com.ejercicio6.jpa.services.ContactsService;

@RestController
@RequestMapping("api/v1/contacts")
public class ContactsController {

	private final ContactsService contactsService;

	public ContactsController(ContactsService contactsService) {
		this.contactsService = contactsService;
	}

	@GetMapping
	public List<Contact> contactsList() {
		return contactsService.getContacts();
	}

	@PostMapping
	public Contact saveContact(@RequestBody Contact contact) {
		return contactsService.newContact(contact);
	}

	@PutMapping
	public ResponseEntity<Object> editContact(@RequestBody Contact contactRequest) {
		return contactsService.updateContact(contactRequest);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteContact(@PathVariable int id) {
		return contactsService.deleteContact(id);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getContactById(@PathVariable int id) {
		return contactsService.getContact(id);
	}

}
