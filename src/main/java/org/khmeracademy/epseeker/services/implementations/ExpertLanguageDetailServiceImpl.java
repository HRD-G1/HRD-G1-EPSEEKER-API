package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertLanguageDetail;
import org.khmeracademy.epseeker.repositories.ExpertLanguageDetailRepository;
import org.khmeracademy.epseeker.services.ExpertLanguageDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertLanguageDetailServiceImpl implements ExpertLanguageDetailService{

	@Autowired
	ExpertLanguageDetailRepository expertLanguageDetailRepository;
	
	@Override
	public ArrayList<ExpertLanguageDetail> findAll() {
		try{
			return expertLanguageDetailRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(ExpertLanguageDetail expertLanguageDetail) {
		try{
			return expertLanguageDetailRepository.save(expertLanguageDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(ExpertLanguageDetail expertLanguageDetail) {
		try{
			return expertLanguageDetailRepository.update(expertLanguageDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID, int languageID) {
		try{
			return expertLanguageDetailRepository.delete(expertID, languageID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
