package com.project.services;

import java.util.List;

import com.itextpdf.text.Document;
import com.project.model.Cv;

public interface CvService {

	List<Cv> getAll();

	Cv save(Cv cv);

	Document generatePdf(Cv cv);
	
	void showPdf(Cv cv);
	
	void delete(Cv cv);

}
