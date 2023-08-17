package com.ejercicio6.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ejercicio6.jpa.model.Contact;

public interface ContactsRepository extends JpaRepository<Contact, Integer> {

}
