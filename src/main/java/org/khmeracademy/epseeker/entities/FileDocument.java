package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class FileDocument {

	@JsonProperty("FILE_ID")
	private int fileID;
	
	@JsonProperty("FILE_NAME")
	private String fileName;
	
	@JsonProperty("FILE_DESCRIPTION")
	private String fileDescription;

	public FileDocument() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the fileID
	 */
	public int getFileID() {
		return fileID;
	}

	/**
	 * @param fileID the fileID to set
	 */
	public void setFileID(int fileID) {
		this.fileID = fileID;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param fileName the fileName to set
	 */
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @return the fileDescription
	 */
	public String getFileDescription() {
		return fileDescription;
	}

	/**
	 * @param fileDescription the fileDescription to set
	 */
	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}

	/**
	 * @param fileID
	 * @param fileName
	 * @param fileDescription
	 */
	public FileDocument(int fileID, String fileName, String fileDescription) {
		this.fileID = fileID;
		this.fileName = fileName;
		this.fileDescription = fileDescription;
	}

	
	
}
