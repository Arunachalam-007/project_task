package com.chainsys;


import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;

import java.util.Scanner;



public class StudentTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, ParseException {
		
		StudentImpl si=new StudentImpl();
		Student s=new Student();
		Scanner in =new Scanner(System.in);
		
		
		
		System.out.println("Enter name");
		String name=in.next();
		System.out.println("Enter rollno");
		int rollNo=in.nextInt();
		System.out.println("Enter Grade");
		String grade=in.next();
		System.out.println("Enter date");
		String date=in.next();
		
		s.setGrade(grade);
		s.setName(name);
		
		
		LocalDate joiningDate = LocalDate.parse(date);
        Date loc = Date.valueOf(joiningDate);
//		SimpleDateFormat formatter2=new SimpleDateFormat("dd-MM-yyyy");  
//		Date date1=(Date) formatter2.parse(date);  
//		
		
//		Date date1 = (Date) new SimpleDateFormat("dd-MM-yyyy").parse(date);
		
//		SimpleDateFormat dateInput = new SimpleDateFormat("dd-MM-yyyy");
//		Date date1= (Date) dateInput.parse(date);
		s.setRollNo(rollNo);
		s.setDate(loc);
//		si.createTable(s);
//		System.out.println(s.getName()+"  "+s.getRollNo()+"   "+s.getGrade());
		si.info(s);
		
		
		
		
		ArrayList<Student> data = new ArrayList<Student>(); 
		data = (ArrayList<Student>) si.displayData();
		for(int i=0; i<data.size(); i++) {
			System.out.println("Name :" + data.get(i).getName());
			System.out.println("Roll No :" + data.get(i).getRollNo());
			System.out.println("Grade :" + data.get(i).getGrade());
			System.out.println("Date :"+data.get(i).getDate());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		List<Student> displayDetails=si.displayData();
////		Iterator <Student>itr=displayDetails.iterator();
////		while(itr.hasNext()) {
////			System.out.println(itr.next());
////		}
////		System.out.println(displayDetails);
	}

}
