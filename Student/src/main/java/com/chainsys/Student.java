package com.chainsys;

import java.sql.*;
import java.util.ArrayList;

public class Student {

	private String name;
	private int rollNo;
	private String grade;
	private Date date;
	
	public Student() {
		this.name=name;
		this.rollNo=rollNo;
		this.grade=grade;
		this.date=date;
		
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + ", grade=" + grade + ", date=" + date + "]";
	}
	
}
