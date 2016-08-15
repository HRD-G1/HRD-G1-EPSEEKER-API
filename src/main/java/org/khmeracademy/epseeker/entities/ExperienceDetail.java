package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExperienceDetail {

	@JsonProperty("EXPERT_ID")
	private int expertID;
	
	@JsonProperty("INSTITUTION_ID")
	private int institutionID;
	
	@JsonProperty("INSTITUTION_NAME")
	private String institutionName;
	
	@JsonProperty("INSTITUTION_ADDRESS")
	private String institutionAddress;
	
	@JsonProperty("MAJOR_ID")
	private int majorID;
	
	@JsonProperty("MAJOR_NAME")
	private String majorName;
	
	@JsonProperty("EXPERIENCE_START_YEAR")
	private String experienceStartYear;
	
	@JsonProperty("EXPERIENCE_END_YEAR")
	private String experienceEndYear;
	
	@JsonProperty("PROJECT_EXPERIENCE")
	private String projectExperience;
	
	public ExperienceDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the expertID
	 */
	public int getExpertID() {
		return expertID;
	}

	/**
	 * @param expertID the expertID to set
	 */
	public void setExpertID(int expertID) {
		this.expertID = expertID;
	}

	/**
	 * @return the institutionID
	 */
	public int getInstitutionID() {
		return institutionID;
	}

	/**
	 * @param institutionID the institutionID to set
	 */
	public void setInstitutionID(int institutionID) {
		this.institutionID = institutionID;
	}

	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}

	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	/**
	 * @return the institutionAddress
	 */
	public String getInstitutionAddress() {
		return institutionAddress;
	}

	/**
	 * @param institutionAddress the institutionAddress to set
	 */
	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
	}

	/**
	 * @return the majorID
	 */
	public int getMajorID() {
		return majorID;
	}

	/**
	 * @param majorID the majorID to set
	 */
	public void setMajorID(int majorID) {
		this.majorID = majorID;
	}

	/**
	 * @return the marjorName
	 */
	public String getMajorName() {
		return majorName;
	}

	/**
	 * @param marjorName the marjorName to set
	 */
	public void setMajorName(String marjorName) {
		this.majorName = marjorName;
	}

	/**
	 * @return the experienceStartYear
	 */
	public String getExperienceStartYear() {
		return experienceStartYear;
	}

	/**
	 * @param experienceStartYear the experienceStartYear to set
	 */
	public void setExperienceStartYear(String experienceStartYear) {
		this.experienceStartYear = experienceStartYear;
	}

	/**
	 * @return the experienceEndYear
	 */
	public String getExperienceEndYear() {
		return experienceEndYear;
	}

	/**
	 * @param experienceEndYear the experienceEndYear to set
	 */
	public void setExperienceEndYear(String experienceEndYear) {
		this.experienceEndYear = experienceEndYear;
	}

	/**
	 * @return the projectExperience
	 */
	public String getProjectExperience() {
		return projectExperience;
	}

	/**
	 * @param projectExperience the projectExperience to set
	 */
	public void setProjectExperience(String projectExperience) {
		this.projectExperience = projectExperience;
	}

	/**
	 * @param expertID
	 * @param institutionID
	 * @param institutionName
	 * @param institutionAddress
	 * @param majorID
	 * @param majorName
	 * @param experienceStartYear
	 * @param experienceEndYear
	 * @param projectExperience
	 */
	public ExperienceDetail(int expertID, int institutionID, String institutionName, String institutionAddress,
			int majorID, String majorName, String experienceStartYear, String experienceEndYear,
			String projectExperience) {
		this.expertID = expertID;
		this.institutionID = institutionID;
		this.institutionName = institutionName;
		this.institutionAddress = institutionAddress;
		this.majorID = majorID;
		this.majorName = majorName;
		this.experienceStartYear = experienceStartYear;
		this.experienceEndYear = experienceEndYear;
		this.projectExperience = projectExperience;
	}

	
	
	
}
