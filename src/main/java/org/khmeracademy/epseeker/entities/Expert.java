package org.khmeracademy.epseeker.entities;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Expert {

	@JsonProperty("EXPERT_ID")
	private int expertID;

	@JsonProperty("EXPERT_FIRST_NAME")
	private String expertFirstName;

	@JsonProperty("EXPERT_LAST_NAME")
	private String expertLastName;

	@JsonProperty("EXPERT_PHONE1")
	private String expertPhone1;

	@JsonProperty("EXPERT_PHOTO")
	private String expertPhoto;

	@JsonProperty("EXPERT_STATUS")
	private String expertStatus;

	@JsonProperty("EXPERT_PHONE2")
	private String expertPhone2;

	@JsonProperty("EXPERT_EMAIL")
	private String expertEmail;

	@JsonProperty("EXPERT_GENDERATION")
	private int expertGeneration;

	@JsonProperty("EXPERT_ADVANCE_COURSE")
	private String expertAdvanceCourse;

	@JsonProperty("EXPERT_GENDER")
	private String expertGender;

	@JsonProperty("DOB")
	private String dob;

	@JsonProperty("KA_ID")
	private int kaID;

	@JsonProperty("PROJECT_LINK_DEMO")
	private String projectLinkDemo;

	@JsonProperty("EDUCATIONS")
	private ArrayList<Education> educations;

	@JsonProperty("SUBJECTS")
	private ArrayList<Subject> subjects;

	@JsonProperty("LANGUAGES")
	private ArrayList<Language> languages;

	@JsonProperty("EXPERT_DOCUMENTS")
	private ArrayList<ExpertDocumentDetail> expertDocuments;

	@JsonProperty("EXPERT_EXPERIENCES")
	private ArrayList<ExperienceDetail> expertExperiences;

	@JsonProperty("EXPERT_CURRENT_JOBS")
	private ArrayList<CurrentJob> currentJobs;

	@JsonProperty("EXPERT_JOB_EXPECTATIONS")
	private ArrayList<JobExpectation> jobExpectations;

	@JsonProperty("EXPERT_CURRENT_ADDRESS")
	private CurrentAddress currentAddress;

	@JsonProperty("PLACE_OF_BIRTH")
	private POB placeOfBirth;

	@JsonProperty("MAX_AGE")
	private int maxAge;
	
	@JsonProperty("MIN_AGE")
	private int minAge;
	
	@JsonProperty("MIN_SALARY")
	private int minSalary;
	
	@JsonProperty("MAX_SALARY")
	private int maxSalary;

	public Expert() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the expertID
	 */
	public int getExpertID() {
		return expertID;
	}

	/**
	 * @param expertID
	 *            the expertID to set
	 */
	public void setExpertID(int expertID) {
		this.expertID = expertID;
	}

	/**
	 * @return the expertFirstName
	 */
	public String getExpertFirstName() {
		return expertFirstName;
	}

	/**
	 * @param expertFirstName
	 *            the expertFirstName to set
	 */
	public void setExpertFirstName(String expertFirstName) {
		this.expertFirstName = expertFirstName;
	}

	/**
	 * @return the expertLastName
	 */
	public String getExpertLastName() {
		return expertLastName;
	}

	/**
	 * @param expertLastName
	 *            the expertLastName to set
	 */
	public void setExpertLastName(String expertLastName) {
		this.expertLastName = expertLastName;
	}

	/**
	 * @return the expertPhone1
	 */
	public String getExpertPhone1() {
		return expertPhone1;
	}

	/**
	 * @param expertPhone1
	 *            the expertPhone1 to set
	 */
	public void setExpertPhone1(String expertPhone1) {
		this.expertPhone1 = expertPhone1;
	}

	/**
	 * @return the expertPhoto
	 */
	public String getExpertPhoto() {
		return expertPhoto;
	}

	/**
	 * @param expertPhoto
	 *            the expertPhoto to set
	 */
	public void setExpertPhoto(String expertPhoto) {
		this.expertPhoto = expertPhoto;
	}

	/**
	 * @return the expertStatus
	 */
	public String getExpertStatus() {
		return expertStatus;
	}

	/**
	 * @param expertStatus
	 *            the expertStatus to set
	 */
	public void setExpertStatus(String expertStatus) {
		this.expertStatus = expertStatus;
	}

	/**
	 * @return the expertPhone2
	 */
	public String getExpertPhone2() {
		return expertPhone2;
	}

	/**
	 * @param expertPhone2
	 *            the expertPhone2 to set
	 */
	public void setExpertPhone2(String expertPhone2) {
		this.expertPhone2 = expertPhone2;
	}

	/**
	 * @return the expertEmail
	 */
	public String getExpertEmail() {
		return expertEmail;
	}

	/**
	 * @param expertEmail
	 *            the expertEmail to set
	 */
	public void setExpertEmail(String expertEmail) {
		this.expertEmail = expertEmail;
	}

	/**
	 * @return the expertGeneration
	 */
	public int getExpertGeneration() {
		return expertGeneration;
	}

	/**
	 * @param expertGeneration
	 *            the expertGeneration to set
	 */
	public void setExpertGeneration(int expertGeneration) {
		this.expertGeneration = expertGeneration;
	}

	/**
	 * @return the expertAdvanceCourse
	 */
	public String getExpertAdvanceCourse() {
		return expertAdvanceCourse;
	}

	/**
	 * @param expertAdvanceCourse
	 *            the expertAdvanceCourse to set
	 */
	public void setExpertAdvanceCourse(String expertAdvanceCourse) {
		this.expertAdvanceCourse = expertAdvanceCourse;
	}

	/**
	 * @return the expertGender
	 */
	public String getExpertGender() {
		return expertGender;
	}

	/**
	 * @param expertGender
	 *            the expertGender to set
	 */
	public void setExpertGender(String expertGender) {
		this.expertGender = expertGender;
	}

	/**
	 * @return the dob
	 */
	public String getDob() {
		return dob;
	}

	/**
	 * @param dob
	 *            the dob to set
	 */
	public void setDob(String dob) {
		this.dob = dob;
	}

	/**
	 * @return the kaID
	 */
	public int getKaID() {
		return kaID;
	}

	/**
	 * @param kaID
	 *            the kaID to set
	 */
	public void setKaID(int kaID) {
		this.kaID = kaID;
	}

	/**
	 * @return the projectLinkDemo
	 */
	public String getProjectLinkDemo() {
		return projectLinkDemo;
	}

	/**
	 * @param projectLinkDemo
	 *            the projectLinkDemo to set
	 */
	public void setProjectLinkDemo(String projectLinkDemo) {
		this.projectLinkDemo = projectLinkDemo;
	}

	/**
	 * @return the educations
	 */
	public ArrayList<Education> getEducations() {
		return educations;
	}

	/**
	 * @param educations
	 *            the educations to set
	 */
	public void setEducations(ArrayList<Education> educations) {
		this.educations = educations;
	}

	/**
	 * @return the subjects
	 */
	public ArrayList<Subject> getSubjects() {
		return subjects;
	}

	/**
	 * @param subjects
	 *            the subjects to set
	 */
	public void setSubjects(ArrayList<Subject> subjects) {
		this.subjects = subjects;
	}

	/**
	 * @return the languages
	 */
	public ArrayList<Language> getLanguages() {
		return languages;
	}

	/**
	 * @param languages
	 *            the languages to set
	 */
	public void setLanguages(ArrayList<Language> languages) {
		this.languages = languages;
	}

	/**
	 * @return the expertDocuments
	 */
	public ArrayList<ExpertDocumentDetail> getExpertDocuments() {
		return expertDocuments;
	}

	/**
	 * @param expertDocuments
	 *            the expertDocuments to set
	 */
	public void setExpertDocuments(ArrayList<ExpertDocumentDetail> expertDocuments) {
		this.expertDocuments = expertDocuments;
	}

	/**
	 * @return the expertExperiences
	 */
	public ArrayList<ExperienceDetail> getExpertExperiences() {
		return expertExperiences;
	}

	/**
	 * @param expertExperiences
	 *            the expertExperiences to set
	 */
	public void setExpertExperiences(ArrayList<ExperienceDetail> expertExperiences) {
		this.expertExperiences = expertExperiences;
	}

	/**
	 * @return the currentJobs
	 */
	public ArrayList<CurrentJob> getCurrentJobs() {
		return currentJobs;
	}

	/**
	 * @param currentJobs
	 *            the currentJobs to set
	 */
	public void setCurrentJobs(ArrayList<CurrentJob> currentJobs) {
		this.currentJobs = currentJobs;
	}

	/**
	 * @return the jobExpectations
	 */
	public ArrayList<JobExpectation> getJobExpectations() {
		return jobExpectations;
	}

	/**
	 * @param jobExpectations
	 *            the jobExpectations to set
	 */
	public void setJobExpectations(ArrayList<JobExpectation> jobExpectations) {
		this.jobExpectations = jobExpectations;
	}

	/**
	 * @return the currentAddress
	 */
	public CurrentAddress getCurrentAddress() {
		return currentAddress;
	}

	/**
	 * @param currentAddress
	 *            the currentAddress to set
	 */
	public void setCurrentAddress(CurrentAddress currentAddress) {
		this.currentAddress = currentAddress;
	}

	/**
	 * @return the placeOfBirth
	 */
	public POB getPlaceOfBirth() {
		return placeOfBirth;
	}

	/**
	 * @param placeOfBirth
	 *            the placeOfBirth to set
	 */
	public void setPlaceOfBirth(POB placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	
	

	/**
	 * @return the maxAge
	 */
	public int getMaxAge() {
		return maxAge;
	}

	/**
	 * @param maxAge the maxAge to set
	 */
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}

	/**
	 * @return the minAge
	 */
	public int getMinAge() {
		return minAge;
	}

	/**
	 * @param minAge the minAge to set
	 */
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	
	

	/**
	 * @return the minSalary
	 */
	public int getMinSalary() {
		return minSalary;
	}

	/**
	 * @param minSalary the minSalary to set
	 */
	public void setMinSalary(int minSalary) {
		this.minSalary = minSalary;
	}

	/**
	 * @return the maxSalary
	 */
	public int getMaxSalary() {
		return maxSalary;
	}

	/**
	 * @param maxSalary the maxSalary to set
	 */
	public void setMaxSalary(int maxSalary) {
		this.maxSalary = maxSalary;
	}

	/**
	 * @param expertID
	 * @param expertFirstName
	 * @param expertLastName
	 * @param expertPhone1
	 * @param expertPhoto
	 * @param expertStatus
	 * @param expertPhone2
	 * @param expertEmail
	 * @param expertGeneration
	 * @param expertAdvanceCourse
	 * @param expertGender
	 * @param dob
	 * @param kaID
	 * @param projectLinkDemo
	 * @param educations
	 * @param subjects
	 * @param languages
	 * @param expertDocuments
	 * @param expertExperiences
	 * @param currentJobs
	 * @param jobExpectations
	 * @param currentAddress
	 * @param placeOfBirth
	 * @param maxAge
	 * @param minAge
	 * @param minSalary
	 * @param maxSalary
	 */
	public Expert(int expertID, String expertFirstName, String expertLastName, String expertPhone1, String expertPhoto,
			String expertStatus, String expertPhone2, String expertEmail, int expertGeneration,
			String expertAdvanceCourse, String expertGender, String dob, int kaID, String projectLinkDemo,
			ArrayList<Education> educations, ArrayList<Subject> subjects, ArrayList<Language> languages,
			ArrayList<ExpertDocumentDetail> expertDocuments, ArrayList<ExperienceDetail> expertExperiences,
			ArrayList<CurrentJob> currentJobs, ArrayList<JobExpectation> jobExpectations, CurrentAddress currentAddress,
			POB placeOfBirth, int maxAge, int minAge, int minSalary, int maxSalary) {
		this.expertID = expertID;
		this.expertFirstName = expertFirstName;
		this.expertLastName = expertLastName;
		this.expertPhone1 = expertPhone1;
		this.expertPhoto = expertPhoto;
		this.expertStatus = expertStatus;
		this.expertPhone2 = expertPhone2;
		this.expertEmail = expertEmail;
		this.expertGeneration = expertGeneration;
		this.expertAdvanceCourse = expertAdvanceCourse;
		this.expertGender = expertGender;
		this.dob = dob;
		this.kaID = kaID;
		this.projectLinkDemo = projectLinkDemo;
		this.educations = educations;
		this.subjects = subjects;
		this.languages = languages;
		this.expertDocuments = expertDocuments;
		this.expertExperiences = expertExperiences;
		this.currentJobs = currentJobs;
		this.jobExpectations = jobExpectations;
		this.currentAddress = currentAddress;
		this.placeOfBirth = placeOfBirth;
		this.maxAge = maxAge;
		this.minAge = minAge;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
	}
}
