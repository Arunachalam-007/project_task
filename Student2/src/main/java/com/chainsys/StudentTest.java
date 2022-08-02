package com.chainsys;

import java.sql.SQLException;
import java.util.Scanner;

public class StudentTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentImpl si=new StudentImpl();
		Student s=new Student();
		
		Scanner in =new Scanner(System.in);
		System.out.println("Enter name");
		String name=in.next();
//		System.out.println("Enter rollno");
//		int rollNo=in.nextInt();
		System.out.println("Enter Grade");
		String grade=in.next();
		s.setGrade(grade);
		s.setName(name);
//		s.setRollNo(rollNo);
//		si.createTable(s);
//		System.out.println(s.getName()+"  "+s.getRollNo()+"   "+s.getGrade());
		si.info(s);
	}

}
