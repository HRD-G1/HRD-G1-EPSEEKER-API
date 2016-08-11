package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Commune;

public interface CommuneService {

	ArrayList<Commune> findAl();
	
	boolean save(Commune commune);
	
	boolean update(Commune commune);
	
	boolean delete(int communeID);

}
