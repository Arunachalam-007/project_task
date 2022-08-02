package com.chainsys;

import java.sql.*;

public class StudentImpl implements StudentIntface {

	public void info(Student stud) throws SQLException, ClassNotFoundException {
		Student s1=new Student();
		
		try {
			
			Connection con=StudentConnection.getConnection();
			
//			String squery5="create sequence id_valss start with 1 increment by 1 minvalue 0 maxvalue 100 cycle";
			
//			updateTable(stud);
//			deleteTable(stud);
//			readTable(stud);
			
			
			
//			String squery="insert into student(name,rollNo,grade)values(?,?,?)";
//			String squery1="delete from student where rollNo=55";
//			String squery2="update student set name='ashiq',grade='s' where rollNo=62";
//			PreparedStatement stmt=con.prepareStatement(squery5);
			
//			System.out.println(stud.getName());
//			stmt.setString(1, stud.getName());
//			stmt.setInt(2, stud.getRollNo());
//			stmt.setString(3, stud.getGrade());
//			int i=stmt.executeUpdate();
//			System.out.println(i);
			createTable(stud);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public  void createTable(Student stud) throws ClassNotFoundException, SQLException {
		Connection con=StudentConnection.getConnection();
		
		
//		String createTblQuery="create table studentInfo1(name varchar(20) not null,rollNo integer not null,grade varchar(3) not null)";
//		System.out.println(stud.getName());
		
		String squery="insert into studentInfo1(name,rollNo,grade)values(?,id_valss.nextval,?)";
		PreparedStatement stmt=con.prepareStatement(squery);
		stmt.setString(1, stud.getName());
//		stmt.setInt(2, stud.getRollNo());
		stmt.setString(2, stud.getGrade());
		int i=stmt.executeUpdate();
		System.out.println(i+"Successfully Table Created");	
		
	}
	
	public void updateTable(Student stud) throws ClassNotFoundException,SQLException {
		Connection con=StudentConnection.getConnection();
		String squery2="update student set name='Momo',grade='A+' where rollNo=62";
		PreparedStatement stmt=con.prepareStatement(squery2);
		int i=stmt.executeUpdate();
		System.out.println(i);	
		
	}
	public void deleteTable(Student stud) throws ClassNotFoundException, SQLException {
		Connection con=StudentConnection.getConnection();
		String squery1="delete from student where rollNo=36";
		PreparedStatement stmt=con.prepareStatement(squery1);
		int i=stmt.executeUpdate();
		System.out.println(i);	
	}
	public void readTable(Student stud) throws ClassNotFoundException,SQLException  {
		Connection con=StudentConnection.getConnection();
		String squery3="select rollNo from student where name='arun'";
		PreparedStatement stmt=con.prepareStatement(squery3);
		int i=stmt.executeUpdate();
		System.out.println(i);	
		
		
	}
	
	}

