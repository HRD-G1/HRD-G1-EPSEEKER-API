package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Country {

	@JsonProperty("COUNTRY_ID")
	private int countryID;
	
	@JsonProperty("COUNTRY_NAME")
	private String countryName;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param countryID
	 * @param countryName
	 */
	public Country(int countryID, String countryName) {
		this.countryID = countryID;
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
