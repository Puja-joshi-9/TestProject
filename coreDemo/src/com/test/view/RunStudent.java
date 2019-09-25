package com.test.view;

import java.util.List;
import java.util.Scanner;

import com.test.model.Student;
import com.test.service.StudentService;
import com.test.service.StudentServiceImpl;

public class RunStudent {

	public static void main(String[] args) {
		
		String flag = "y";
		Scanner sc = new Scanner(System.in);
		StudentService ss = new StudentServiceImpl();
		do {

		Student S = new Student();
		System.out.println("Enter Id:");
		S.setId(sc.nextInt());
		System.out.println("Enter First name:");
		S.setfName(sc.next());
		System.out.println("Enter last name:");
		S.setLname(sc.next());
		System.out.println("Enter Adress:");
		S.setAddress(sc.next());
		System.out.println("Enter Phone:");
		S.setPhone(sc.next());
		System.out.println("Enter college Name:");
		S.setCollege(sc.next());
		System.out.println("Enter Roll no. :");
		S.setRoll(sc.nextInt());
		
		ss.addStudent(S);
		
		System.out.println("Do you want to add more students ?");
		flag = sc.next();
		}while(flag.equalsIgnoreCase("y"));
		
	
		
		//Display All Students Data.
		
		List<Student> SList = ss.getAllStudent();
		
		for(Student s : SList) {
			System.out.println("Id = " + s.getId());
			System.out.println("FirstName = "+ s.getfName());
			System.out.println("Last Name = "+ s.getLname());
			System.out.println("Phone no .= "+s.getPhone());
			System.out.println("Address = "+ s.getAddress());
			System.out.println("Roll No. = " + s.getRoll());
			System.out.println("College = "+ s.getCollege());
			
			//Delete Students
			
			System.out.println("Which Student do you want to delete(Give Index)?");
			
			ss.deleteStudent(sc.nextInt());
			//ss.deleteStudent(0);
			sc.close();
		}
	}
}
