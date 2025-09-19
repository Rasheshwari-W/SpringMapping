package com.techlabs.security.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techlabs.security.entity.User;

public interface UserRepo extends JpaRepository<User, Integer>{

	Optional<User> findByUsername(String username);

 	boolean existsByUsername(String username);

}
