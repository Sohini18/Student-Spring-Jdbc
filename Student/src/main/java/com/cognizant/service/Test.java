
package com.cognizant.service;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cognizant.dao.StudentDaoImpl;
import com.cognizant.model.Student;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(com.cognizant.config.Config.class);

		StudentDaoImpl dao = factory.getBean(StudentDaoImpl.class);

		
		Student student=new Student(2,"Sohini",40);
		
		//int p=dao.delete("Sohini");
		//System.out.println("number of records deleted: "+p);
		int r=dao.delete("Babui");
		System.out.println("number of records deleted: "+r);
		int result=dao.insert(student);
		System.out.println("number of records inserted: "+result);
		List<Student> record=dao.getAll();
		System.out.println("Student record: "+ record);
		
		
		

	}

}
