package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Experience;
import com.project.repository.ExperienceRepository;

@Service
public class ExperienceServiceImpl implements ExperienceService {

	@Autowired
	private ExperienceRepository experienceRepo;

	@Override
	public Experience save(Experience experience) {
		return experienceRepo.save(experience);
	}

	@Override
	public List<Experience> getAll() {
		return experienceRepo.findAll();
	}

}
