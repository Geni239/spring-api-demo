package com.api.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.demo.entities.User;

public interface UserRepo extends JpaRepository<User, Long> {

}
