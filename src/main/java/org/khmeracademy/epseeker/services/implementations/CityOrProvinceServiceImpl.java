package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CityOrProvince;
import org.khmeracademy.epseeker.repositories.CityOrProvinceReposity;
import org.khmeracademy.epseeker.services.CityOrProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityOrProvinceServiceImpl implements CityOrProvinceService{

	@Autowired
	CityOrProvinceReposity cityOrProvinceReposity;
	
	@Override
	public ArrayList<CityOrProvince> findAll() {
		try{
			return cityOrProvinceReposity.findAll();
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(CityOrProvince cityOrProvince) {
		try{
			return cityOrProvinceReposity.save(cityOrProvince);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(CityOrProvince cityOrProvince) {
		try{
			return cityOrProvinceReposity.update(cityOrProvince);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int cityOrProvinceID) {
		try{
			return cityOrProvinceReposity.delete(cityOrProvinceID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public ArrayList<CityOrProvince> findAllByCountry(int countryID) {
		try{
			return cityOrProvinceReposity.findAllByCountry(countryID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

}
