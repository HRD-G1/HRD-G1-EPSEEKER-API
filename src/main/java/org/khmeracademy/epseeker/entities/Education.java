package org.khmeracademy.epseeker.entities;

public class Education {

	private int expertID;
	private int universityID;
	private String educationStartYear;
	private String educationEndYear;
	private int majorID;
	
	public Education() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param universityID
	 * @param educationStartYear
	 * @param educationEndYear
	 * @param majorID
	 */
	public Education(int expertID, int universityID, String educationStartYear, String educationEndYear, int majorID) {
		this.expertID = expertID;
		this.universityID = universityID;
		this.educationStartYear = educationStartYear;
		this.educationEndYear = educationEndYear;
		this.majorID = majorID;
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
	
	
}
