package com.api.demo.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.api.demo.entities.User;
import com.api.demo.repository.UserRepo;
import com.api.demo.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo userRepository;

	@Override
	public List<User> getAllUsers() {
		List<User> uList = userRepository.findAll();
		return uList;
	}

	@Override
	public void addUser(User user) {
		try {
			this.userRepository.save(user);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
