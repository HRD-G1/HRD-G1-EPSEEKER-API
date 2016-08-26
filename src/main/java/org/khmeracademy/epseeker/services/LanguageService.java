package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Language;
import org.khmeracademy.epseeker.utils.Pagination;

public interface LanguageService {

	ArrayList<Language> findAll(Pagination pagination);
	
	boolean save(Language lang);
	
	boolean update(Language lang);
	
	boolean delete(int languageID);
	
}
