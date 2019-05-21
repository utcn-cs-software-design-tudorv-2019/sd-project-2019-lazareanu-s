package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Education;
import com.project.repository.EducationRepository;

@Service
public class EducationServiceImpl implements EducationService {

	@Autowired
	private EducationRepository educationRepo;

	@Override
	public Education save(Education education) {
		return educationRepo.save(education);
	}

	@Override
	public List<Education> getAll() {
		return educationRepo.findAll();
	}

}
