package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CurrentAddress;
import org.khmeracademy.epseeker.repositories.CurrentAddressRepository;
import org.khmeracademy.epseeker.services.CurrentAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CurrentAddressServiceImpl implements CurrentAddressService{

	@Autowired
	CurrentAddressRepository currentAddressRepository;
	
	@Override
	public ArrayList<CurrentAddress> findAll() {
		try{
			return currentAddressRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(CurrentAddress currentAddress) {
		try{
			return currentAddressRepository.save(currentAddress);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(CurrentAddress currentAddress) {
		try{
			return currentAddressRepository.update(currentAddress);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID) {
		try{
			return currentAddressRepository.delete(expertID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public CurrentAddress findOne(int expertID) {
		try{
			return currentAddressRepository.findOne(expertID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public CurrentAddress findOneByExpertID(int expertiD) {
		try{
			return currentAddressRepository.findOneByExpertID(expertiD);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	
}
