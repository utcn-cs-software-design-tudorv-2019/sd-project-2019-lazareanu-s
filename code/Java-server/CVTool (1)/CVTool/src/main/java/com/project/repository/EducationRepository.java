package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Education;

public interface EducationRepository extends JpaRepository<Education, Long> {

}
