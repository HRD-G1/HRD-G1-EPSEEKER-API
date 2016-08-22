package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class District {

	@JsonProperty("DISTRICT_ID")
	private int districtID;
	
	@JsonProperty("DISTRICT_NAME")
	private String districtName;
	
	@JsonProperty("CITY_OR_PROVINCE_ID")
	private int cityOrProvinceID;
	
	@JsonProperty("CITY_OR_PROVINCE_NAME")
	private String cityOrProvinceName;
	
	@JsonProperty("COUNTRY_NAME")
	private String countryName;
	
	@JsonProperty("COUNTRY_ID")
	private int countryID;
	
	public District() {
		// TODO Auto-generated constructor stub
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
	 * @return the districtName
	 */
	public String getDistrictName() {
		return districtName;
	}

	/**
	 * @param districtName the districtName to set
	 */
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
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
	 * @param districtID
	 * @param districtName
	 * @param cityOrProvinceID
	 * @param cityOrProvinceName
	 * @param countryName
	 * @param countryID
	 */
	public District(int districtID, String districtName, int cityOrProvinceID, String cityOrProvinceName,
			String countryName, int countryID) {
		this.districtID = districtID;
		this.districtName = districtName;
		this.cityOrProvinceID = cityOrProvinceID;
		this.cityOrProvinceName = cityOrProvinceName;
		this.countryName = countryName;
		this.countryID = countryID;
	}

	
	
}
