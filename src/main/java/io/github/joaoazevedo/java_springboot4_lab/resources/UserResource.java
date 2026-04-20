package io.github.joaoazevedo.java_springboot4_lab.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.joaoazevedo.java_springboot4_lab.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "João", "joao@gmail.com", "9999999", "1234");
		return ResponseEntity.ok().body(u);
	}
}
