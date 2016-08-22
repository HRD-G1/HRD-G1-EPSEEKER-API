package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CityOrProvince {

	@JsonProperty("CITY_OR_PROVINCE_ID")
	private int cityOrProvinceID;
	
	@JsonProperty("CITY_OR_PROVINCE_NAME")
	private String cityOrProvinceName;
	
	@JsonProperty("COUNTRY_ID")
	private int countryID;
	
	@JsonProperty("COUNTRY_NAME")
	private String countryName;
	
	public CityOrProvince() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param cityOrProvinceID
	 * @param cityOrProvinceName
	 * @param countryID
	 * @param countryName
	 */
	public CityOrProvince(int cityOrProvinceID, String cityOrProvinceName, int countryID, String countryName) {
		this.cityOrProvinceID = cityOrProvinceID;
		this.cityOrProvinceName = cityOrProvinceName;
		this.countryID = countryID;
		this.countryName = countryName;
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

	/**
	 * @return the countryName
	 */
	public String getCountryName() {
		return countryName;
	}

	/**
	 * @param countryName the countryName to set
	 */
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

		
}
