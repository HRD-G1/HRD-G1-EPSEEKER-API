package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Subject;
import org.khmeracademy.epseeker.utils.Pagination;

public interface SubjectService {

	ArrayList<Subject> findAll(Pagination pagination);
	
	Subject findOne(int subjectID);
	
	ArrayList<Subject> countSkill();
	
	ArrayList<Subject> findAllBySubjectCategory(int subjectCategoryID);
	
	boolean save(Subject sub);
	
	boolean update(Subject sub);
	
	boolean delete(int subjectID);
	
}
