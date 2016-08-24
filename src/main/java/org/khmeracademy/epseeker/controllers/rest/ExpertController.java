package org.khmeracademy.epseeker.controllers.rest;

import java.util.HashMap;
import java.util.Map;

import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.services.ExpertService;
import org.khmeracademy.epseeker.utils.Pagination;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

@RestController
public class ExpertController {
	
	@Autowired
	ExpertService expertService;
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.GET)
	public Map<String, Object> findAll(){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.findAll());
		return map;
	}
		
	@RequestMapping(value="/rest/expertbyrandom", method = RequestMethod.GET)
	public Map<String, Object> findAllByRandom(){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.findAllByRandom());
		return map;
	}
	
	@RequestMapping(value="/rest/findExpertsBySubjectID/{subjectID}", method = RequestMethod.GET)
	@ApiImplicitParams({
		@ApiImplicitParam(name="page", paramType="query", defaultValue="1"),
		@ApiImplicitParam(name="limit", paramType="query", defaultValue="1")
	})
	
	public Map<String, Object> replaceAllExpertsBySubjectID(@PathVariable("subjectID")int subjectID, Pagination pagination){
		System.out.println("Subject Page: ");
		System.out.println(pagination.getLimit());
		System.out.println(pagination.getPage());
		System.out.println(pagination.offset());
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("PAGINATION", pagination);
		map.put("DATA", expertService.findExpertsBySubjectID(subjectID, pagination));
		return map;
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.GET)
	public  Map<String, Object> findOne(@PathVariable("expertID") int expertID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.findOne(expertID)); 
		return map;
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.POST)
	public  Map<String, Object> save(@RequestBody Expert exp){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		try {
			map.put("DATA", expertService.save(exp));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Expert OBJ: "+exp);
		System.out.println("Name: " + exp.getExpertFirstName() + " " + exp.getExpertLastName());
		System.out.println("Gender: " + exp.getExpertGender());
		System.out.println("Phone1: " + exp.getExpertPhone1());
		System.out.println("Phone2: " + exp.getExpertPhone2());
		System.out.println("POB: " + exp.getPlaceOfBirth().getCountryID() + " " + exp.getPlaceOfBirth().getCityOrProvinceID() + " " + exp.getPlaceOfBirth().getDistrictID() + " " + exp.getPlaceOfBirth().getCommuneID());
		System.out.println("Current Address: " + exp.getCurrentAddress().getCountryID() + " " + exp.getCurrentAddress().getCityOrProvinceID() + " " + exp.getCurrentAddress().getDistrictID() + " " + exp.getCurrentAddress().getCommuneID());
		System.out.println("Email: " + exp.getExpertEmail());
		System.out.println("Generation: " + exp.getExpertGeneration());
		System.out.println("Advance Course: " + exp.getExpertAdvanceCourse());
		
		
		System.out.println("Education: ");
		for(int i = 0 ; i < exp.getEducations().size(); i++){
			System.out.println("Uni ID: " + exp.getEducations().get(i).getUniversityID());
			System.out.println("Major ID: " + exp.getEducations().get(i).getMajorID());
			System.out.println("Start Date: " + exp.getEducations().get(i).getEducationStartYear());
			System.out.println("End Date: " + exp.getEducations().get(i).getEducationEndYear());
		}
		
		System.out.println("Experience: ");
		for(int i = 0; i < exp.getExpertExperiences().size(); i++){
			System.out.println("Institution ID: " + exp.getExpertExperiences().get(i).getInstitutionID());
			System.out.println("Major ID: " + exp.getExpertExperiences().get(i).getPositionID());
			System.out.println("Peroid: " + exp.getExpertExperiences().get(i).getPeriod());
			System.out.println("Project Experience: " + exp.getExpertExperiences().get(i).getProjectExperience());
		}
		
		System.out.println("Current JOB: ");
		for(int i = 0; i < exp.getCurrentJobs().size(); i++){
			System.out.println("Inti: " +exp.getCurrentJobs().get(i).getInstitutionID());
			System.out.println("Posi ID: " + exp.getCurrentJobs().get(i).getPositionID());
			System.out.println("Salary: " + exp.getCurrentJobs().get(i).getSalary());
			System.out.println("Insti Phone: "  + exp.getCurrentJobs().get(i).getInstitutionPhone());
			System.out.println("Insti Email: " + exp.getCurrentJobs().get(i).getInstitutionEmail());
			System.out.println("Insti Address: " + exp.getCurrentJobs().get(i).getInstitutionAddress());
		}
		
		System.out.println("Language: ");
		for(int i = 0; i < exp.getExpertLanguageDetail().size(); i++){
			System.out.println("LAN ID: " + exp.getExpertLanguageDetail().get(i).getLanguageID());
			System.out.println("Mention ID: " + exp.getExpertLanguageDetail().get(i).getMention());
		}
		
		System.out.println("Job Expection: ");
		for(int i = 0; i < exp.getJobExpectations().size(); i++){
			System.out.println("Position ID: " + exp.getJobExpectations().get(i).getPositionID());
			System.out.println("Minimum Salary: " + exp.getJobExpectations().get(i).getMinSalary());
			System.out.println("Max Salary: " + exp.getJobExpectations().get(i).getMaxSalary());
			System.out.println("Locaotion : " + exp.getCurrentJobs().get(i).getInstitutionAddress());
		}
		
		System.out.println("Skill: ");
		for(int i = 0; i < exp.getExpertSubjectDetail().size(); i++){
			System.out.println("subject ID: " + exp.getExpertSubjectDetail().get(i).getSubjectID());
			System.out.println("Metion: " + exp.getExpertSubjectDetail().get(i).getExpertSubjectDetailLevel());
		}
		
		System.out.println("Document: ");
		for(int i = 0; i < exp.getExpertDocuments().size(); i++){
			System.out.println("File Type ID: " + exp.getExpertDocuments().get(i).getFileDocumentID());
			System.out.println("File Path: " + exp.getExpertDocuments().get(i).getFilePath());
		}
		
		return map;
	}
	
	@RequestMapping(value="/rest/expert", method = RequestMethod.PUT)
	public  Map<String, Object> update(@RequestBody Expert exp){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.update(exp)); 
		return map;	
	}
	
	@RequestMapping(value="/rest/expert/{expertID}", method = RequestMethod.DELETE)
	public  Map<String, Object> delete(@PathVariable("expertID") int expertID){
		Map<String, Object> map = new HashMap<>();		
		map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("DATA", expertService.delete(expertID));
		return map;
	}
		
	@RequestMapping(value="/rest/expert/advance", method = RequestMethod.POST)
	@ApiImplicitParams({
		@ApiImplicitParam(name="page", paramType="query", defaultValue="1"),
		@ApiImplicitParam(name="limit", paramType="query", defaultValue="1")
	})
	public Map<String, Object>  advanceSearch(@RequestBody Expert expert, Pagination pagination){
		
		/*System.out.println("Advance Page: ");
		System.out.println(pagination.getLimit());
		System.out.println(pagination.getPage());
		System.out.println(pagination.offset());*/
		Map<String , Object> map = new HashMap<String, Object>();
		/*map.put("MESSAGE", "SUCCESSFULLY");
		map.put("CODE", "200");
		map.put("PAGINATION", pagination);
		map.put("DATA", expertService.advanceSearch(expert, pagination));*/
		return map;
	}
	
}
	
