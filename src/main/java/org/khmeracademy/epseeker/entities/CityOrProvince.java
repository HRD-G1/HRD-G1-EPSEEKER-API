package org.khmeracademy.epseeker.entities;

public class CityOrProvince {

	private int cityOrProvinceID;
	private String cityOrProvinceName;
	private int countryID;
	
	public CityOrProvince() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cityOrProvinceID
	 * @param cityOrProvinceName
	 * @param countryID
	 */
	public CityOrProvince(int cityOrProvinceID, String cityOrProvinceName, int countryID) {
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
	public String getCityOrProvinceName() {
		return cityOrProvinceName;
	}

	/**
	 * @param cityOrProvinceName the cityOrProvinceName to set
	 */
	public void setCityOrProvinceName(String cityOrProvinceName) {
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
