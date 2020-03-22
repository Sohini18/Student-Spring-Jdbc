package com.cognizant.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cognizant.model.Student;

public class StudentDaoImplTest {

	ApplicationContext factory = new AnnotationConfigApplicationContext(com.cognizant.config.Config.class);

	StudentDaoImpl impl = factory.getBean(StudentDaoImpl.class);

	Student student=new Student(2,"Sohini",40);
	
	@Test
	public void testInsert() {
		
		int actual=impl.insert(student);
		int expected=1;
		assertEquals(expected,actual);
	}
@SuppressWarnings("deprecation")
@Test	
public void testGetAll() {
	

		List<Student> all = impl.getAll();

		for (Student s : all) {
			assertEquals(2, s.getId());
			assertEquals("Sohini", s.getName());
			assertEquals(40.0, s.getScore(),0.001);

		}
}
}
	
	

