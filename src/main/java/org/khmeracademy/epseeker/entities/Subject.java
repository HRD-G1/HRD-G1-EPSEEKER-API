package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Subject {

	
	@JsonProperty("SUBJECT_ID")
	private int subjectID;
	
	@JsonProperty("SUBJECT_NAME")
	private String subjectName;
	
	@JsonProperty("SUBJECT_CATEGORY_ID")
	private int subjectCategoryID;
	
	@JsonProperty("SUBJECT_CATEGORY_NAME")
	private String subjectCategoryName;
	
	@JsonProperty("NUMBER_OF_EXPERT_EACH_SKIL")
	private int numberOfExpertEachSkilll;
	

	public Subject() {
		// TODO Auto-generated constructor stub
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



	


	/**
	 * @param subjectID
	 * @param subjectName
	 * @param subjectCategoryID
	 * @param subjectCategoryName
	 * @param numberOfExpertEachSkilll
	 */
	public Subject(int subjectID, String subjectName, int subjectCategoryID, String subjectCategoryName,
			int numberOfExpertEachSkilll) {
		this.subjectID = subjectID;
		this.subjectName = subjectName;
		this.subjectCategoryID = subjectCategoryID;
		this.subjectCategoryName = subjectCategoryName;
		this.numberOfExpertEachSkilll = numberOfExpertEachSkilll;
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



	/**
	 * @return the numberOfExpertEachSkilll
	 */
	public int getNumberOfExpertEachSkilll() {
		return numberOfExpertEachSkilll;
	}



	/**
	 * @param numberOfExpertEachSkilll the numberOfExpertEachSkilll to set
	 */
	public void setNumberOfExpertEachSkilll(int numberOfExpertEachSkilll) {
		this.numberOfExpertEachSkilll = numberOfExpertEachSkilll;
	}

	
	
}
