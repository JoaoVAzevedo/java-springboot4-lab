package io.github.joaoazevedo.java_springboot4_lab.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.joaoazevedo.java_springboot4_lab.entities.Category;
import io.github.joaoazevedo.java_springboot4_lab.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository repository;
	
	public List<Category> findAll() {
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
}
