package org.khmeracademy.epseeker.repositories.provider;

import java.util.Map;

import org.apache.ibatis.jdbc.SQL;
import org.khmeracademy.epseeker.entities.Expert;
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
		String INSERT_LANGUAGE_EXPERT = "INSERT INTO exp_expert_language_detail (expert_id, language_id, mention) "
				+ "VALUES( " + detail.getExpertID() + " , " + detail.getLanguageID() + " , '" + detail.getMention()
				+ "')";
		System.out.println(INSERT_LANGUAGE_EXPERT);
		return INSERT_LANGUAGE_EXPERT;
	}

	public String advanceSearch(Expert expert, Pagination pagination) {
		String sqlQuery = "SELECT * " + "FROM " + "exp_expert " + "WHERE " + "	expert_id IN ( " + "	SELECT "
				+ "	ee.expert_id AS expert_id " + "FROM " + "exp_expert ee "
				+ "INNER JOIN exp_expert_subject_detail ees ON ee.expert_id = ees.expert_id "
				+ "INNER JOIN exp_subject es ON ees.subject_id = es.subject_id "
				+ "INNER JOIN exp_experience_detail eed ON ee.expert_id = eed.expert_id "
				+ "INNER JOIN exp_positions ep ON ep.position_id = eed.position_id "
				+ "INNER JOIN exp_expert_language_detail eld ON eld.expert_id = ee.expert_id "
				+ "INNER JOIN exp_language lan ON lan.language_id = eld.language_id "
				+ "INNER JOIN exp_current_address cur ON cur.expert_id = ee.expert_id "
				+ "INNER JOIN exp_city_or_provinces cop ON cop.city_or_province_id = cur.city_or_province_id "
				+ "INNER JOIN exp_job_expectation jex ON jex.expert_id = ee.expert_id ";

		if (expert.getSubjects() != null) {
			String num = "";
			for (int i = 0; i < expert.getSubjects().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getSubjects().get(i).getSubjectID();
			}
			if (!num.equals("")) {
				sqlQuery += " WHERE " + "es.subject_id IN ( " + num + ") ";
			}
		}

		if (expert.getExpertExperiences().get(0).getPositionID() != 0) {
			sqlQuery += " AND eed.position_id =" + expert.getExpertExperiences().get(0).getPositionID();
		}

		System.out.println("Peroid: " + expert.getExpertExperiences().get(0).getPeriod());

		if (!expert.getExpertExperiences().get(0).getPeriod().equals("NO")) {
			System.out.println(expert.getExpertExperiences().get(0).getPeriod());
			sqlQuery += " AND eed.period ='" + expert.getExpertExperiences().get(0).getPeriod() + "'";
		}

		System.out.println("LL: " + expert.getLanguages());

		if (!expert.getLanguages().isEmpty()) {
			String num = "";
			for (int i = 0; i < expert.getLanguages().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getLanguages().get(i).getLanguageID();
			}
			sqlQuery += " AND lan.language_id IN (" + num + ")";
		}

		if (expert.getExpertGender().equals("Male")) {
			sqlQuery += " AND ee.expert_gender = 'Male' ";
		} else if (expert.getExpertGender().equals("Female")) {
			sqlQuery += " AND ee.expert_gender = 'Female' ";
		}

		if (expert.getCurrentAddress().getCityOrProvinceID() != 0) {
			sqlQuery += " AND cur.city_or_province_id = " + expert.getCurrentAddress().getCityOrProvinceID();
		}

		if (expert.getMinSalary() != 0 && expert.getMaxSalary() != 0) {
			sqlQuery += "AND jex.min_salary > " + expert.getMinSalary() + "AND jex.max_salary < "
					+ expert.getMaxSalary();
		}

		sqlQuery += "GROUP BY " + "ee.expert_id ";
		if (expert.getMaxAge() != 0 && expert.getMinAge() != 0) {
			sqlQuery += "HAVING " + "ee.expert_id IN ( " + "SELECT " + "e.expert_id " + "FROM " + "exp_expert AS e "
					+ "WHERE " + "EXTRACT ( " + "YEAR " + "FROM " + "age(now(), e.expert_dob) " + ") BETWEEN "
					+ expert.getMinAge() + "AND " + expert.getMaxAge() + ") ";
		}

		sqlQuery += " ) LIMIT " + pagination.getLimit() + " OFFSET " + pagination.getOffset();
		System.out.println(sqlQuery);

		return sqlQuery;
	}

	public String advanceSearchCount(Expert expert) {
		String sqlQuery = "SELECT count(*) " + "FROM " + "exp_expert " + "WHERE " + "	expert_id IN ( " + "	SELECT "
				+ "	ee.expert_id AS expert_id " + "FROM " + "exp_expert ee "
				+ "INNER JOIN exp_expert_subject_detail ees ON ee.expert_id = ees.expert_id "
				+ "INNER JOIN exp_subject es ON ees.subject_id = es.subject_id "
				+ "INNER JOIN exp_experience_detail eed ON ee.expert_id = eed.expert_id "
				+ "INNER JOIN exp_positions ep ON ep.position_id = eed.position_id "
				+ "INNER JOIN exp_expert_language_detail eld ON eld.expert_id = ee.expert_id "
				+ "INNER JOIN exp_language lan ON lan.language_id = eld.language_id "
				+ "INNER JOIN exp_current_address cur ON cur.expert_id = ee.expert_id "
				+ "INNER JOIN exp_city_or_provinces cop ON cop.city_or_province_id = cur.city_or_province_id "
				+ "INNER JOIN exp_job_expectation jex ON jex.expert_id = ee.expert_id ";

		if (expert.getSubjects() != null) {
			String num = "";
			for (int i = 0; i < expert.getSubjects().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getSubjects().get(i).getSubjectID();
			}
			if (!num.equals("")) {
				sqlQuery += " WHERE " + "es.subject_id IN ( " + num + ") ";
			}
		}

		if (expert.getExpertExperiences().get(0).getPositionID() != 0) {
			sqlQuery += " AND eed.position_id =" + expert.getExpertExperiences().get(0).getPositionID();
		}

		System.out.println("Peroid: " + expert.getExpertExperiences().get(0).getPeriod());

		if (!expert.getExpertExperiences().get(0).getPeriod().equals("NO")) {
			sqlQuery += " AND eed.period ='" + expert.getExpertExperiences().get(0).getPeriod() + "'";
		}

		System.out.println("LL: " + expert.getLanguages());

		if (!expert.getLanguages().isEmpty()) {
			String num = "";
			for (int i = 0; i < expert.getLanguages().size(); i++) {
				if (i != 0)
					num += ",";
				num += expert.getLanguages().get(i).getLanguageID();
			}
			sqlQuery += " AND lan.language_id IN (" + num + ")";
		}

		if (expert.getExpertGender().equals("Male")) {
			sqlQuery += " AND ee.expert_gender = 'Male' ";
		} else if (expert.getExpertGender().equals("Female")) {
			sqlQuery += " AND ee.expert_gender = 'Female' ";
		}

		if (expert.getCurrentAddress().getCityOrProvinceID() != 0) {
			sqlQuery += " AND cur.city_or_province_id = " + expert.getCurrentAddress().getCityOrProvinceID();
		}

		if (expert.getMinSalary() != 0 && expert.getMaxSalary() != 0) {
			sqlQuery += "AND jex.min_salary > " + expert.getMinSalary() + "AND jex.max_salary < "
					+ expert.getMaxSalary();
		}

		sqlQuery += "GROUP BY " + "ee.expert_id ";
		if (expert.getMaxAge() != 0 && expert.getMinAge() != 0) {
			sqlQuery += "HAVING " + "ee.expert_id IN ( " + "SELECT " + "e.expert_id " + "FROM " + "exp_expert AS e "
					+ "WHERE " + "EXTRACT ( " + "YEAR " + "FROM " + "age(now(), e.expert_dob) " + ") BETWEEN "
					+ expert.getMinAge() + "AND " + expert.getMaxAge() + ") ";
		}

		sqlQuery += " )";

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

}
