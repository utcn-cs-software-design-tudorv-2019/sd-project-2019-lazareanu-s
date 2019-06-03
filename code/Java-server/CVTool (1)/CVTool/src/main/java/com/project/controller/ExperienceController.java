package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Experience;
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

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Experience add(@RequestBody Experience experience) {
		return experienceService.save(experience);

	}

}
