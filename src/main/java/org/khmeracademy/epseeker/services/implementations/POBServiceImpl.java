package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.POB;
import org.khmeracademy.epseeker.repositories.POBRepository;
import org.khmeracademy.epseeker.services.POBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class POBServiceImpl implements POBService{

	@Autowired
	POBRepository pobRepository;

	@Override
	public ArrayList<POB> findAll() {
		try{
			return pobRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public POB findOne(int expertID) {
		try{
			return pobRepository.findOne(expertID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(POB pob) {
		try{
			return pobRepository.save(pob);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(POB pob) {
		try{
			return pobRepository.update(pob);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID) {
		try{
			return pobRepository.delete(expertID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}
	
	
	
}
