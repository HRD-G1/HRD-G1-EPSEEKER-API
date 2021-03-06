package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Position;
import org.khmeracademy.epseeker.repositories.PositionRepository;
import org.khmeracademy.epseeker.services.PositionService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PositionServiceImpl implements PositionService{
	
	@Autowired
	PositionRepository positionRepository;

	@Override
	public ArrayList<Position> findAll(Pagination pagination) {
		try{
			pagination.setTotalCount(positionRepository.findAllAndCount());
			int limit = pagination.getLimit();
			int offset = pagination.getOffset();
			return positionRepository.findAll(limit, offset);
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public boolean save(Position position) {
		try{
			return positionRepository.save(position);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Position position) {
		try{
			return positionRepository.update(position);
		}catch(Exception e){
			e.printStackTrace();	
		}
		return false;
	}

	@Override
	public boolean delete(int positionID) {
		try{
			return positionRepository.delete(positionID);
		}catch(Exception e){
			e.printStackTrace();
		}
		return false;
	}

}
