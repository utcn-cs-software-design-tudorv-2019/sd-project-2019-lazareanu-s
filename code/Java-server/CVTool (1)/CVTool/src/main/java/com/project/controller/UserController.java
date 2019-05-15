package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.services.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private UserService userService;

	@GetMapping
	public List<User> getAll() {
		return userService.getAll();
	}

	@GetMapping("/{email}")
	public User getUserByEmail(@PathVariable("email") String email) {
		return userService.getByEmail(email);
	}
	
	@GetMapping("/{email}/{password}")
	public User login(@PathVariable("email")String email,@PathVariable("password")String password) {
		return userService.login(email, password);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public User addUser(@RequestBody User user) {
		return userService.save(user);

	}

}
