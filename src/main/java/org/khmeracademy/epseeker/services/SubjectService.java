package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Subject;

public interface SubjectService {

	ArrayList<Subject> findAll();
	
	Subject findOne(int subjectID);
	
	ArrayList<Subject> findAllBySubjectCategory(int subjectCategoryID);
	
	boolean save(Subject sub);
	
	boolean update(Subject sub);
	
	boolean delete(int subjectID);
	
}
