package com.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Language;
import com.project.repository.LanguageRepository;

@Service
public class LanguageServiceImpl implements LanguageService {

	@Autowired
	private LanguageRepository languageRepo;

	@Override
	public Language save(Language language) {
		return languageRepo.save(language);
	}

	@Override
	public List<Language> getAll() {
		return languageRepo.findAll();
	}

}
