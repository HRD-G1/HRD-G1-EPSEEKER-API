package org.khmeracademy.epseeker.entities;

public class ExpertSubjectDetail {

	private int expertID;
	private int subjectID;
	private String subjectDetailLevel;
	
	public ExpertSubjectDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param subjectID
	 * @param subjectDetailLevel
	 */
	public ExpertSubjectDetail(int expertID, int subjectID, String subjectDetailLevel) {
		this.expertID = expertID;
		this.subjectID = subjectID;
		this.subjectDetailLevel = subjectDetailLevel;
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
	 * @return the subjectID
	 */
	public int getSubjectID() {
		return subjectID;
	}

	/**
	 * @param subjectID the subjectID to set
	 */
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	/**
	 * @return the subjectDetailLevel
	 */
	public String getSubjectDetailLevel() {
		return subjectDetailLevel;
	}

	/**
	 * @param subjectDetailLevel the subjectDetailLevel to set
	 */
	public void setSubjectDetailLevel(String subjectDetailLevel) {
		this.subjectDetailLevel = subjectDetailLevel;
	}
	
	
	
}
