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

import com.project.model.Cv;
import com.project.services.CvService;

@RestController
@RequestMapping("/cv")
public class CvController {

	@Autowired
	private CvService cvService;

	@GetMapping
	public List<Cv> getAll() {
		return cvService.getAll();
	}

	@PostMapping("/generate")
	@ResponseStatus(HttpStatus.OK)
	public void generateCv(@RequestBody Cv cv) {
		cvService.generatePdf(cv);
	}

	@PostMapping("/showPdf")
	@ResponseStatus(HttpStatus.OK)
	public void showsPdf(@RequestBody Cv cv) {
		cvService.showPdf(cv);
	}

	@PostMapping
	@ResponseStatus(HttpStatus.OK)
	public Cv add(@RequestBody Cv cv) {
		return cvService.save(cv);

	}
	
	@PostMapping("/delete")
	@ResponseStatus(HttpStatus.OK)
	public void delete(@RequestBody Cv cv) {
		cvService.delete(cv);
	}

}
