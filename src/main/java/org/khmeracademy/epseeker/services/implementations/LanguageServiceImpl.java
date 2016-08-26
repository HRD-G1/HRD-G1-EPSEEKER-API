package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Language;
import org.khmeracademy.epseeker.repositories.LanguageRepository;
import org.khmeracademy.epseeker.services.LanguageService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService{

	@Autowired
	LanguageRepository languageRepository;
	
	@Override
	public ArrayList<Language> findAll(Pagination pagination) {
		try{
			pagination.setTotalCount(languageRepository.findAllAndCount());
			int limit = pagination.getLimit();
			int offset = pagination.getOffset();
			return languageRepository.findAll(limit, offset);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Language lang) {
		try{
			return languageRepository.save(lang);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Language lang) {
		try{
			return languageRepository.update(lang);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int languageID) {
		try{
			return languageRepository.delete(languageID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
