package org.khmeracademy.epseeker.entities;

public class ExpertDocumentDetail {

	private int expertID;
	private int FileDocumentId;
	private String expertImage;
	private String description;
	
	public ExpertDocumentDetail() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param expertID
	 * @param fileDocumentId
	 * @param expertImage
	 * @param description
	 */
	public ExpertDocumentDetail(int expertID, int fileDocumentId, String expertImage, String description) {
		this.expertID = expertID;
		FileDocumentId = fileDocumentId;
		this.expertImage = expertImage;
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
	 * @return the fileDocumentId
	 */
	public int getFileDocumentId() {
		return FileDocumentId;
	}

	/**
	 * @param fileDocumentId the fileDocumentId to set
	 */
	public void setFileDocumentId(int fileDocumentId) {
		FileDocumentId = fileDocumentId;
	}

	/**
	 * @return the expertImage
	 */
	public String getExpertImage() {
		return expertImage;
	}

	/**
	 * @param expertImage the expertImage to set
	 */
	public void setExpertImage(String expertImage) {
		this.expertImage = expertImage;
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
