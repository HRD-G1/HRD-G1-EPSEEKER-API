package org.khmeracademy.epseeker.entities;

public class Subject {

	private int subjectID;
	private String subjectName;
	private int subjectCategoryID;
	

	public Subject() {
		// TODO Auto-generated constructor stub
	}

	
	/**
	 * @return the subjectID
	 */
	public int getSubjectID() {
		return subjectID;
	}

	/**
	 * @param subjectID
	 *            the subjectID to set
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
	 * @param subjectName
	 *            the subjectName to set
	 */
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	/**
	 * @return the subjectCategoryID
	 */
	public int getSubjectCategoryID() {
		return subjectCategoryID;
	}

	/**
	 * @param subjectCategoryID
	 *            the subjectCategoryID to set
	 */
	public void setSubjectCategoryID(int subjectCategoryID) {
		this.subjectCategoryID = subjectCategoryID;
	}

}
