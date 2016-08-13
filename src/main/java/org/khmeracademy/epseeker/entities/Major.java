package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Major {

	@JsonProperty("MAJOR_ID")
	private int majorID;
	
	@JsonProperty("MAJOR_NAME")
	private String majorName;
	
	public Major() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param majorID
	 * @param majorName
	 */
	public Major(int majorID, String majorName) {
		this.majorID = majorID;
		this.majorName = majorName;
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
