package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExperienceDetail;
import org.khmeracademy.epseeker.repositories.ExperienceDetailRepository;
import org.khmeracademy.epseeker.services.ExperienceDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceDetailServiceImpl implements ExperienceDetailService{

	@Autowired
	ExperienceDetailRepository experienceDetailRepository;

	@Override
	public ArrayList<ExperienceDetail> findAll() {
		try{
			return experienceDetailRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;	 
	}

	@Override
	public boolean save(ExperienceDetail experienceDetail) {
		try{
			return experienceDetailRepository.save(experienceDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(ExperienceDetail experienceDetail) {
		try{
			return experienceDetailRepository.update(experienceDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID, int institutionID, int majorID) {
		try{
			return experienceDetailRepository.delete(expertID, institutionID, majorID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	
}
