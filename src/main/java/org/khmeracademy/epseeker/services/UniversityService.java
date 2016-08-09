package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.University;

public interface UniversityService {

	ArrayList<University> findAll();
	
	boolean save(University uni);
	
	boolean update(University uni);
	
	boolean delete(int universityID);
	
}
