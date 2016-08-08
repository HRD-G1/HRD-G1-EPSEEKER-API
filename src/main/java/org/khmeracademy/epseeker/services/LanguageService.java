package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Language;

public interface LanguageService {

	ArrayList<Language> findAll();
	
	boolean save(Language lang);
	
	boolean update(Language lang);
	
	boolean delete(int languageID);
	
}
