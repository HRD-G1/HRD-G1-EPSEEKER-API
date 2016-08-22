package org.khmeracademy.epseeker.repositories.provider;

import org.apache.ibatis.jdbc.SQL;
import org.khmeracademy.epseeker.entities.SubjectCategory;

public class SubjectCategoryProvider {

	public String updateSubject(SubjectCategory subjectCategory) {
		String sql = new SQL() {
			{
				UPDATE("exp_subject_category SET subject_category_name = '"
						+ subjectCategory.getSubjectCategoryName() + "' WHERE subject_category_id = "
						+ subjectCategory.getSubjectCategoryID());
			}
		}.toString(); 
		
		System.out.println(sql);
		return sql;
	}

}
