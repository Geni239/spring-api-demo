package com.api.demo.services;

import java.util.List;

import com.api.demo.entities.User;
public interface UserService {


	List<User> getAllUsers();
	void addUser(User user);
	
}
