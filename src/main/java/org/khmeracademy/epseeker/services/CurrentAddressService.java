package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.CurrentAddress;

public interface CurrentAddressService {

	ArrayList<CurrentAddress> findAll();
	
	CurrentAddress findOne(int expertID);
	
	boolean save(CurrentAddress currentAddress);
	
	boolean update(CurrentAddress currentAddress);
	
	boolean delete(int expertID);
	
}
