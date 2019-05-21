package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Cv;
import com.project.repository.CvRepository;

@Service
public class CvServiceImpl implements CvService {

	@Autowired
	private CvRepository cvRepo;

	@Override
	public Cv save(Cv cv) {
		return cvRepo.save(cv);
	}

	@Override
	public List<Cv> getAll() {
		return cvRepo.findAll();
	}

}
