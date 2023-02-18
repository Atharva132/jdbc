package com.jdbc.prac5a;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class ResultSetExtImpl implements ResultSetExtractor<List<Student>>{

	public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Student> studentList = new ArrayList<Student>();
		
		while(rs.next()) {
			Student student = new Student();
			student.setId(rs.getInt(1));
			student.setName(rs.getString(2));
			studentList.add(student);
		}
		return studentList;
	}

}
