package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CurrentJob {

	@JsonProperty("EXPERT_ID")
	private int expertID;
	
	@JsonProperty("INSTITUTION_ID")
	private int institutionID;
	
	@JsonProperty("POSITION_ID")
	private int positionID;
	
	@JsonProperty("POSITION_NAME")
	private String positionName;
	
	@JsonProperty("SALARY")
	private double salary;
	
	@JsonProperty("INSTITUTION_PHONE")
	private String institutionPhone;
	
	@JsonProperty("INSTITUTION_EMAIL")
	private String institutionEmail;
	
	@JsonProperty("INSTITUTION_ADDRESS")
	private String institutionAddress;
	
	@JsonProperty("INSTITUTIOIN_NAME")
	private String institutionName;

	
	public CurrentJob() {
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
	 * @return the positionID
	 */
	public int getPositionID() {
		return positionID;
	}


	/**
	 * @param positionID the positionID to set
	 */
	public void setPositionID(int positionID) {
		this.positionID = positionID;
	}


	/**
	 * @return the positionName
	 */
	public String getPositionName() {
		return positionName;
	}


	/**
	 * @param positionName the positionName to set
	 */
	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}


	/**
	 * @return the salary
	 */
	public double getSalary() {
		return salary;
	}


	/**
	 * @param salary the salary to set
	 */
	public void setSalary(double salary) {
		this.salary = salary;
	}


	/**
	 * @return the institutionPhone
	 */
	public String getInstitutionPhone() {
		return institutionPhone;
	}


	/**
	 * @param institutionPhone the institutionPhone to set
	 */
	public void setInstitutionPhone(String institutionPhone) {
		this.institutionPhone = institutionPhone;
	}


	/**
	 * @return the institutionEmail
	 */
	public String getInstitutionEmail() {
		return institutionEmail;
	}


	/**
	 * @param institutionEmail the institutionEmail to set
	 */
	public void setInstitutionEmail(String institutionEmail) {
		this.institutionEmail = institutionEmail;
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
	 * @param expertID
	 * @param institutionID
	 * @param positionID
	 * @param positionName
	 * @param salary
	 * @param institutionPhone
	 * @param institutionEmail
	 * @param institutionAddress
	 * @param institutionName
	 */
	public CurrentJob(int expertID, int institutionID, int positionID, String positionName, double salary,
			String institutionPhone, String institutionEmail, String institutionAddress, String institutionName) {
		this.expertID = expertID;
		this.institutionID = institutionID;
		this.positionID = positionID;
		this.positionName = positionName;
		this.salary = salary;
		this.institutionPhone = institutionPhone;
		this.institutionEmail = institutionEmail;
		this.institutionAddress = institutionAddress;
		this.institutionName = institutionName;
	}

		
	
}
