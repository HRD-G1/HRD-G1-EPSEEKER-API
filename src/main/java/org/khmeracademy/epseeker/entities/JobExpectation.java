package org.khmeracademy.epseeker.entities;

public class JobExpectation {

	private int expertID;
	private int positionID;
	private double minSalary;
	private double maxSalary;
	private String location;
	
	public JobExpectation() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param positionID
	 * @param minSalary
	 * @param maxSalary
	 * @param location
	 */
	public JobExpectation(int expertID, int positionID, double minSalary, double maxSalary, String location) {
		this.expertID = expertID;
		this.positionID = positionID;
		this.minSalary = minSalary;
		this.maxSalary = maxSalary;
		this.location = location;
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
	 * @return the positionID
	 */
	public int getPositionID() {
		return positionID;
	}

	/**
	 * @param positionID the positionID to set
	 */
	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}

	/**
	 * @return the minSalary
	 */
	public double getMinSalary() {
		return minSalary;
	}

	/**
	 * @param minSalary the minSalary to set
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
	 * @param maxSalary the maxSalary to set
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
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	
	
	
}
