package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpertLanguageDetail {

	
	@JsonProperty("EXPERT_ID")
	private int expertID;
	
	@JsonProperty("LANGUAGE_ID")
	private int languageID;
	
	@JsonProperty("MENTION")
	private String mention;
	
	@JsonProperty("LEVEL_NUMBER")
	private int levelNumber;
	
	@JsonProperty("LANGUAGE_NAME")
	private String languageName;
	
	public ExpertLanguageDetail() {
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

	/**
	 * @return the levelNumber
	 */
	public int getLevelNumber() {
		return levelNumber;
	}

	/**
	 * @param levelNumber the levelNumber to set
	 */
	public void setLevelNumber(int levelNumber) {
		this.levelNumber = levelNumber;
	}

	/**
	 * @return the languageName
	 */
	public String getLanguageName() {
		return languageName;
	}

	/**
	 * @param languageName the languageName to set
	 */
	public void setLanguageName(String languageName) {
		this.languageName = languageName;
	}

	/**
	 * @param expertID
	 * @param languageID
	 * @param mention
	 * @param levelNumber
	 * @param languageName
	 */
	public ExpertLanguageDetail(int expertID, int languageID, String mention, int levelNumber, String languageName) {
		this.expertID = expertID;
		this.languageID = languageID;
		this.mention = mention;
		this.levelNumber = levelNumber;
		this.languageName = languageName;
	}

	
	
}
