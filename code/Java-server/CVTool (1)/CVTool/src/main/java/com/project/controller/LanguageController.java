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

import com.project.model.Language;
import com.project.services.LanguageService;

@RestController
@RequestMapping("/language")
public class LanguageController {

	@Autowired
	private LanguageService languageService;

	@GetMapping
	public List<Language> getAll() {
		return languageService.getAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Language add(@RequestBody Language language) {
		System.err.println(language.getCv());
		return languageService.save(language);

	}
}
