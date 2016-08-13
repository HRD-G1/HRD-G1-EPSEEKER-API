package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class JobExpectation {

	@JsonProperty("EXPERT_ID")
	private int expertID;

	@JsonProperty("POSITION_ID")
	private int positionID;

	@JsonProperty("POSITION_NAME")
	private String positionName;

	@JsonProperty("MIN_SALARY")
	private double minSalary;

	@JsonProperty("MAX_SALARY")
	private double maxSalary;

	@JsonProperty("LOCATION")
	private String location;

	public JobExpectation() {
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
	 * @return the positionID
	 */
	public int getPositionID() {
		return positionID;
	}

	/**
	 * @param positionID
	 *            the positionID to set
	 */
	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	/**
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * @param positionName
	 *            the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	/**
	 * @return the minSalary
	 */
	public double getMinSalary() {
		return minSalary;
	}

	/**
	 * @param minSalary
	 *            the minSalary to set
	 */
	public void setMinSalary(double minSalary) {
		this.minSalary = minSalary;
	}

	/**
	 * @return the maxSalary
	 */
	public double getMaxSalary() {
		return maxSalary;
	}

	/**
	 * @param maxSalary
	 *            the maxSalary to set
	 */
	public void setMaxSalary(double maxSalary) {
		this.maxSalary = maxSalary;
	}

	/**
	 * @return the location
	 */
	public String getLocation() {
		return location;
	}

	/**
	 * @param location
	 *            the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}

	/**
	 * @param expertID
	 * @param positionID
	 * @param positionName
	 * @param minSalary
	 * @param maxSalary
	 * @param location
	 */
	public JobExpectation(int expertID, int positionID, String positionName, double minSalary, double maxSalary,
			String location) {
		this.expertID = expertID;
		this.positionID = positionID;
		this.positionName = positionName;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.location = location;
	}

}
