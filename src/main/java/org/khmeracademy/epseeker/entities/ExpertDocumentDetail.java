package org.khmeracademy.epseeker.entities;

public class ExpertDocumentDetail {

	private int expertID;
	private int fileDocumentID;
	private String filePath;
	private String description;
	
	public ExpertDocumentDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param fileDocumentID
	 * @param filePath
	 * @param description
	 */
	public ExpertDocumentDetail(int expertID, int fileDocumentID, String filePath, String description) {
		this.expertID = expertID;
		this.fileDocumentID = fileDocumentID;
		this.filePath = filePath;
		this.description = description;
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

	
	
}
