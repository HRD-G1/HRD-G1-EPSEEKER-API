package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Education;
import org.khmeracademy.epseeker.repositories.EducationRepository;
import org.khmeracademy.epseeker.services.EducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducationServiceImpl implements EducationService{

	@Autowired
	EducationRepository educationRepository;
	
	@Override
	public ArrayList<Education> findAll() {
		try{
			return educationRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Education edu) {
		try{
			return educationRepository.save(edu);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Education edu) {
		try{
			return educationRepository.update(edu);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID, int universityID, int majorID) {
		try{
			return educationRepository.delete(expertID, universityID, majorID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
