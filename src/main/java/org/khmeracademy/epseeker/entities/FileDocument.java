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
	 * @param fileID
	 * @param fileName
	 * @param fielDescription
	 */
	public FileDocument(int fileID, String fileName, String fielDescription) {
		this.fileID = fileID;
		this.fileName = fileName;
		this.fileDescription = fielDescription;
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
	 * @return the fielDescription
	 */
	public String getFielDescription() {
		return fileDescription;
	}

	/**
	 * @param fielDescription the fielDescription to set
	 */
	public void setFielDescription(String fielDescription) {
		this.fileDescription = fielDescription;
	}
	
	
}
