package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class District {

	@JsonProperty("DISTRICT_ID")
	private int districtID;
	
	@JsonProperty("DISTRICT_NAME")
	private String districtName;
	
	@JsonProperty("CITY_OR_PROVINCE_ID")
	private int cityOrProvinceID;
	
	public District() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param districtID
	 * @param districtName
	 * @param cityOrProvinceID
	 */
	public District(int districtID, String districtName, int cityOrProvinceID) {
		this.districtID = districtID;
		this.districtName = districtName;
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
	
	
	
	
}
