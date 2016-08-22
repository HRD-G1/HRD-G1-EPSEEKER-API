package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Institution {

	@JsonProperty("INSTITUTION_ID")
	private int institutionID;
	
	@JsonProperty("INSTITUTION_NAME")
	private String institutionName;
	
	@JsonProperty("INSTITUTION_ADDRESS")
	private String institutionAddress;
	
	public Institution() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param institutionID
	 * @param institutionName
	 * @param institutionAddress
	 */
	public Institution(int institutionID, String institutionName, String institutionAddress) {
		this.institutionID = institutionID;
		this.institutionName = institutionName;
		this.institutionAddress = institutionAddress;
	}

	/**
	 * @return the institutionID
	 */
	public int getInstitutionID() {
		return institutionID;
	}

	/**
	 * @param institutionID the institutionID to set
	 */
	public void setInstitutionID(int institutionID) {
		this.institutionID = institutionID;
	}

	/**
	 * @return the institutionName
	 */
	public String getInstitutionName() {
		return institutionName;
	}

	/**
	 * @param institutionName the institutionName to set
	 */
	public void setInstitutionName(String institutionName) {
		this.institutionName = institutionName;
	}

	/**
	 * @return the institutionAddress
	 */
	public String getInstitutionAddress() {
		return institutionAddress;
	}

	/**
	 * @param institutionAddress the institutionAddress to set
	 */
	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
	}
	
	
	
	
}
