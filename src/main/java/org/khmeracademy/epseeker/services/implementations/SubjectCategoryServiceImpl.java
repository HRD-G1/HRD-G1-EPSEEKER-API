package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.SubjectCategory;
import org.khmeracademy.epseeker.repositories.SubjectCategoryRepository;
import org.khmeracademy.epseeker.services.SubjectCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectCategoryServiceImpl implements SubjectCategoryService{
	
	@Autowired
	SubjectCategoryRepository subjectCategoryRepository;

	@Override
	public ArrayList<SubjectCategory> findAll() {
		try{
			return subjectCategoryRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public SubjectCategory findOne(int subjectCategoryID) {
		try{
			return subjectCategoryRepository.findOne(subjectCategoryID);
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public boolean save(SubjectCategory subCate) {
		try{
			return subjectCategoryRepository.save(subCate);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean update(SubjectCategory subCate) {
		try{
			return subjectCategoryRepository.update(subCate);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public boolean delete(int subjectCategoryID) {
		try{
			return subjectCategoryRepository.delete(subjectCategoryID);
		}catch(Exception e){
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public SubjectCategory findOneByName(String subjectCategoryName) {
		try{
			return subjectCategoryRepository.findOneByName(subjectCategoryName);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	
	
}
