package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.User;
import com.project.repository.UserRepository;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserRepository userRepo;
	
	@GetMapping
	public List<User> getAll(){
		return userRepo.findAll();
	}

}
