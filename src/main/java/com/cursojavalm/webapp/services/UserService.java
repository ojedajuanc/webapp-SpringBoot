package com.cursojavalm.webapp.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.cursojavalm.webapp.models.User;
import com.cursojavalm.webapp.repository.UserRepository;

public class UserService {

	@Autowired
	private UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public Optional<User> findById(Long id) {
		return repository.findById(id);
	}
	
}
