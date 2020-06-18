package com.sri.User.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sri.User.model.User;
import com.sri.User.model.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public List<User> getAllUsers() {

		return userRepository.findAll();
	}

	public User addUser(User user) {
		User saveduser = userRepository.save(user);
		return saveduser;
	}
	
	public User findUserbyId(Integer id) {
		return userRepository.findById(id).get();
	}
}
