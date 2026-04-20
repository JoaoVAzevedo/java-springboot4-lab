package io.github.joaoazevedo.java_springboot4_lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.joaoazevedo.java_springboot4_lab.entities.User;
import io.github.joaoazevedo.java_springboot4_lab.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;
	
	public List<User> findAll() {
		return repository.findAll();
	}
	
	public User findById(long id) {		
		Optional<User> obj = repository.findById(id);
		return obj.get();
	}
}
