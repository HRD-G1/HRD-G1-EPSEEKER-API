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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(SubjectCategory subCate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean update(SubjectCategory subCate) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(SubjectCategory subCate) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
}
