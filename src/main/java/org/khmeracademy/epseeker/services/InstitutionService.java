package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Institution;

public interface InstitutionService {

	ArrayList<Institution> findAll();
	
	boolean save(Institution institution);
	
	boolean update(Institution institution);
	
	boolean delete(int institutionID);

}
