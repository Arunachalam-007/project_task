package com.chainsys.projecttest;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.project.Passenger;
import com.chainsys.projectimpl.CancelledTicketsImpl;
import com.chainsys.projectimpl.PassengerImpl;
import com.chainsys.projectvalidation.AirLineValidation;

public class PassengerTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Passenger p=new Passenger();
		FlightTest ft=new FlightTest();
		CancelledTicketsImpl cti=new CancelledTicketsImpl();
		AirLineValidation alv=new AirLineValidation();
		
		Scanner in=new Scanner(System.in);
		
		System.out.println("Enter Passenger Name :");
		String pName=in.next();
		String pNameValidation=alv.pnameVal(pName);
		p.setPassengerName(pNameValidation);
								
		System.out.println("Enter Passenger Address :");
		String pAddress=in.next();
		String pAddressValidation=alv.paddrVal(pAddress);
		p.setPassengerAddress(pAddressValidation);
		
		System.out.println("Enter Passenger Mobile :");
		String pMobile=in.next();
		String pMobileValidation=alv.pmobNoVal(pMobile);
		p.setPassengerMobile(pMobileValidation);
		
		System.out.println("Enter Passenger User Name :");
		String pUserName=in.next();
		String pUserNameVal=alv.puserNameVal(pUserName);
		p.setUserName(pUserNameVal);
		
		System.out.println("Enter Passenger Password :");
		String pPassword=in.next();
		String pPasswordVal=alv.ppasswordValidation(pPassword);
		p.setUserPassword(pPasswordVal);
			
		
		PassengerImpl pi=new PassengerImpl();
		pi.passengerInfo(p);
		
		System.out.println("Enter option \n 1 for Book Ticket \n 2 for Cancel Ticket \n 3 for exit");
		int x1=in.nextInt();
		switch(x1) {
		case 1:
			ft.chooseFlight();
			break;
		case 2:
			cti.cancelTicket();
			break;
		case 3:
			System.exit(0);
		default:
			System.out.println("Please enter valid Option!");
		
		}
		
	}

}
