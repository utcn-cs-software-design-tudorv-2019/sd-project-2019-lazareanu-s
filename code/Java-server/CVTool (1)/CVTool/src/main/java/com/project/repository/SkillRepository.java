package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Skill;

public interface SkillRepository extends JpaRepository<Skill, Long> {

}
