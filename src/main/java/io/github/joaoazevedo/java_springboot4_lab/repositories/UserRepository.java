package io.github.joaoazevedo.java_springboot4_lab.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.github.joaoazevedo.java_springboot4_lab.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}