package org.khmeracademy.epseeker.entities;

public class CurrentAddress {

	private int expertID;
	private int countryID;
	private int cityOrProvinceID;
	private int districtID;
	private int communeID;
	
	public CurrentAddress() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param countryID
	 * @param cityOrProvinceID
	 * @param districtID
	 * @param communeID
	 */
	public CurrentAddress(int expertID, int countryID, int cityOrProvinceID, int districtID, int communeID) {
		this.expertID = expertID;
		this.countryID = countryID;
		this.cityOrProvinceID = cityOrProvinceID;
		this.districtID = districtID;
		this.communeID = communeID;
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
	 * @return the countryID
	 */
	public int getCountryID() {
		return countryID;
	}

	/**
	 * @param countryID the countryID to set
	 */
	public void setCountryID(int countryID) {
		this.countryID = countryID;
	}

	/**
	 * @return the cityOrProvinceID
	 */
	public int getCityOrProvinceID() {
		return cityOrProvinceID;
	}

	/**
	 * @param cityOrProvinceID the cityOrProvinceID to set
	 */
	public void setCityOrProvinceID(int cityOrProvinceID) {
		this.cityOrProvinceID = cityOrProvinceID;
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
	
	
	
}
