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

import com.ejercicio6.jpa.model.User;
import com.ejercicio6.jpa.services.UsersService;

@RestController
@RequestMapping("api/v1/users")
public class UsersController {

	private final UsersService usersService;

	public UsersController(UsersService usersService) {
		this.usersService = usersService;
	}

	@GetMapping
	public List<User> usersList() {
		return usersService.getUsers();
	}

	@PostMapping
	public ResponseEntity<Object> saveUser(@RequestBody User user) {
		return usersService.newUser(user);
	}

	@PutMapping
	public ResponseEntity<Object> editUser(@RequestBody User userRequest) {
		return usersService.updateUser(userRequest);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Object> deleteUser(@PathVariable int id) {
		return usersService.deleteUser(id);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> getUserById(@PathVariable int id) {
		return usersService.getUser(id);
	}
}
