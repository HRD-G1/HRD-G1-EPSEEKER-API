package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpertSubjectDetail {

	@JsonProperty("EXPERT_ID")
	private int expertID;

	@JsonProperty("SUBJECT_ID")
	private int subjectID;

	@JsonProperty("EXPERT_SUBJECT_DETAIL_LEVEL")
	private String expertSubjectDetailLevel;

	@JsonProperty("SUBJECT_NAME")
	private String subjectName;

	@JsonProperty("SUBJECT_CATEGORY_ID")
	private String subjectCategoryID;

	@JsonProperty("SUBJECT_CATEGORY_NAME")
	private String subjectCategoryName;
	
	

	public ExpertSubjectDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the expertID
	 */
	public int getExpertID() {
		return expertID;
	}

	/**
	 * @param expertID
	 *            the expertID to set
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
	 * @param subjectID
	 *            the subjectID to set
	 */
	public void setSubjectID(int subjectID) {
		this.subjectID = subjectID;
	}

	/**
	 * @return the expertSubjectDetailLevel
	 */
	public String getExpertSubjectDetailLevel() {
		return expertSubjectDetailLevel;
	}

	/**
	 * @param expertSubjectDetailLevel
	 *            the expertSubjectDetailLevel to set
	 */
	public void setExpertSubjectDetailLevel(String expertSubjectDetailLevel) {
		this.expertSubjectDetailLevel = expertSubjectDetailLevel;
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
	public String getSubjectCategoryID() {
		return subjectCategoryID;
	}

	/**
	 * @param subjectCategoryID
	 *            the subjectCategoryID to set
	 */
	public void setSubjectCategoryID(String subjectCategoryID) {
		this.subjectCategoryID = subjectCategoryID;
	}

	/**
	 * @return the subjectCategoryName
	 */
	public String getSubjectCategoryName() {
		return subjectCategoryName;
	}

	/**
	 * @param subjectCategoryName
	 *            the subjectCategoryName to set
	 */
	public void setSubjectCategoryName(String subjectCategoryName) {
		this.subjectCategoryName = subjectCategoryName;
	}

	/**
	 * @param expertID
	 * @param subjectID
	 * @param expertSubjectDetailLevel
	 * @param subjectName
	 * @param subjectCategoryID
	 * @param subjectCategoryName
	 */
	public ExpertSubjectDetail(int expertID, int subjectID, String expertSubjectDetailLevel, String subjectName,
			String subjectCategoryID, String subjectCategoryName) {
		this.expertID = expertID;
		this.subjectID = subjectID;
		this.expertSubjectDetailLevel = expertSubjectDetailLevel;
		this.subjectName = subjectName;
		this.subjectCategoryID = subjectCategoryID;
		this.subjectCategoryName = subjectCategoryName;
	}

}
