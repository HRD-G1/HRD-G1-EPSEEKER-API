package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.ExpertDocumentDetail;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpertDocumentDetailRepository {

	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="fileDocumentID", column="file_document_id"),
		@Result(property="filePath", column="file_path"),
		@Result(property="description", column="description")
	})
	ArrayList<ExpertDocumentDetail> findAll();
	
	@Select(SQL.SELECT_ALL_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="fileDocumentID", column="file_document_id"),
		@Result(property="filePath", column="file_path"),
		@Result(property="description", column="description"),
		@Result(property="fileName", column="file_name")
	})
	ArrayList<ExpertDocumentDetail> findAllByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="fileDocumentID", column="file_document_id"),
		@Result(property="filePath", column="file_path"),
		@Result(property="description", column="description")
	})
	ExpertDocumentDetail findOne(@Param("expertID")int expertID, @Param("fileDocumentID")int fileDocumentID, @Param("filePath")String filePath);
	
	
	@Insert(SQL.INSERT)
	boolean save(ExpertDocumentDetail expertDocumentDetail);
	
	@Update(SQL.UPDATE)
	boolean update(ExpertDocumentDetail expertDocumentDetail);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID, @Param("fileDocumentID")int fileDocumentID, @Param("filePath")String filePath);

	interface SQL{
		String SELECT = "SELECT * FROM exp_expert_document_detail";
		
		String SELECTONE = "SELECT * FROM exp_expert_document_detail WHERE expert_id = #{expertID} AND file_document_id = #{fileDocumentID} AND file_path = #{filePath}";
		
		String SELECT_ALL_BY_EXPERT_ID = "SELECT doc.*, fil.file_name "
				+"FROM exp_expert_document_detail as doc "
				+"INNER JOIN exp_file_document as fil ON doc.file_document_id = fil.file_id "
				+"WHERE expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO exp_expert_document_detail "
				+ "(expert_id, file_document_id, file_path, description, file_name) "
				+ "VALUES(#{expertID}, #{fileDocumentID}, #{filePath}, #{description}, #{fileName})";
		
		String UPDATE = "UPDATE exp_expert_document_detail SET "
				+ "file_document_id = #{fileDocumentID}, "
				+ "file_path = #{filePath},"
				+ "description = #{description} "
				+ "file_name = #{fileName}"
				+ "WHERE "
				+ "expert_id = #{expertID} "
				+ "AND file_document_id = #{fileDocumentID} "
				+ "AND file_path = #{filePath}";
		
		String DELETE = "DELETE FROM exp_expert_document_detail "
				+ "WHERE expert_id  = #{expertID} "
				+ "AND file_document_id = #{fileDocumentID} "
				+ "AND file_path = #{filePath}";
	}
	
}
