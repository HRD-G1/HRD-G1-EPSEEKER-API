package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertLanguageDetail;

public interface ExpertLanguageDetailService {

	ArrayList<ExpertLanguageDetail> findAll();
	
	ArrayList<ExpertLanguageDetail> findAllByExpertID(int expertID);
	
	boolean save(ExpertLanguageDetail expertLanguageDetail);
	
	boolean update(ExpertLanguageDetail expertLanguageDetail);
	
	boolean delete(int expertID, int languageID);
	
}
