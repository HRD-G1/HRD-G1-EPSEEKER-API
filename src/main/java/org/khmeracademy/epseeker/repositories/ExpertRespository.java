package org.khmeracademy.epseeker.repositories;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Many;
import org.apache.ibatis.annotations.One;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.khmeracademy.epseeker.entities.CurrentAddress;
import org.khmeracademy.epseeker.entities.CurrentJob;
import org.khmeracademy.epseeker.entities.Education;
import org.khmeracademy.epseeker.entities.ExperienceDetail;
import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.entities.ExpertDocumentDetail;
import org.khmeracademy.epseeker.entities.ExpertLanguageDetail;
import org.khmeracademy.epseeker.entities.ExpertSubjectDetail;
import org.khmeracademy.epseeker.entities.JobExpectation;
import org.khmeracademy.epseeker.entities.POB;
import org.khmeracademy.epseeker.repositories.ExperienceDetailRepository.SQL;
import org.khmeracademy.epseeker.repositories.provider.ExpertProvider;
import org.springframework.stereotype.Repository;

@SuppressWarnings("unused")
@Repository
public interface ExpertRespository {

	
	//@SelectProvider(type=ExpertProvider.class, method="selectExpert")
	@Select(SQL.SELECT)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="expertFirstName", column="expert_firstname"),
		@Result(property="expertLastName", column="expert_lastname"),
		@Result(property="expertPhone1", column="expert_phone1"),
		@Result(property="expertPhoto", column="expert_photo"),
		@Result(property="expertStatus", column="expert_status"),
		@Result(property="expertPhone2", column="expert_phone2"),
		@Result(property="expertEmail", column="expert_email"),
		@Result(property="expertGeneration", column="expert_generation"),
		@Result(property="expertAdvanceCourse", column="expert_advance_course"),
		@Result(property="expertGender", column="expert_gender"),
		@Result(property="dob", column="expert_dob"),
		@Result(property="kaID", column="ka_id"),
		@Result(property="projectLinkDemo", column="project_link_demo"),
		@Result(property="educations", javaType=List.class, column="expert_id", many = @Many(select="findAllEducationsByExpertID")),
		@Result(property="subjects", javaType=List.class, column="expert_id", many = @Many(select="findAllSubjectsByExpertID")),
		@Result(property="languages", javaType=List.class, column="expert_id", many = @Many(select="findAllLanguagesByExpertID")),
		@Result(property="expertDocuments", javaType=List.class, column="expert_id", many = @Many(select="findAllFileDocumentsByExpertID")),
		@Result(property="expertExperiences", javaType=List.class, column="expert_id", many = @Many(select="findAllExperiencesByExpertID")),
		/*@Result(property="currentJobs", javaType=List.class, column="expert_id", many = @Many(select="findAllCurrentJobsByExpertID")),*/
		@Result(property="jobExpectations", column="expert_id", many = @Many(select="findAllJobExpectationsByExpertID")),
		@Result(property="currentAddress", column="expert_id", one = @One(select="findOneCurrentAddressByExpertID")),
		@Result(property="placeOfBirth", column="expert_id", one = @One(select="findOnePOBByExpertID"))
	})
	ArrayList<Expert> findAll();
	
	
	@Select(SQL.SELECT_RANDOM)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="expertFirstName", column="expert_firstname"),
		@Result(property="expertLastName", column="expert_lastname"),
		@Result(property="expertPhoto", column="expert_photo"),				
		@Result(property="expertAdvanceCourse", column="expert_advance_course")
	}) 
	ArrayList<Expert> findAllByRandom(); /*@Result(property="currentAddress", column="", one = @One(select="findOneCurrentAddressByExpertID"))*/
	
	
	@SelectProvider(type=ExpertProvider.class, method="selectOneExpertByID")
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="expertFirstName", column="expert_firstname"),
		@Result(property="expertLastName", column="expert_lastname"),
		@Result(property="expertPhone1", column="expert_phone1"),
		@Result(property="expertPhoto", column="expert_photo"),
		@Result(property="expertStatus", column="expert_status"),
		@Result(property="expertPhone2", column="expert_phone2"),
		@Result(property="expertEmail", column="expert_email"),
		@Result(property="expertGeneration", column="expert_generation"),
		@Result(property="expertAdvanceCourse", column="expert_advance_course"),
		@Result(property="expertGender", column="expert_gender"),
		@Result(property="dob", column="expert_dob"),
		@Result(property="kaID", column="ka_id"),
		@Result(property="projectLinkDemo", column="project_link_demo"),
		@Result(property="educations", javaType=List.class, column="expert_id", many = @Many(select="findAllEducationsByExpertID")),
		@Result(property="subjects", javaType=List.class, column="expert_id", many = @Many(select="findAllSubjectsByExpertID")),
		@Result(property="languages", javaType=List.class, column="expert_id", many = @Many(select="findAllLanguagesByExpertID")),
		@Result(property="expertDocuments", javaType=List.class, column="expert_id", many = @Many(select="findAllFileDocumentsByExpertID")),
		@Result(property="expertExperiences", javaType=List.class, column="expert_id", many = @Many(select="findAllExperiencesByExpertID")),
		/*@Result(property="currentJobs", javaType=List.class, column="expert_id", many = @Many(select="findAllCurrentJobsByExpertID")),*/
		@Result(property="jobExpectations", column="expert_id", many = @Many(select="findAllJobExpectationsByExpertID")),
		@Result(property="currentAddress", column="expert_id", one = @One(select="findOneCurrentAddressByExpertID")),
		@Result(property="placeOfBirth", column="expert_id", one = @One(select="findOnePOBByExpertID"))
	})
	Expert findOne(@Param("expertID") int expertID);
	
	@Insert(SQL.INSERT)
	boolean save(Expert exp);
	
	@Update(SQL.UPDATE)
	boolean update(Expert exp);
	
	@Delete(SQL.DELETE)
	boolean delete(@Param("expertID")int expertID);
	
	
	//new
	@Select(SQL.SELECT_ALL_EDUCATIONS_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="universityID", column="university_id"),
		@Result(property="educationStartYear", column="education_start_year"),
		@Result(property="educationEndYear", column="education_end_year"),
		@Result(property="majorID", column="major_id"),
		@Result(property="majorName", column="major_name"),
		@Result(property="universityName", column="university_name")
	})
	ArrayList<Education> findAllEducationsByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ALL_SUBJECTS_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="subjectID", column="subject_id"),
		@Result(property="expertSubjectDetailLevel", column="expert_subject_detail_level"),
		@Result(property="subjectName", column="subject_name"),
		@Result(property="subjectCategoryID", column="subject_category_id"),
		@Result(property="subjectCategoryName", column="subject_category_name")
		
	})
	ArrayList<ExpertSubjectDetail> findAllSubjectsByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ALL_LANGUAGES_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="languageID", column="language_id"),
		@Result(property="mention", column="mention"),
		@Result(property="languageName", column="language_name")
	})
	ArrayList<ExpertLanguageDetail> findAllLanguagesByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ALL_FILE_DOCUMENTS_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="fileDocumentID", column="file_document_id"),
		@Result(property="filePath", column="file_path"),
		@Result(property="description", column="description"),
		@Result(property="fileName", column="file_name")
	})
	ArrayList<ExpertDocumentDetail> findAllFileDocumentsByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ALL_EXPERIENCES_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="institutionID", column="institution_id"),
		@Result(property="positionID", column="position_id"),
		@Result(property="period", column="period"),
		@Result(property="positionName", column="position_name"),
		@Result(property="institutionName", column="institution_name"),
		@Result(property="institutionAddress", column="institution_address")
	})
	ArrayList<ExperienceDetail> findAllExperiencesByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ALL_CURRENT_JOBS_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="institutionID", column="institution_id"),
		@Result(property="positionID", column="position_id"),
		@Result(property="salary", column="salary"),
		@Result(property="institutionPhone", column="institution_phone"),
		@Result(property="institutionEmail", column="institution_email"),
		@Result(property="institutionName", column="institution_name"),
		@Result(property="institutionAddress", column="institution_address"),
		@Result(property="positionName", column="position_name")
	})
	ArrayList<CurrentJob> findAllCurrentJobsByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ALL_JOB_EXPECTATIONS_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="positionID", column="position_id"),
		@Result(property="minSalary", column="min_salary"),
		@Result(property="location", column="location"),
		@Result(property="maxSalary", column="max_salary"),
		@Result(property="positionName", column="position_name")
	})
	ArrayList<JobExpectation> findAllJobExpectationsByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ONE_OF_CURRENT_ADDRESS_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="communeName", column="commune_name"),
		@Result(property="districtID", column="district_id"),
		@Result(property="districtName", column="district_name"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="cityOrProvinceName", column="city_or_province_name"),
		@Result(property="countryID", column="country_id"),
		@Result(property="countryName", column="country_name")
	})
	CurrentAddress findOneCurrentAddressByExpertID(@Param("expertID")int expertID);
	
	@Select(SQL.SELECT_ONE_OF_POB_BY_EXPERT_ID)
	@Results({
		@Result(property="expertID", column="expert_id"),
		@Result(property="communeID", column="commune_id"),
		@Result(property="communeName", column="commune_name"),
		@Result(property="districtID", column="district_id"),
		@Result(property="districtName", column="district_name"),
		@Result(property="cityOrProvinceID", column="city_or_province_id"),
		@Result(property="cityOrProvinceName", column="city_or_province_name"),
		@Result(property="countryID", column="country_id"),
		@Result(property="countryName", column="country_name")
	})
	POB findOnePOBByExpertID(@Param("expertID")int expertID);
	//new
	
	interface SQL{
		String SELECT = "SELECT * FROM exp_expert";
		
		String SELECT_RANDOM = "SELECT * FROM exp_expert ORDER BY random() LIMIT 5";
		
		String SELECTONE = "SELECT * FROM exp_expert WHERE expert_id = #{expertID}";
		
		String INSERT = "INSERT INTO "
				+ "exp_expert "
				+ "(expert_firstname, expert_lastname, expert_phone1, expert_photo, expert_status, expert_phone2, expert_email, expert_generation, expert_advance_course, expert_gender, ka_id) "
				+ "VALUES(#{expertFirstName}, #{expertLastName}, #{expertPhone1}, #{expertPhoto}, #{expertStatus}, #{expertPhone2}, #{expertEmail}, #{expertGeneration}, #{expertAdvanceCourse}, #{expertGender}, #{kaID})";
		
		String UPDATE = "UPDATE exp_expert SET "
				+ "expert_firstname  = #{expertFirstName}, "
				+ "expert_lastname = #{expertLastName}, "
				+ "expert_phone1 = #{expertPhone1}, "
				+ "expert_photo = #{expertPhoto}, "
				+ "expert_status = #{expertStatus}, "
				+ "expert_phone2 = #{expertPhone2}, "
				+ "expert_email = #{expertEmail}, "
				+ "expert_generation  = #{expertGeneration}, "
				+ "expert_advance_course = #{expertAdvanceCourse}, "
				+ "expert_gender = #{expertGender},"
				+ "ka_id = #{kaID} "
				+ "WHERE expert_id = #{expertID}";
		
		String DELETE = "DELETE FROM exp_expert "
				+ "WHERE expert_id = #{expertID}";
		
		
		
		String SELECT_ALL_EDUCATIONS_BY_EXPERT_ID = "SELECT edu.expert_id, uni.university_id, uni.university_name, maj.major_id, maj.major_name, edu.education_start_year, edu.education_end_year " 
				+ "from exp_universities as uni " 
				+ "INNER JOIN exp_education as edu ON uni.university_id = edu.university_id " 
				+ "INNER JOIN exp_major as maj on edu.major_id = maj.major_id "
				+ "WHERE edu.expert_id = #{expertID}";
		
		String SELECT_ALL_SUBJECTS_EXPERT_ID = "SELECT subd.*, sub.*, subc.subject_category_name "
				+ "FROM exp_expert_subject_detail subd "
				+ "INNER JOIN exp_subject sub ON subd.subject_id = sub.subject_id "
				+ "INNER JOIN exp_subject_category subc ON subc.subject_category_id = sub.subject_category_id "
				+ "WHERE subd.expert_id = #{expertID}";
		
		String SELECT_ALL_LANGUAGES_BY_EXPERT_ID = "SELECT elang.*, lang.language_name "
				+"FROM exp_expert_language_detail as elang "
				+"INNER JOIN exp_language as lang ON elang.language_id = lang.language_id "
				+"WHERE elang.expert_id = #{expertID}";
		
		String SELECT_ALL_FILE_DOCUMENTS_BY_EXPERT_ID = "SELECT doc.*, fil.file_name "
				+"FROM exp_expert_document_detail as doc "
				+"INNER JOIN exp_file_document as fil ON doc.file_document_id = fil.file_id "
				+"WHERE expert_id = #{expertID}";
		
		String SELECT_ALL_EXPERIENCES_BY_EXPERT_ID = "	SELECT * "
				+ "FROM exp_experience_detail as expe "
				+ "INNER JOIN exp_positions as maj ON expe.position_id = maj.position_id "
				+ "INNER JOIN exp_institutions as ints ON ints.institution_id = expe.institution_id "
				+ "WHERE expe.expert_id = #{expertID}"; 
		
		String SELECT_ALL_CURRENT_JOBS_BY_EXPERT_ID = "SELECT * "
				+ "FROM exp_current_job as cur "
				+ "INNER JOIN exp_institutions as ints ON cur.institution_id = ints.institution_id "
				+ "INNER JOIN exp_positions as pos ON cur.position_id = pos.position_id "
				+ "WHERE cur.expert_id = #{expertID}";
		
		String SELECT_ALL_JOB_EXPECTATIONS_BY_EXPERT_ID = "SELECT * "
				+ "FROM exp_positions as pos "
				+ "INNER JOIN exp_job_expectation as jobs ON jobs.position_id = pos.position_id "
				+ "WHERE jobs.expert_id = #{expertID}";
		
		String SELECT_ONE_OF_CURRENT_ADDRESS_BY_EXPERT_ID = "SELECT cur.*, ccc.country_name, cit.city_or_province_name, dis.district_name, com.commune_name "
				+"FROM exp_current_address as cur " 
				+"INNER JOIN exp_city_or_provinces as cit ON cur.city_or_province_id = cit.city_or_province_id "
				+"LEFT JOIN exp_districts as dis ON dis.district_id = cur.district_id "
				+"LEFT JOIN exp_communes as com ON cur.commune_id = com.commune_id "
				+"LEFT JOIN exp_countries as ccc ON ccc.country_id = cur.country_id "
				+"WHERE cur.expert_id = #{expertID}";
		
		String SELECT_ONE_OF_POB_BY_EXPERT_ID = "SELECT pob.*, ccc.country_name, cit.city_or_province_name, dis.district_name, com.commune_name "
				+"FROM exp_pob as pob " 
				+"INNER JOIN exp_city_or_provinces as cit ON pob.city_or_province_id = cit.city_or_province_id "
				+"LEFT JOIN exp_districts as dis ON dis.district_id = pob.district_id "
				+"LEFT JOIN exp_communes as com ON pob.commune_id = com.commune_id "
				+"LEFT JOIN exp_countries as ccc ON ccc.country_id = pob.country_id "
				+"WHERE pob.expert_id = #{expertID}";
	}
	
}
