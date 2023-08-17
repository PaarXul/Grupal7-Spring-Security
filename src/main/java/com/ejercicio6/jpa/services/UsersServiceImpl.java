package com.ejercicio6.jpa.services;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.ejercicio6.jpa.model.User;
import com.ejercicio6.jpa.repositories.UsersRepository;

@Service
public class UsersServiceImpl implements UsersService {

	private final UsersRepository usersRepository;

	public UsersServiceImpl(UsersRepository usersRepository) {
		this.usersRepository = usersRepository;
	}

	@Override
	public List<User> getUsers() {
		return usersRepository.findAll();
	}

	@Override
	public ResponseEntity<Object> newUser(User user) {
		Optional<User> result = usersRepository.findById(user.getIdUser());
		HashMap<String, Object> data = new HashMap<>();

		if (result.isPresent()) {
			data.put("error", true);
			data.put("message", "Already exists");
			return new ResponseEntity<>(data, HttpStatus.CONFLICT);
		}
		usersRepository.save(user);
		data.put("data", user);
		data.put("message", "Save Successfully");
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> updateUser(User user) {
		Optional<User> userToUpdate = usersRepository.findById(user.getIdUser());
		HashMap<String, Object> data = new HashMap<>();

		if (!userToUpdate.isPresent()) {
			data.put("error", true);
			data.put("message", "Not Found");
			return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
		}
		usersRepository.save(user);
		data.put("data", user);
		data.put("message", "Update Successfully");
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> deleteUser(int id) {
		HashMap<String, Object> data = new HashMap<>();

		if (!usersRepository.findById(id).isPresent()) {
			data.put("error", true);
			data.put("message", "Not Found");
			return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
		}
		usersRepository.deleteById(id);
		data.put("data", id);
		data.put("message", "Delete Successfully");
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<Object> getUser(int id) {
		HashMap<String, Object> data = new HashMap<>();
		Optional<User> user = usersRepository.findById(id);
		if (!user.isPresent()) {
			data.put("error", true);
			data.put("message", "Not Found");
			return new ResponseEntity<>(data, HttpStatus.NOT_FOUND);
		}
		data.put("data", user);
		return new ResponseEntity<>(data, HttpStatus.OK);
	}

}
