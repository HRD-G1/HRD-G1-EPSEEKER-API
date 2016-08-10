package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Position;

public interface PositionService {

	ArrayList<Position> findAll();
	
	boolean save(Position position);
	
	boolean update(Position position);
	
	boolean delete(int positoinID);
	
}
