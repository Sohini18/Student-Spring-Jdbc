package com.cognizant.dao;

import java.util.List;

import com.cognizant.model.Student;

public interface StudentDao {

	int insert(Student student);
	List<Student> getAll();
	int delete(String name);
	
}
