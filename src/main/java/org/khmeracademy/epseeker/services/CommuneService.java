package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Commune;
import org.khmeracademy.epseeker.utils.Pagination;

public interface CommuneService {

	ArrayList<Commune> findAl(Pagination pagination);
	
	ArrayList<Commune> findAllByDistrictID(int districtID);
	
	boolean save(Commune commune);
	
	boolean update(Commune commune);
	
	boolean delete(int communeID);

}
