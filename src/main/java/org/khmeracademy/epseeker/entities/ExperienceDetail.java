package org.khmeracademy.epseeker.entities;

public class ExperienceDetail {

	private int expertID;
	private int institutionID;
	private int majorID;
	private String experienceStartYear;
	private String expertienceEndYear;
	
	public ExperienceDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param institutionID
	 * @param majorID
	 * @param experienceStartYear
	 * @param expertienceEndYear
	 */
	public ExperienceDetail(int expertID, int institutionID, int majorID, String experienceStartYear,
			String expertienceEndYear) {
		this.expertID = expertID;
		this.institutionID = institutionID;
		this.majorID = majorID;
		this.experienceStartYear = experienceStartYear;
		this.expertienceEndYear = expertienceEndYear;
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
	 * @return the expertienceEndYear
	 */
	public String getExpertienceEndYear() {
		return expertienceEndYear;
	}

	/**
	 * @param expertienceEndYear the expertienceEndYear to set
	 */
	public void setExpertienceEndYear(String expertienceEndYear) {
		this.expertienceEndYear = expertienceEndYear;
	}
	
	
	
}
