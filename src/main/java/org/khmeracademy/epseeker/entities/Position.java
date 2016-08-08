package org.khmeracademy.epseeker.entities;

public class Position {

	private int positionID;
	private String positionName;
	
	public Position() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param positionID
	 * @param positionName
	 */
	public Position(int positionID, String positionName) {
		this.positionID = positionID;
		this.positionName = positionName;
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
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}

	/**
	 * @param positionName the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}
	
	
	
}
