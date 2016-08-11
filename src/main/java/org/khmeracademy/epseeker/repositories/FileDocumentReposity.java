package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.FileDocument;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;

@Repository
public interface FileDocumentReposity {

	@Select(SQL.SELECT)
	@Results({
		@Result(property="fileID", column="file_id"),
		@Result(property="fileName", column="file_name"),
		@Result(property="fileDescription", column="file_description")
	})
	ArrayList<FileDocument> findAll();
	
	@Select(SQL.SELECTONE)
	@Results({
		@Result(property="fileID", column="file_id"),
		@Result(property="fileName", column="file_name"),
		@Result(property="fileDescription", column="file_description")
	})
	FileDocument findOne(@PathVariable("fileID")int fileID);
	
	@Insert(SQL.INSERT)
	boolean save(FileDocument fileDocument);
	
	@Update(SQL.UPDATE)
	boolean update(FileDocument fileDocument);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("fileID")int fileID);
	
	interface SQL{
		String SELECT = "SELECT * FROM "
				+ "exp_file_document";
		
		String SELECTONE = "SELECT * FROM "
				+ "exp_file_document "
				+ "WHERE file_id = #{fileID}";
		
		String INSERT = "INSERT INTO exp_file_document "
				+ "(file_name, file_description) "
				+ "VALUES(#{fileName}, #{fileDescription})";
		
		String UPDATE = "UPDATE exp_file_document SET "
				+ "file_name = #{fileName}, "
				+ "file_description = #{fileDescription} "
				+ "WHERE file_id = #{fileID}";
		
		String DELETE = "DELETE FROM "
				+ "exp_file_document "
				+ "WHERE file_id = #{fileID}";
	}
	
}
