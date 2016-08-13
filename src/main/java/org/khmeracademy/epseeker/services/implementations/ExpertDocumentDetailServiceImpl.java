package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.ExpertDocumentDetail;
import org.khmeracademy.epseeker.repositories.ExpertDocumentDetailRepository;
import org.khmeracademy.epseeker.services.FileDocumentDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertDocumentDetailServiceImpl implements FileDocumentDetailService{
	
	@Autowired
	ExpertDocumentDetailRepository expertDocumentDetailRepository;

	@Override
	public ArrayList<ExpertDocumentDetail> findAll() {
		try{
			return expertDocumentDetailRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ExpertDocumentDetail findOne(int expertID, int fileDocumentID, String filePath) {
		try{
			System.out.println(filePath);
			return expertDocumentDetailRepository.findOne(expertID, fileDocumentID, filePath);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(ExpertDocumentDetail expertDocumentDetail) {
		try{
			return expertDocumentDetailRepository.save(expertDocumentDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(ExpertDocumentDetail expertDocumentDetail) {
		try{
			return expertDocumentDetailRepository.update(expertDocumentDetail);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID, int fileDocumentID, String filePath) {
		try{
			return expertDocumentDetailRepository.delete(expertID, fileDocumentID, filePath);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<ExpertDocumentDetail> findAllByExpertID(int expertID) {
		try{
			return expertDocumentDetailRepository.findAllByExpertID(expertID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}


}
