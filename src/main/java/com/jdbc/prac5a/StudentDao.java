package com.jdbc.prac5a;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class StudentDao {
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student){
		
		String query = "insert into student(id, name) values (?,?)";
		int r = this.jdbcTemplate.update(query, student.getId(), student.getName());
		return r;
	}
	
	public int change(Student student) {
		
		String query = "update student set name=? where id=?";
		int r = this.jdbcTemplate.update(query, student.getName(), student.getId());
		return r;
	}
	
	public int delete(int studentId) {
		String query = "delete from student where id=?";
		int r = this.jdbcTemplate.update(query,studentId);
		return r;
	}
	
	public Student getStudent(int studentId) {
		String query = "select * from student where id=?";
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student  student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
		return student;
	}
	
	public List<Student> getAllStudents(){
		String listQuery = "select * from student";
		List<Student> student = this.jdbcTemplate.query(listQuery, new RowMapperImpl());
		return student;
	}
	
	public List<Student> getAllStuds(){
		String query = "select * from student";
		List<Student> studentList = this.jdbcTemplate.query(query, new ResultSetExtImpl());
		return studentList;
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
