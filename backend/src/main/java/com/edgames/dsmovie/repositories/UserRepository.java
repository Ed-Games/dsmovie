package com.edgames.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edgames.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
