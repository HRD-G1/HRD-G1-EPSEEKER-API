package org.khmeracademy.epseeker.entities;

public class ExpertLanguageDetail {

	private int expertID;
	private int languageID;
	private String mention;
	
	public ExpertLanguageDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param languageID
	 * @param mention
	 */
	public ExpertLanguageDetail(int expertID, int languageID, String mention) {
		this.expertID = expertID;
		this.languageID = languageID;
		this.mention = mention;
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
	 * @return the languageID
	 */
	public int getLanguageID() {
		return languageID;
	}

	/**
	 * @param languageID the languageID to set
	 */
	public void setLanguageID(int languageID) {
		this.languageID = languageID;
	}

	/**
	 * @return the mention
	 */
	public String getMention() {
		return mention;
	}

	/**
	 * @param mention the mention to set
	 */
	public void setMention(String mention) {
		this.mention = mention;
	}
	
	
	
}
