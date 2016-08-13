package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class POB {

	@JsonProperty("EXPERT_ID")
	private int expertID;
	
	@JsonProperty("COUNTRY_ID")
	private int countryID;
	
	@JsonProperty("COUNTRY_NAME")
	private String countryName;
	
	@JsonProperty("CITY_OR_PROVINCE_ID")
	private int cityOrProvinceID;
	
	@JsonProperty("CITY_OR_PROVINCE_NAME")
	private String cityOrProvinceName;
	
	@JsonProperty("DISTRICT_ID")
	private int districtID;
	
	@JsonProperty("DISTRICT_NAME")
	private String districtName;
	
	@JsonProperty("COMMUNE_ID")
	private int communeID;
	
	@JsonProperty("COMMUNE_NAME")
	private String communeName;
	
	public POB() {
		// TODO Auto-generated constructor stub
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
	 * @param expertID
	 * @param countryID
	 * @param countryName
	 * @param cityOrProvinceID
	 * @param cityOrProvinceName
	 * @param districtID
	 * @param districtName
	 * @param communeID
	 * @param communeName
	 */
	public POB(int expertID, int countryID, String countryName, int cityOrProvinceID, String cityOrProvinceName,
			int districtID, String districtName, int communeID, String communeName) {
		this.expertID = expertID;
		this.countryID = countryID;
		this.countryName = countryName;
		this.cityOrProvinceID = cityOrProvinceID;
		this.cityOrProvinceName = cityOrProvinceName;
		this.districtID = districtID;
		this.districtName = districtName;
		this.communeID = communeID;
		this.communeName = communeName;
	}


		
	
	
}
