package org.khmeracademy.epseeker.entities;

public class SubjectCategory {

	private int subjectCategoryID;
	private String subjectCategoryName;
	
	public SubjectCategory() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param subjectCategory
	 * @param subjectCategoryName
	 */
	public SubjectCategory(int subjectCategory, String subjectCategoryName) {
		this.subjectCategoryID = subjectCategory;
		this.subjectCategoryName = subjectCategoryName;
	}

	/**
	 * @return the subjectCategory
	 */
	public int getSubjectCategory() {
		return subjectCategoryID;
	}

	/**
	 * @param subjectCategory the subjectCategory to set
	 */
	public void setSubjectCategory(int subjectCategory) {
		this.subjectCategoryID = subjectCategory;
	}

	/**
	 * @return the subjectCategoryName
	 */
	public String getSubjectCategoryName() {
		return subjectCategoryName;
	}

	/**
	 * @param subjectCategoryName the subjectCategoryName to set
	 */
	public void setSubjectCategoryName(String subjectCategoryName) {
		this.subjectCategoryName = subjectCategoryName;
	}
	
	
	
	
}
