package com.project.services;

import java.security.MessageDigest;
import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.project.model.User;
import com.project.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepo;

	@Override
	public List<User> getAll() {
		return userRepo.findAll();

	}

	@Override
	public User getByEmail(String email) {
		User result = null;
		List<User> allUsers = getAll();
		for (User user : allUsers) {
			if (user.getEmail().equals(email)) {
				result = user;
				break;
			}
		}
		return result;
	}

	@Override
	public User getById(Long Id) {
		return null;
	}

	@Override
	public User login(String email, String password) {
		User currentUser = getByEmail(email);
		if (!Objects.isNull(currentUser)) {
			if (encodePassword(password).equals(currentUser.getPassword())) {
				// if (currentUser.getPassword().equals(password)) {
				return currentUser;
			}
		}
		return null;
	}

//	@PostMapping
//	@ResponseStatus(HttpStatus.OK)
	@Override
	public User save(@RequestBody User user) {
		user.setPassword(encodePassword(user.getPassword()));
		return userRepo.save(user);
	}

	private String encodePassword(String password) {
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(password.getBytes("UTF-8"));
			StringBuilder hexString = new StringBuilder();

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			return hexString.toString();
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}
	}

}
