package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Subject;
import org.khmeracademy.epseeker.repositories.SubjectRepository;
import org.khmeracademy.epseeker.services.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectServiceImpl implements SubjectService{

	@Autowired
	SubjectRepository subjectRepository;
	
	@Override
	public ArrayList<Subject> findAll() {
		try{
			return subjectRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public Subject findOne(int subjectID) {
		try{
			return subjectRepository.findOne();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Subject sub) {
		try{
			return subjectRepository.save(sub);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Subject sub) {
		try{
			return subjectRepository.update(sub);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int subjectID) {
		try{
			return subjectRepository.delete(subjectID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<Subject> findAllBySubjectCategory(int subjectCategoryID) {
		try{
			return subjectRepository.findAllBySubjectCategory(subjectCategoryID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	
	
}
