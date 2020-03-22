package com.cognizant.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.cognizant.model.Student;
import com.cognizant.rowmapper.StudentRowMapper;

@Component("studentdao")
public class StudentDaoImpl implements StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Student student) {
		String sql="insert into student values(?,?,?)";
		int result=jdbcTemplate.update(sql,student.getId(),student.getName(),student.getScore());
		return result;
		
	}
	
	public int delete(String name)
	{
		String st="delete from student where name=? ";
		int result=jdbcTemplate.update(st,name);
		return result;
	}

	public List<Student> getAll() {
		String string="select * from student";
		StudentRowMapper rowmapper=new StudentRowMapper();
		List<Student> result=jdbcTemplate.query(string,rowmapper);
		
		return result;
		
		
	}

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
