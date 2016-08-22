package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.District;
import org.khmeracademy.epseeker.repositories.DistrictRepository;
import org.khmeracademy.epseeker.services.DistrictService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DistrictServiceImpl implements DistrictService{

	@Autowired
	DistrictRepository districtRepository;
	
	@Override
	public ArrayList<District> findAl() {
		try{
			return districtRepository.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(District district) {
		try{
			return districtRepository.save(district);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(District district) {
		try{
			return districtRepository.update(district);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int districtID) {
		try{
			return districtRepository.delete(districtID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<District> findAllByProvinceID(int provinceID) {
		try{
			return districtRepository.findAllByProvinceID(provinceID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
