package com.ejercicio6.jpa.services;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.ejercicio6.jpa.model.User;

public interface UsersService {

	public List<User> getUsers();

	public ResponseEntity<Object> newUser(User user);

	public ResponseEntity<Object> updateUser(User user);

	public ResponseEntity<Object> deleteUser(int id);

	public ResponseEntity<Object> getUser(int id);
}
