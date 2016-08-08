package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertSubjectDetail;
import org.khmeracademy.epseeker.repositories.ExpertSubjectDetailRepository;
import org.khmeracademy.epseeker.services.ExpertSubjectDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertSubjectDetailServiceImpl implements ExpertSubjectDetailService{
	
	@Autowired
	ExpertSubjectDetailRepository expertSubjectDetailRepository;

	@Override
	public ArrayList<ExpertSubjectDetail> findAll() {
		try{
			return expertSubjectDetailRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(ExpertSubjectDetail expertSubjectDetail) {
		try{
			return expertSubjectDetailRepository.save(expertSubjectDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(ExpertSubjectDetail expertSubjectDetail) {
		try{
			return expertSubjectDetailRepository.update(expertSubjectDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int exertID, int sujectID) {
		try{
			return expertSubjectDetailRepository.delete(exertID, sujectID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	
	
}

