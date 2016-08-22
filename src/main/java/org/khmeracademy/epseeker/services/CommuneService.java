package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Commune;

public interface CommuneService {

	ArrayList<Commune> findAl();
	
	ArrayList<Commune> findAllByDistrictID(int districtID);
	
	boolean save(Commune commune);
	
	boolean update(Commune commune);
	
	boolean delete(int communeID);

}
