package com.sri.User.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sri.User.model.User;
import com.sri.User.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping("/home")
	public String home() {
		return "Home";
	}

	@GetMapping("/getUsers")
	public List<User> getUser() {
		return userService.getAllUsers();
	}

	@PostMapping("/addUser")
	public User saveUser(@RequestBody User user) {
		System.out.println("Here is the received user" + user);
		User addUser = userService.addUser(user);

		return addUser;
	}
}
