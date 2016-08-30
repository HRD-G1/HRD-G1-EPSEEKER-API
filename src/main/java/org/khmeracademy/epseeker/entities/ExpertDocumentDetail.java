package org.khmeracademy.epseeker.entities;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ExpertDocumentDetail {

	@JsonProperty("EXPERT_ID")
	private int expertID;
	
	@JsonProperty("FILE_DOCUMENT_ID")
	private int fileDocumentID;
	
	@JsonProperty("FILE_PATH")
	private String filePath;
	
	@JsonProperty("DESCRIPTION")
	private String description;
	
	@JsonProperty("FILE_NAME")
	private String fileName;
	
	public ExpertDocumentDetail() {
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
	 * @return the fileDocumentID
	 */
	public int getFileDocumentID() {
		return fileDocumentID;
	}

	/**
	 * @param fileDocumentID the fileDocumentID to set
	 */
	public void setFileDocumentID(int fileDocumentID) {
		this.fileDocumentID = fileDocumentID;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
	 * @param expertID
	 * @param fileDocumentID
	 * @param fileDocumentName
	 * @param filePath
	 * @param description
	 * @param fileName
	 */
	public ExpertDocumentDetail(int expertID, int fileDocumentID, String filePath,
			String description, String fileName) {
		this.expertID = expertID;
		this.fileDocumentID = fileDocumentID;
		this.filePath = filePath;
		this.description = description;
		this.fileName = fileName;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ExpertDocumentDetail [expertID=" + expertID + ", fileDocumentID=" + fileDocumentID + ", filePath="
				+ filePath + ", description=" + description + ", fileName=" + fileName + "]";
	}
	
}
