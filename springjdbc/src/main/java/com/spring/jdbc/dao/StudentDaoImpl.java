package com.spring.jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.spring.jdbc.entity.Student;

@Component("studentDao")
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	public int insert(Student student) {
		String query = "insert into student(id, name, city) values(?,?,?)";
		int r =this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());
		return r;
	}
	
	public int update(Student student) {
		String query = "update student set city=? where id=?";
		int res = this.jdbcTemplate.update(query, student.getCity(), student.getId());
		return res;
	}
	
	public int delete(Student student) {
		String query = "delete from student where id=?";
		
		int rs = this.jdbcTemplate.update(query, student.getId());
		return rs;
	}
	
	public Student getStudent(int studentId) {
		String query ="Select * from student where id=?";
		
//		Student student = this.jdbcTemplate.queryForObject(query, new RowMapper<Student>(){
//
//			public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Student st = new Student();
//				st.setId(rs.getInt(1));
//				st.setName(rs.getString(2));
//				st.setCity(rs.getString(3));
//				return st;
//			}
//			
//		}, studentId);
		RowMapper<Student> rowMapper = new RowMapperImpl();
		Student student = this.jdbcTemplate.queryForObject(query,rowMapper, studentId);
		
		return student;
	}
	
	public List<Student> getAll(){
		String query ="Select * from student";
		List<Student> student = this.jdbcTemplate.query(query, new RowMapperImpl());
		return student;
	}
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}
	
//	@Autowired
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
}
