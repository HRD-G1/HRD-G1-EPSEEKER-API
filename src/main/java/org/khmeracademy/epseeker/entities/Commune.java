package org.khmeracademy.epseeker.entities;

public class Commune {

	private int communeID;
	private String communeName;
	private int districtID;
	
	public Commune() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param communeID
	 * @param communeName
	 * @param districtID
	 */
	public Commune(int communeID, String communeName, int districtID) {
		this.communeID = communeID;
		this.communeName = communeName;
		this.districtID = districtID;
	}

	/**
	 * @return the communeID
	 */
	public int getCommuneID() {
		return communeID;
	}

	/**
	 * @param communeID the communeID to set
	 */
	public void setCommuneID(int communeID) {
		this.communeID = communeID;
	}

	/**
	 * @return the communeName
	 */
	public String getCommuneName() {
		return communeName;
	}

	/**
	 * @param communeName the communeName to set
	 */
	public void setCommuneName(String communeName) {
		this.communeName = communeName;
	}

	/**
	 * @return the districtID
	 */
	public int getDistrictID() {
		return districtID;
	}

	/**
	 * @param districtID the districtID to set
	 */
	public void setDistrictID(int districtID) {
		this.districtID = districtID;
	}
	
	
	
}
