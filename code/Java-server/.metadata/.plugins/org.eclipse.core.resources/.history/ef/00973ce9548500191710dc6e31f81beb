package com.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
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

}
