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

import com.project.model.Skill;
import com.project.services.SkillService;

@RestController
@RequestMapping("/skill")
public class SkillController {

	@Autowired
	private SkillService skillService;

	@GetMapping
	public List<Skill> getAll() {
		return skillService.getAll();
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Skill add(@RequestBody Skill skill) {
		return skillService.save(skill);

	}

	@PostMapping("/delete")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@RequestBody Skill skill) {
		skillService.delete(skill);
	}

}
