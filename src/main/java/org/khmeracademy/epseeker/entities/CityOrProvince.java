package org.khmeracademy.epseeker.entities;

public class CityOrProvince {

	private int cityOrProvinceID;
	private int cityOrProvinceName;
	private int countryID;
	
	public CityOrProvince() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cityOrProvinceID
	 * @param cityOrProvinceName
	 * @param countryID
	 */
	public CityOrProvince(int cityOrProvinceID, int cityOrProvinceName, int countryID) {
		this.cityOrProvinceID = cityOrProvinceID;
		this.cityOrProvinceName = cityOrProvinceName;
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
	 * @return the cityOrProvinceName
	 */
	public int getCityOrProvinceName() {
		return cityOrProvinceName;
	}

	/**
	 * @param cityOrProvinceName the cityOrProvinceName to set
	 */
	public void setCityOrProvinceName(int cityOrProvinceName) {
		this.cityOrProvinceName = cityOrProvinceName;
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
	
	
}
