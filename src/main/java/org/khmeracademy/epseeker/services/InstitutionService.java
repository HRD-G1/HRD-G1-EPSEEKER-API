package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Institution;
import org.khmeracademy.epseeker.utils.Pagination;

public interface InstitutionService {

	ArrayList<Institution> findAll(Pagination paginations);
	
	boolean save(Institution institution);
	
	boolean update(Institution institution);
	
	boolean delete(int institutionID);

}
