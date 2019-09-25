package com.test.service;

import java.util.List;

import com.test.model.Student;

public interface StudentService {

	
	void addStudent(Student S); 
	List <Student> getAllStudent();
	void deleteStudent(int index);
		
	
}
