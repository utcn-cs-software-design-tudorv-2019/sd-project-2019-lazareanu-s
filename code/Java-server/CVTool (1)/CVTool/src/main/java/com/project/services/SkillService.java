package com.project.services;

import java.util.List;

import com.project.model.Skill;

public interface SkillService {

	Skill save(Skill skill);

	List<Skill> getAll();

}
