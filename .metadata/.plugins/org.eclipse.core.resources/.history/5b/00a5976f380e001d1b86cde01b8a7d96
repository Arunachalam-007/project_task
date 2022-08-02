package com.chainsys.exceptions;

import java.util.Scanner;

public class UserDefinedExceptions extends Exception{

	String name;
	int marks;
	public UserDefinedExceptions(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}
	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name");
		String name1=in.next();
		
		System.out.println("Enter marks");
		int marks1=in.nextInt();
		
//		for(int i=0;i<5;i++) {
//			System.out.println("Enter marks");
//			marks[i]=in.nextInt();
//		}
		
		try {
		
			if(marks1<35) {
				throw new UserDefinedExceptions(name1,marks1) ;
				
			}
			else {
				System.out.println("Marks :"+marks1);
			}
		
		}
		catch(UserDefinedExceptions ex) {
			System.out.println(ex.toString());
			System.out.println(ex.getMessage());
			ex.printStackTrace();
			
		}
//		UserDefinedExceptions ude=new UserDefinedExceptions(name1,marks1);
//		
		
		
		

	}

}
