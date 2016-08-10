package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Education;

public interface EducationService {

	ArrayList<Education> findAll();
	
	boolean save(Education edu);
	
	boolean update(Education edu);
	
	boolean delete(int expertID, int universityID, int majorID);
	
}
