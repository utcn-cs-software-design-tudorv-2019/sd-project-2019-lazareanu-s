package com.project.services;

import java.util.List;

import com.project.model.Cv;

public interface CvService {

	List<Cv> getAll();

	Cv save(Cv cv);

}
