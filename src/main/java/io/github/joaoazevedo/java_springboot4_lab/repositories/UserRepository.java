package io.github.joaoazevedo.java_springboot4_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.joaoazevedo.java_springboot4_lab.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}