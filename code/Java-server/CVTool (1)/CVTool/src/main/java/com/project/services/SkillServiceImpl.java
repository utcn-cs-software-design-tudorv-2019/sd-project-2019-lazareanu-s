package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Skill;
import com.project.repository.SkillRepository;

@Service
public class SkillServiceImpl implements SkillService {

	@Autowired
	private SkillRepository skillRepo;

	@Override
	public Skill save(Skill skill) {
		return skillRepo.save(skill);
	}

	@Override
	public List<Skill> getAll() {
		return skillRepo.findAll();
	}

}
