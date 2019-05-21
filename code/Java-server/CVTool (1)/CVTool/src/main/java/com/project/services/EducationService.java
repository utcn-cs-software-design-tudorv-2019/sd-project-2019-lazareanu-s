package com.project.services;

import java.util.List;

import com.project.model.Education;

public interface EducationService {

	Education save(Education education);

	List<Education> getAll();

}
