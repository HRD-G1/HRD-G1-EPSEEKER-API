package org.khmeracademy.epseeker.entities;

import java.util.List;

public class SubjectCategory {

	private int subjectCategoryID;
	private String subjectCategoryName;
	private List<Subject> subjects;
	
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

	public int getSubjectCategoryID() {
		return subjectCategoryID;
	}

	public void setSubjectCategoryID(int subjectCategoryID) {
		this.subjectCategoryID = subjectCategoryID;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
}
