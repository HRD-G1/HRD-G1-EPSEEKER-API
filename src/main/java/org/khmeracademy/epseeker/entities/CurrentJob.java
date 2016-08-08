package org.khmeracademy.epseeker.entities;

public class CurrentJob {

	private int expertID;
	private int institutionID;
	private int positionID;
	private double salary;
	private String instiutionPhone;
	private String institutioinEmail;
	
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
		this.instiutionPhone = instiutionPhone;
		this.institutioinEmail = institutioinEmail;
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
	 * @return the instiutionPhone
	 */
	public String getInstiutionPhone() {
		return instiutionPhone;
	}

	/**
	 * @param instiutionPhone the instiutionPhone to set
	 */
	public void setInstiutionPhone(String instiutionPhone) {
		this.instiutionPhone = instiutionPhone;
	}

	/**
	 * @return the institutioinEmail
	 */
	public String getInstitutioinEmail() {
		return institutioinEmail;
	}

	/**
	 * @param institutioinEmail the institutioinEmail to set
	 */
	public void setInstitutioinEmail(String institutioinEmail) {
		this.institutioinEmail = institutioinEmail;
	}
	
	
	
}
