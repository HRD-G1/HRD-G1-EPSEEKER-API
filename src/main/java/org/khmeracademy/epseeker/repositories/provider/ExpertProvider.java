package org.khmeracademy.epseeker.repositories.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.khmeracademy.epseeker.entities.Expert;
import org.khmeracademy.epseeker.entities.ExpertDocumentDetail;
import org.khmeracademy.epseeker.entities.ExpertLanguageDetail;
import org.khmeracademy.epseeker.utils.Pagination;

public class ExpertProvider {

	public String selectOneExpertByID(Map<String, Object> obj) {

		int expertID = (int) obj.get("param1");

		String sql = new SQL() {
			{
				SELECT("*");
				FROM("exp_expert");
				WHERE("expert_id = " + expertID);
			}
		}.toString();

		return sql;
	}

	public String saveExpertLanguageDetail(ExpertLanguageDetail detail) {
		String INSERT_LANGUAGE_EXPERT = "INSERT INTO exp_expert_language_detail (expert_id, language_id, mention, level_number) "
				+ "VALUES( " + detail.getExpertID() + " , " + detail.getLanguageID() + " , '" + detail.getMention()
				+ "', "+ detail.getLevelNumber() +")";
		System.out.println(INSERT_LANGUAGE_EXPERT);
		return INSERT_LANGUAGE_EXPERT;
	}

	public String advanceSearch(Expert expert, Pagination pagination) {

		String sqlQuery = "SELECT " + "* " + "FROM " + "exp_expert " + "WHERE " + "expert_id IN ( " + "SELECT "
				+ "expert_id " + "FROM " + "expert_view";

		boolean ifFirst = true;

		if (expert.getSubjects() != null) {
			String num = "";
			for (int i = 0; i < expert.getSubjects().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getSubjects().get(i).getSubjectID();
			}
			if (!num.equals("")) {
				if (ifFirst) {
					sqlQuery += " WHERE " + "subject_id IN ( " + num + ") ";
					ifFirst = false;
				}
			}
		}

		if (expert.getExpertExperiences().get(0).getPositionID() != 0) {
			if (ifFirst) {
				sqlQuery += " WHERE position_id =" + expert.getExpertExperiences().get(0).getPositionID();
				ifFirst = false;
			} else {
				sqlQuery += " AND position_id =" + expert.getExpertExperiences().get(0).getPositionID();
			}

		}

		System.out.println("Peroid: " + expert.getExpertExperiences().get(0).getPeriod());

		if (!expert.getExpertExperiences().get(0).getPeriod().equals("NO")) {
			System.out.println(expert.getExpertExperiences().get(0).getPeriod());
			if (ifFirst) {
				sqlQuery += " WHERE period ='" + expert.getExpertExperiences().get(0).getPeriod() + "'";
				ifFirst = false;
			} else {
				sqlQuery += " AND period ='" + expert.getExpertExperiences().get(0).getPeriod() + "'";
			}
		}

		System.out.println("LL: " + expert.getLanguages());

		if (!expert.getLanguages().isEmpty()) {
			String num = "";
			for (int i = 0; i < expert.getLanguages().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getLanguages().get(i).getLanguageID();
			}
			if (ifFirst) {
				sqlQuery += " WHERE language_id IN (" + num + ")";
				ifFirst = false;
			} else {
				sqlQuery += " AND language_id IN (" + num + ")";
			}
		}

		System.out.println("Expert Gender: " + expert.getExpertGender());

		if (expert.getExpertGender().equals("1")) {
			if (ifFirst) {
				sqlQuery += " WHERE expert_gender = 'Male' ";
				ifFirst = false;
			} else {
				sqlQuery += " AND expert_gender = 'Male' ";
			}

		} else if (expert.getExpertGender().equals("2")) {
			if (ifFirst) {
				sqlQuery += " WHERE expert_gender = 'Female' ";
				ifFirst = false;
			} else {
				sqlQuery += " AND expert_gender = 'Female' ";
			}
		}

		if (expert.getCurrentAddress().getCityOrProvinceID() != 0) {
			if (ifFirst) {
				sqlQuery += " WHERE city_or_province_id = " + expert.getCurrentAddress().getCityOrProvinceID();
				ifFirst = false;
			} else {
				sqlQuery += " AND city_or_province_id = " + expert.getCurrentAddress().getCityOrProvinceID();
			}
		}

		if (expert.getMinSalary() != 0 && expert.getMaxSalary() != 0) {
			if (ifFirst) {
				sqlQuery += "WHERE min_salary > " + expert.getMinSalary() + "AND max_salary < " + expert.getMaxSalary();
				ifFirst = false;
			} else {
				sqlQuery += "AND min_salary > " + expert.getMinSalary() + "AND max_salary < " + expert.getMaxSalary();
			}

		}

		sqlQuery += " GROUP BY " + "expert_id ";
		if (expert.getMaxAge() != 0 && expert.getMinAge() != 0) {
			sqlQuery += "HAVING " + " expert_id IN ( " + "SELECT " + "e.expert_id " + "FROM " + "exp_expert AS e "
					+ "WHERE " + "EXTRACT ( " + "YEAR " + "FROM " + "age(now(), e.expert_dob) " + ") BETWEEN "
					+ expert.getMinAge() + " AND " + expert.getMaxAge() + ") ";
		}

		sqlQuery += " ) LIMIT " + pagination.getLimit() + " OFFSET " + pagination.getOffset();
		System.out.println("tHIS IS sql query " + sqlQuery);

		return sqlQuery;
	}

	public String advanceSearchCount(Expert expert) {
		String sqlQuery = "SELECT " + " COUNT(*) " + "FROM " + "exp_expert " + "WHERE " + "expert_id IN ( " + "SELECT "
				+ "expert_id " + "FROM " + "expert_view";

		boolean ifFirst = true;

		if (expert.getSubjects() != null) {
			String num = "";
			for (int i = 0; i < expert.getSubjects().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getSubjects().get(i).getSubjectID();
			}
			if (!num.equals("")) {
				if (ifFirst) {
					sqlQuery += " WHERE " + "subject_id IN ( " + num + ") ";
					ifFirst = false;
				}
			}
		}

		if (expert.getExpertExperiences().get(0).getPositionID() != 0) {
			if (ifFirst) {
				sqlQuery += " WHERE position_id =" + expert.getExpertExperiences().get(0).getPositionID();
				ifFirst = false;
			} else {
				sqlQuery += " AND position_id =" + expert.getExpertExperiences().get(0).getPositionID();
			}

		}

		System.out.println("Peroid: " + expert.getExpertExperiences().get(0).getPeriod());

		if (!expert.getExpertExperiences().get(0).getPeriod().equals("NO")) {
			System.out.println(expert.getExpertExperiences().get(0).getPeriod());
			if (ifFirst) {
				sqlQuery += " WHERE period ='" + expert.getExpertExperiences().get(0).getPeriod() + "'";
				ifFirst = false;
			} else {
				sqlQuery += " AND period ='" + expert.getExpertExperiences().get(0).getPeriod() + "'";
			}
		}

		System.out.println("LL: " + expert.getLanguages());

		if (!expert.getLanguages().isEmpty()) {
			String num = "";
			for (int i = 0; i < expert.getLanguages().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getLanguages().get(i).getLanguageID();
			}
			if (ifFirst) {
				sqlQuery += " WHERE language_id IN (" + num + ")";
				ifFirst = false;
			} else {
				sqlQuery += " AND language_id IN (" + num + ")";
			}
		}

		System.out.println("Expert Gender: " + expert.getExpertGender());

		if (expert.getExpertGender().equals("1")) {
			if (ifFirst) {
				sqlQuery += " WHERE expert_gender = 'Male' ";
				ifFirst = false;
			} else {
				sqlQuery += " AND expert_gender = 'Male' ";
			}

		} else if (expert.getExpertGender().equals("2")) {
			if (ifFirst) {
				sqlQuery += " WHERE expert_gender = 'Female' ";
				ifFirst = false;
			} else {
				sqlQuery += " AND expert_gender = 'Female' ";
			}
		}

		if (expert.getCurrentAddress().getCityOrProvinceID() != 0) {
			if (ifFirst) {
				sqlQuery += " WHERE city_or_province_id = " + expert.getCurrentAddress().getCityOrProvinceID();
				ifFirst = false;
			} else {
				sqlQuery += " AND city_or_province_id = " + expert.getCurrentAddress().getCityOrProvinceID();
			}
		}

		if (expert.getMinSalary() != 0 && expert.getMaxSalary() != 0) {
			if (ifFirst) {
				sqlQuery += "WHERE min_salary > " + expert.getMinSalary() + "AND max_salary < " + expert.getMaxSalary();
				ifFirst = false;
			} else {
				sqlQuery += "AND min_salary > " + expert.getMinSalary() + "AND max_salary < " + expert.getMaxSalary();
			}

		}

		sqlQuery += " GROUP BY " + "expert_id ";
		if (expert.getMaxAge() != 0 && expert.getMinAge() != 0) {
			sqlQuery += "HAVING " + " expert_id IN ( " + "SELECT " + "e.expert_id " + "FROM " + "exp_expert AS e "
					+ "WHERE " + "EXTRACT ( " + "YEAR " + "FROM " + "age(now(), e.expert_dob) " + ") BETWEEN "
					+ expert.getMinAge() + " AND " + expert.getMaxAge() + ") ";
		}

		sqlQuery += " )";
		
		System.out.println("Count: " + sqlQuery);

		return sqlQuery;
	}

	public String insertExpert(Expert expert) {
		String sqlQuery = "INSERT INTO " + "exp_expert " + "(expert_firstname," + " expert_lastname,"
				+ " expert_phone1," + " expert_photo," + " expert_status, " + "expert_phone2," + " expert_email,"
				+ " expert_generation," + " expert_advance_course," + " expert_gender," + " ka_id,"
				+ " project_link_demo," + " expert_dob ) " + "VALUES( '" + expert.getExpertFirstName() + "','"
				+ expert.getExpertLastName() + "','" + expert.getExpertPhone1() + "','" + expert.getExpertPhoto() + "',"
				+ expert.getExpertStatus() + ",'" + expert.getExpertPhone2() + "','" + expert.getExpertEmail() + "',"
				+ expert.getExpertGeneration() + ",'" + expert.getExpertAdvanceCourse() + "','"
				+ expert.getExpertGender() + "'," + expert.getKaID() + ", '" + expert.getProjectLinkDemo() + "','"
				+ expert.getDob() + "')";

		System.out.println(sqlQuery);

		return sqlQuery;
	}
	
	public String saveDocument(ExpertDocumentDetail expertDocumentDetail){
		String sqlQuery = "INSERT INTO exp_expert_document_detail "
				+ "(expert_id, file_document_id, file_path, description, file_name) "
				+ "VALUES("+expertDocumentDetail.getExpertID()+", "+expertDocumentDetail.getFileDocumentID()+", '"+expertDocumentDetail.getFilePath()+"', '"+expertDocumentDetail.getDescription()+"', '"+expertDocumentDetail.getFileName()+"')";
		System.out.println("SQL ===>"+ sqlQuery);
		return sqlQuery;
	}

}
