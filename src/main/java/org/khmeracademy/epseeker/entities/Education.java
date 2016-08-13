package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Education {

	@JsonProperty("EXPERT_ID")
	private int expertID;
	
	@JsonProperty("UNIVERSITY_ID")
	private int universityID;
	
	@JsonProperty("UNIVERSITY_NAME")
	private String universityName;
	
	@JsonProperty("EDUCATION_START_YEAR")
	private String educationStartYear;
	
	@JsonProperty("EDUCATION_END_YEAR")
	private String educationEndYear;
	
	@JsonProperty("MAJOR_ID")
	private int majorID; 
	
	@JsonProperty("MAJOR_NAME")
	private String majorName;
	
	public Education() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param universityID
	 * @param universityName
	 * @param educationStartYear
	 * @param educationEndYear
	 * @param majorID
	 * @param majorName
	 */
	public Education(int expertID, int universityID, String universityName, String educationStartYear,
			String educationEndYear, int majorID, String majorName) {
		this.expertID = expertID;
		this.universityID = universityID;
		this.universityName = universityName;
		this.educationStartYear = educationStartYear;
		this.educationEndYear = educationEndYear;
		this.majorID = majorID;
		this.majorName = majorName;
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
	 * @return the universityID
	 */
	public int getUniversityID() {
		return universityID;
	}

	/**
	 * @param universityID the universityID to set
	 */
	public void setUniversityID(int universityID) {
		this.universityID = universityID;
	}

	/**
	 * @return the universityName
	 */
	public String getUniversityName() {
		return universityName;
	}

	/**
	 * @param universityName the universityName to set
	 */
	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	/**
	 * @return the educationStartYear
	 */
	public String getEducationStartYear() {
		return educationStartYear;
	}

	/**
	 * @param educationStartYear the educationStartYear to set
	 */
	public void setEducationStartYear(String educationStartYear) {
		this.educationStartYear = educationStartYear;
	}

	/**
	 * @return the educationEndYear
	 */
	public String getEducationEndYear() {
		return educationEndYear;
	}

	/**
	 * @param educationEndYear the educationEndYear to set
	 */
	public void setEducationEndYear(String educationEndYear) {
		this.educationEndYear = educationEndYear;
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
	 * @return the majorName
	 */
	public String getMajorName() {
		return majorName;
	}

	/**
	 * @param majorName the majorName to set
	 */
	public void setMajorName(String majorName) {
		this.majorName = majorName;
	}
	
	
	
	
	
}
