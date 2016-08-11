package org.khmeracademy.epseeker.entities;

public class Expert {

	private int expertID;
	private String expertFirstName;
	private String expertLastName;
	private String expertPhone1;	
	private String expertPhoto;
	private String expertStatus;
	private String expertPhone2;
	private String expertEmail;
	private int expertGeneration;
	private String expertAdvanceCourse;
	private String expertGender;
	private int kaID;
	
	public Expert() {
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
	 * @return the expertFirstName
	 */
	public String getExpertFirstName() {
		return expertFirstName;
	}

	/**
	 * @param expertFirstName the expertFirstName to set
	 */
	public void setExpertFirstName(String expertFirstName) {
		this.expertFirstName = expertFirstName;
	}

	/**
	 * @return the expertLastName
	 */
	public String getExpertLastName() {
		return expertLastName;
	}

	/**
	 * @param expertLastName the expertLastName to set
	 */
	public void setExpertLastName(String expertLastName) {
		this.expertLastName = expertLastName;
	}

	/**
	 * @return the expertPhone1
	 */
	public String getExpertPhone1() {
		return expertPhone1;
	}

	/**
	 * @param expertPhone1 the expertPhone1 to set
	 */
	public void setExpertPhone1(String expertPhone1) {
		this.expertPhone1 = expertPhone1;
	}

	/**
	 * @return the expertPhoto
	 */
	public String getExpertPhoto() {
		return expertPhoto;
	}

	/**
	 * @param expertPhoto the expertPhoto to set
	 */
	public void setExpertPhoto(String expertPhoto) {
		this.expertPhoto = expertPhoto;
	}

	/**
	 * @return the expertStatus
	 */
	public String getExpertStatus() {
		return expertStatus;
	}

	/**
	 * @param expertStatus the expertStatus to set
	 */
	public void setExpertStatus(String expertStatus) {
		this.expertStatus = expertStatus;
	}

	/**
	 * @return the expertPhone2
	 */
	public String getExpertPhone2() {
		return expertPhone2;
	}

	/**
	 * @param expertPhone2 the expertPhone2 to set
	 */
	public void setExpertPhone2(String expertPhone2) {
		this.expertPhone2 = expertPhone2;
	}

	/**
	 * @return the expertEmail
	 */
	public String getExpertEmail() {
		return expertEmail;
	}

	/**
	 * @param expertEmail the expertEmail to set
	 */
	public void setExpertEmail(String expertEmail) {
		this.expertEmail = expertEmail;
	}

	/**
	 * @return the expertGeneration
	 */
	public int getExpertGeneration() {
		return expertGeneration;
	}

	/**
	 * @param expertGeneration the expertGeneration to set
	 */
	public void setExpertGeneration(int expertGeneration) {
		this.expertGeneration = expertGeneration;
	}

	/**
	 * @return the expertAdvanceCourse
	 */
	public String getExpertAdvanceCourse() {
		return expertAdvanceCourse;
	}

	/**
	 * @param expertAdvanceCourse the expertAdvanceCourse to set
	 */
	public void setExpertAdvanceCourse(String expertAdvanceCourse) {
		this.expertAdvanceCourse = expertAdvanceCourse;
	}

	/**
	 * @return the expertGender
	 */
	public String getExpertGender() {
		return expertGender;
	}

	/**
	 * @param expertGender the expertGender to set
	 */
	public void setExpertGender(String expertGender) {
		this.expertGender = expertGender;
	}

	@Override
	public String toString() {
		return getExpertID() + " " + getExpertFirstName() +  " " + getExpertLastName() + " " + getExpertPhone1() + " " + getExpertStatus() + " " + getExpertPhone2() + " " + getExpertEmail() + " " + getExpertGeneration() + " " + getExpertAdvanceCourse() + " " + getExpertGender();
	}

	/**
	 * @return the kaID
	 */
	public int getKaID() {
		return kaID;
	}

	/**
	 * @param kaID the kaID to set
	 */
	public void setKaID(int kaID) {
		this.kaID = kaID;
	}

	/**
	 * @param expertID
	 * @param expertFirstName
	 * @param expertLastName
	 * @param expertPhone1
	 * @param expertPhoto
	 * @param expertStatus
	 * @param expertPhone2
	 * @param expertEmail
	 * @param expertGeneration
	 * @param expertAdvanceCourse
	 * @param expertGender
	 * @param kaID
	 */
	public Expert(int expertID, String expertFirstName, String expertLastName, String expertPhone1, String expertPhoto,
			String expertStatus, String expertPhone2, String expertEmail, int expertGeneration,
			String expertAdvanceCourse, String expertGender, int kaID) {
		this.expertID = expertID;
		this.expertFirstName = expertFirstName;
		this.expertLastName = expertLastName;
		this.expertPhone1 = expertPhone1;
		this.expertPhoto = expertPhoto;
		this.expertStatus = expertStatus;
		this.expertPhone2 = expertPhone2;
		this.expertEmail = expertEmail;
		this.expertGeneration = expertGeneration;
		this.expertAdvanceCourse = expertAdvanceCourse;
		this.expertGender = expertGender;
		this.kaID = kaID;
	}
	
	
	
}
