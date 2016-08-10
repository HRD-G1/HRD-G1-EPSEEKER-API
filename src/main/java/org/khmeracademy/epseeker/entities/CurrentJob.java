package org.khmeracademy.epseeker.entities;

public class CurrentJob {

	private int expertID;
	private int institutionID;
	private int positionID;
	private double salary;
	private String institutionPhone;
	private String institutionEmail;
	
	public CurrentJob() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param institutionID
	 * @param positionID
	 * @param salary
	 * @param instiutionPhone
	 * @param institutioinEmail
	 */
	public CurrentJob(int expertID, int institutionID, int positionID, double salary, String instiutionPhone,
			String institutioinEmail) {
		this.expertID = expertID;
		this.institutionID = institutionID;
		this.positionID = positionID;
		this.salary = salary;
		this.institutionPhone = instiutionPhone;
		this.institutionEmail = institutioinEmail;
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

		
	
}
