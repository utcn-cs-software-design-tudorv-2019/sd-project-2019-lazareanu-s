package com.project.services;

import java.util.List;

import com.project.model.Language;

public interface LanguageService {

	Language save(Language language);

	List<Language> getAll();

}
