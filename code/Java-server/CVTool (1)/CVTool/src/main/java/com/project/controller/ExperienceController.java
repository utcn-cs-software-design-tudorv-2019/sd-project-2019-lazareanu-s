package com.project.controller;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Cv;
import com.project.model.Experience;
import com.project.model.User;
import com.project.services.ExperienceService;

@RestController
@RequestMapping("/experience")
public class ExperienceController {

	@Autowired
	private ExperienceService experienceService;

	@GetMapping
	public List<Experience> getAll() {
		return experienceService.getAll();
	}

//	@PostMapping
//	@ResponseStatus(HttpStatus.OK)
//	public Experience add(@RequestBody Experience experience) {
//		return experienceService.save(experience);
//
//	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Experience add() {
		User user = new User();
		user.setName("Alex");
		user.setPhone("123");
		user.setEmail("email!email.ro");
		user.setUserName("alex");
		user.setPassword("123");
		user.setAddress("address");
		user.setProffesion("proffesion");
		// DateFormat dateFormat= new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		// Date date= new Date();
		user.setBirthDate(new Date(10));
		user.setPremium(false);

		Cv cv = new Cv();
		cv.setPath("C:");
		cv.setOtherQualifications("other");
		cv.setPersonalDescription("personal");
		cv.setUser(user);

		System.err.println(cv);
		Experience experience = new Experience();
		experience.setName("exp");
		experience.setStartDate(new Date(20));
		experience.setEndDate(new Date(30));
		experience.setCv(cv);

		System.err.println(experience);

		// ExperienceService expService = new ExperienceServiceImpl();
		// expService.save(experience);

		return experienceService.save(experience);

	}
}
