package com.chainsys.projecttest;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.project.AirLine;
import com.chainsys.project.BookedTickets;
import com.chainsys.projectimpl.FlightImpl;

public class FlightTest {

	public void chooseFlight() throws ClassNotFoundException, SQLException {
		FlightImpl fi=new FlightImpl();
		BookedTickets bt=new BookedTickets();
		AirLineTest alt=new AirLineTest();
		BookedTickets bt1=new BookedTickets();
		AirLine ar=new AirLine();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Option \n 1 for Domestic flights \n 2 for International Flights");
		
		int x=in.nextInt();
		
		if(x==1) {
			System.out.println("You selected Domestic Flights");
			alt.airLineDetailsDomestic(ar);
			fi.confirmTicket();
//			fi.flightInfoDomestic(bt);
		}
		else if(x==2) {
			System.out.println("You selected International Flights");
			alt.airLineDetailsIntl(ar);
			fi.confirmTicket();
//			fi.flightInfoInternl(bt1);
		}
		else {
			System.out.println("Please enter valid option");
		}
	}

}
