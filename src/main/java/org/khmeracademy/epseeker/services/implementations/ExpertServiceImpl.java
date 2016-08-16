package org.khmeracademy.epseeker.services.implementations;

import java.util.ArrayList;

import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.repositories.ExpertRespository;
import org.khmeracademy.epseeker.services.ExpertService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExpertServiceImpl implements ExpertService {

	@Autowired
	ExpertRespository expertRepository;

	@Override
	public ArrayList<Expert> findAll() {
		try {
			System.out.println(expertRepository.findAll());
			return expertRepository.findAll();
		} catch (Exception e) {
			System.out.println("Failed");
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public Expert findOne(int expertID) {
		return expertRepository.findOne(expertID);
	}

	@Override
	public boolean save(Expert exp) {
		return expertRepository.save(exp);
	}

	@Override
	public boolean update(Expert exp) {
		try {
			System.out.println(exp.toString());
			return expertRepository.update(exp);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(int expertID) {
		try {
			return expertRepository.delete(expertID);
		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}
	}

	@Override
	public ArrayList<Expert> findAllByRandom() {
		try {
			return expertRepository.findAllByRandom();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public ArrayList<Expert> findExpertsBySubjectID(int subjectID, Pagination pagination) {
		try {
			pagination.setTotalCount(expertRepository.count(subjectID));
			return expertRepository.findExpertsBySubjectID(subjectID, pagination);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
