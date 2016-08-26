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
	public boolean save(Expert exp) throws Exception {
		int expertID = 0;
		try {
			exp.setExpertStatus("1");
			expertRepository.save(exp);
			expertID = exp.getExpertID();
			System.out.println("Expert ID: " + expertID);
			
			exp.getCurrentAddress().setExpertID(expertID);
			expertRepository.saveCurrentAddress(exp.getCurrentAddress());
			
			exp.getPlaceOfBirth().setExpertID(expertID);
			expertRepository.savePOB(exp.getPlaceOfBirth());

			
			// if inserted expert getting done

			System.out.println("Count EDU: " + exp.getEducations().size());

			for (int i = 0; i < exp.getEducations().size(); i++) {
				exp.getEducations().get(i).setExpertID(expertID);

				expertRepository.saveEductionOnExpert(exp.getEducations().get(i));

			}

			// if inserted education done

			for (int i = 0; i < exp.getExpertExperiences().size(); i++) {

				exp.getExpertExperiences().get(i).setExpertID(expertID);

				expertRepository.saveExperienceExpert(exp.getExpertExperiences().get(i));

			}

			// if inserted experience

			for (int i = 0; i < exp.getCurrentJobs().size(); i++) {
				exp.getCurrentJobs().get(i).setExpertID(expertID);

				expertRepository.saveCurrentJob(exp.getCurrentJobs().get(i));

			}

			// if inserted current job

			for (int i = 0; i < exp.getExpertLanguageDetail().size(); i++) {
				exp.getExpertLanguageDetail().get(i).setExpertID(expertID);
				try {

					expertRepository.saveExpertLangauge(exp.getExpertLanguageDetail().get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}
			}

			// if inserted language detail

			for (int i = 0; i < exp.getJobExpectations().size(); i++) {
				exp.getJobExpectations().get(i).setExpertID(expertID);
				try {

					expertRepository.saveJobExpectation(exp.getJobExpectations().get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}

			}

			

			// if inserted language

			for (int i = 0; i < exp.getExpertSubjectDetail().size(); i++) {
				exp.getExpertSubjectDetail().get(i).setExpertID(expertID);
				try {

					expertRepository.saveSkillDetail(exp.getExpertSubjectDetail().get(i));
				} catch (Exception e) {
				}
			}

			// if inserted skill

			for (int i = 0; i < exp.getExpertDocuments().size(); i++) {
				exp.getExpertDocuments().get(i).setExpertID(expertID);
				try {

					expertRepository.saveDocument(exp.getExpertDocuments().get(i));
				} catch (Exception e) {
					e.printStackTrace();
				}

			}
			

		} catch (Exception e) {
			throw new Exception("ERROR");
		}

		return true;
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

	@Override
	public ArrayList<Expert> advanceSearch(Expert expert, Pagination pagination) {
		try {
			System.out.println("Count: " + expertRepository.advanceSearchCount(expert));
			pagination.setTotalCount(expertRepository.advanceSearchCount(expert));
			return expertRepository.advanceSearch(expert, pagination);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
