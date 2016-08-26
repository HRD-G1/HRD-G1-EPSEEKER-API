package org.khmeracademy.epseeker.services;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Position;
import org.khmeracademy.epseeker.utils.Pagination;

public interface PositionService {

	ArrayList<Position> findAll(Pagination pagination);
	
	boolean save(Position position);
	
	boolean update(Position position);
	
	boolean delete(int positoinID);
	
}
