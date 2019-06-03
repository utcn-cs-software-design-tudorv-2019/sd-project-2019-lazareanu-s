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

import com.project.model.Education;
import com.project.services.EducationService;

@RestController
@RequestMapping("/education")
public class EducationController {

	@Autowired
	private EducationService educationService;

	@GetMapping
	public List<Education> getAll() {
		return educationService.getAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Education add(@RequestBody Education education) {
		System.err.println(education.getCv());
		return educationService.save(education);

	}

}
