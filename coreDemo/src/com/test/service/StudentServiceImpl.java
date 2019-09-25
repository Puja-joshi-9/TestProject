package com.test.service;

import java.util.ArrayList;
import java.util.List;

import com.test.model.Student;

public class StudentServiceImpl implements StudentService {
	static List<Student> SList = new ArrayList<Student>();  //Static saves memory.

	@Override
	public void addStudent(Student S) {
		
		SList.add(S);
		System.out.println("Size = " + SList.size());
		
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return SList;
	}

	@Override
	public void deleteStudent(int index) {
		SList.remove(index);
		System.out.println("Size after delete is " +SList.size());
		
	}

}
