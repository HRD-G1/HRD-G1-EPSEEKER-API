package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

public interface SubjectCategoryService {

	ArrayList<org.khmeracademy.epseeker.entities.SubjectCategory> findAll();
	
	org.khmeracademy.epseeker.entities.SubjectCategory findOne(int subjectCategoryID);
	
	boolean save(org.khmeracademy.epseeker.entities.SubjectCategory subCate);
	
	boolean update(org.khmeracademy.epseeker.entities.SubjectCategory subCate);
	
	boolean delete(int subjectCategoryID);
	
}
