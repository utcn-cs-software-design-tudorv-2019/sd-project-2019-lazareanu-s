package com.project.services;

import java.util.List;

import com.project.model.User;

public interface UserService {
	List<User> getAll();

	User getByEmail(String email);

	User getById(Long Id);
	
	User login(String email, String password);
	
	User save(User user);

}
