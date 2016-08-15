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
	
	@JsonProperty("PERIOD")
	private String period;
	
	@JsonProperty("POSITION_ID")
	private String positionID;
	
	@JsonProperty("POSITION_NAME")
	private String positionName;
	
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
	 * @param expertID
	 * @param institutionID
	 * @param institutionName
	 * @param institutionAddress
	 * @param period
	 * @param positionID
	 * @param positionName
	 * @param experienceStartYear
	 * @param experienceEndYear
	 * @param projectExperience
	 */
	public ExperienceDetail(int expertID, int institutionID, String institutionName, String institutionAddress,
			String period, String positionID, String positionName, String experienceStartYear, String experienceEndYear,
			String projectExperience) {
		this.expertID = expertID;
		this.institutionID = institutionID;
		this.institutionName = institutionName;
		this.institutionAddress = institutionAddress;
		this.period = period;
		this.positionID = positionID;
		this.positionName = positionName;
		this.experienceStartYear = experienceStartYear;
		this.experienceEndYear = experienceEndYear;
		this.projectExperience = projectExperience;
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
	 * @return the period
	 */
	public String getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public void setPeriod(String period) {
		this.period = period;
	}

	/**
	 * @return the positionID
	 */
	public String getPositionID() {
		return positionID;
	}

	/**
	 * @param positionID the positionID to set
	 */
	public void setPositionID(String positionID) {
		this.positionID = positionID;
	}

	/**
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * @param positionName the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
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

		
}
