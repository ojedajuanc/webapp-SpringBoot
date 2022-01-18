package com.cursojavalm.webapp.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursojavalm.webapp.models.User;

@RestController
public class UserController {
	
	@RequestMapping(value = "user/{id}")
	public User getUser(@PathVariable int id) {
		User user = new User();
		user.setId(id);
		user.setName("Juan Carlos");
		user.setLastname("Ojeda");
		user.setTelephone("5491156781234");
		user.setMail("test@mail.com");
		user.setPassword("password");
		return user;
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
	
	public User findAll() {
		return null;
	}

}
