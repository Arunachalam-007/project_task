package com.chainsys.asmt;

import java.util.Scanner;


public class CustomException extends Exception{
	String name;
	int marks;
	public CustomException(String name,int marks) {
		this.name=name;
		this.marks=marks;
	}

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("Enter name");
		String name1=in.next();
		
		System.out.println("Enter marks");
		int marks1=in.nextInt();
		
		try {
			
			if(marks1<35) {
				throw new CustomException(name1,marks1) ;
				
			}
			else {
				System.out.println("Marks :"+marks1);
			}
		
		}
		catch(CustomException ex) {
			ex.printStackTrace();
			
		}

	}

}
