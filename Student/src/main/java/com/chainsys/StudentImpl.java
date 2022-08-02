package com.chainsys;

import java.sql.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;



public class StudentImpl implements StudentIntface {

	public void info(Student stud) throws SQLException, ClassNotFoundException {
		Student s1=new Student();
		
		try {
			
			Connection con=StudentConnection.getConnection();
			
//			String squery5="create sequence id_valss start with 1 increment by 1 minvalue 0 maxvalue 100 cycle";
			createTable(stud);
			updateTable(stud);
			deleteTable(stud);
			readTable(stud);
			dataFetching(stud);
			
			
			
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
			

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public  void createTable(Student stud) throws ClassNotFoundException, SQLException {
		Connection con=StudentConnection.getConnection();
		
		
//		String createTblQuery="create table studentInfo1(name varchar(20) not null,rollNo integer not null,grade varchar(3) not null)";
//		System.out.println(stud.getName());
		
		String squery="insert into student(name,rollNo,grade,dateTime)values(?,?,?,?)";
		PreparedStatement stmt=con.prepareStatement(squery);
		stmt.setString(1, stud.getName());
		stmt.setInt(2, stud.getRollNo());
		stmt.setString(3, stud.getGrade());
		stmt.setDate(4, stud.getDate());
		int i=stmt.executeUpdate();
		System.out.println(i+"Successfully Table Created");	
		
	}
	
	

	public void updateTable(Student stud) throws ClassNotFoundException,SQLException {
		Connection con=StudentConnection.getConnection();
		String squery2="update student set name='Ashick',grade='B' where rollNo=62";
		PreparedStatement stmt=con.prepareStatement(squery2);
		int i=stmt.executeUpdate();
		System.out.println(i);	
		
	}
	public void deleteTable(Student stud) throws ClassNotFoundException, SQLException {
		Connection con=StudentConnection.getConnection();
		String squery1="delete from student where rollNo=55";
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
	public void dataFetching(Student stud) throws ClassNotFoundException, SQLException {
		Connection con=StudentConnection.getConnection();
		String squery4="select * from student where datetime between '03-09-2016' and '06-07-2019'";
		PreparedStatement stmt=con.prepareStatement(squery4);
		ResultSet i=stmt.executeQuery();
		ArrayList<Student> data = new ArrayList<Student>(); 
		while(i.next()) {
			String name = i.getString(1);
			int rollNo = i.getInt(2);
			String grade = i.getString(3);	
			Date date=i.getDate(4);
			
			
			Student b1 = new Student();
			
			b1.setName(name);
			b1.setRollNo(rollNo);
			b1.setGrade(grade);
			b1.setDate(date);
			data.add(b1);
			System.out.println(data);
		}
//		System.out.println(i);	
	}
	
	public List<Student> displayData() throws ClassNotFoundException, SQLException {
		
		
		Connection con;
		ArrayList<Student> data = new ArrayList<Student>(); 
		try {
			con = StudentConnection.getConnection();
			String query = "select * from student";
			PreparedStatement ps = con.prepareStatement(query);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				
				String name = rs.getString(1);
				int rollNo = rs.getInt(2);
				String grade = rs.getString(3);	
				Date date=rs.getDate(4);
				
				
				Student b1 = new Student();
				
				b1.setName(name);
				b1.setRollNo(rollNo);
				b1.setGrade(grade);
				b1.setDate(date);
				data.add(b1);
				
			}
			System.out.println("Table Updated!");
		}
		catch(Exception ex) {
			ex.printStackTrace();
		}
		
		return data;
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Student s1=new Student();
//		//StudentImpl si=new StudentImpl();
//		Connection con=StudentConnection.getConnection();
//		String query="select * from student";
//		PreparedStatement stmt=con.prepareStatement(query);
//		ResultSet rs = stmt.executeQuery();
//		ArrayList al=new ArrayList();
//		
//		while(rs.next()) {
//			String name=rs.getString(1);
//			int rollNo=rs.getInt(2);
//			String grade=rs.getString(3);
//			
//			s1.setName(name);
//			s1.setGrade(grade);
//			s1.setRollNo(rollNo);
//			
////			
//			al.add(s1);
////			al.add(name);
////			al.add(rollNo);
////			al.add(grade);
////			al.add(s1);
//			
//			
//			
////			Deque d1=new ArrayDeque();
////			d1.add(s1);
////			System.out.println(d1);
////			System.out.println(s1);
////			System.out.println(s1.getName()+"\t\t"+s1.getGrade()+"\t\t"+s1.getRollNo());
//			System.out.println(s1);
//			
//		}
//		
//		
//		
//		
////		List<Student> displayDetails=si.displayData();
////		System.out.println(displayDetails);
//		
////		ArrayList res=al;
//		
//		return al;
//		
//		
	}
	
	}
