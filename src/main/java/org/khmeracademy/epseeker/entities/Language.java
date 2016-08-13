package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Language {

	@JsonProperty("LANGUAGE_ID")
	private int languageID;
	
	@JsonProperty("LANGUAGE_NAME")
	private String languageName;
	
	@JsonProperty("LANGUAGE_DESCRIPTION")
	private String languageDescription;
	
	
	public Language() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @param languageID
	 * @param languageName
	 * @param languageDescription
	 */
	public Language(int languageID, String languageName, String languageDescription) {
		this.languageID = languageID;
		this.languageName = languageName;
		this.languageDescription = languageDescription;
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
	 * @return the languageDescription
	 */
	public String getLanguageDescription() {
		return languageDescription;
	}


	/**
	 * @param languageDescription the languageDescription to set
	 */
	public void setLanguageDescription(String languageDescription) {
		this.languageDescription = languageDescription;
	}
	
	
	
}
