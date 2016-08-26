package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.University;
import org.khmeracademy.epseeker.utils.Pagination;

public interface UniversityService {

	ArrayList<University> findAll(Pagination pagination);
	
	boolean save(University uni);
	
	boolean update(University uni);
	
	boolean delete(int universityID);
	
}
