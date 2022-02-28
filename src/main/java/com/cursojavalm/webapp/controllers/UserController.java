package com.cursojavalm.webapp.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojavalm.webapp.models.User;
import com.cursojavalm.webapp.services.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserService service;
	
	@RequestMapping
	public List<User> findAll() {
		return service.findAll();
	}
	
	@GetMapping("/{id}")
	public Optional<User> getUser(@PathVariable Long id) {
		return service.findById(id);
	}
	
	public User createUser() {
		return null;
	}
	
	public User updateUser() {
		return null;
	}
	
	public User deleteUser() {
		return null;
	}
	
	public User findUser() {
		return null;
	}
	

}
