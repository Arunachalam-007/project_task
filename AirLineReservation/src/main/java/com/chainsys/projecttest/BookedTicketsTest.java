package com.chainsys.projecttest;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.project.BookedTickets;
import com.chainsys.projectimpl.FlightImpl;
import com.chainsys.projectvalidation.AirLineValidation;

public class BookedTicketsTest {

	public void bookTicket() throws ClassNotFoundException, SQLException {
		
		BookedTickets bt=new BookedTickets();
		FlightImpl fi=new FlightImpl();
		AirLineValidation alv=new AirLineValidation();
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Mobile Number for Ticket Booking :");
		String mobile=in.next();
		String mobileVal=alv.pmobNoVal(mobile);
		bt.setBookedMobile(mobileVal);
		
		System.out.println("Enter Name for Ticket Booking :");
		String name=in.next();
		String nameVal=alv.pnameVal(name);
		bt.setBookedPassengerName(nameVal);
		
	
		System.out.println("Please Confirm \n 1 for Domestic \n 2 for International \n 3 for exit");
		int x1=in.nextInt();
		
		switch(x1) {
		case 1:
			fi.flightInfoDomestic(bt);
			break;
		case 2:
			fi.flightInfoInternl(bt);
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Please enter valid Option!");
		}
			
		
		
	}

}
