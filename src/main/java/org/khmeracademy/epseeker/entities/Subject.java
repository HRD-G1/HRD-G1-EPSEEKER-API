package org.khmeracademy.epseeker.entities;

public class Subject {
	
	private int subjectID;
	private String subjectName;
	private String subjectCategoryID;
	
	public Subject() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param subjectID
	 * @param subjectName
	 * @param subjectCategoryID
	 */
	public Subject(int subjectID, String subjectName, String subjectCategoryID) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.subjectCategoryID = subjectCategoryID;
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
	 * @return the subjectName
	 */
	public String getSubjectName() {
		return subjectName;
	}

	/**
	 * @param subjectName the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return the subjectCategoryID
	 */
	public String getSubjectCategoryID() {
		return subjectCategoryID;
	}

	/**
	 * @param subjectCategoryID the subjectCategoryID to set
	 */
	public void setSubjectCategoryID(String subjectCategoryID) {
		this.subjectCategoryID = subjectCategoryID;
	}
	
	
	
}
