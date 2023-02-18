package com.jdbc.prac5a;

import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student){
		
		String query = "insert into student(id, name) values (?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName());
		return r;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
