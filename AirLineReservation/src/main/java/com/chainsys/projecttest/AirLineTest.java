package com.chainsys.projecttest;

import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.project.AirLine;
import com.chainsys.projectimpl.AirLineImpl;

public class AirLineTest {

	public void airLineDetailsDomestic(AirLine ar) throws ClassNotFoundException, SQLException {

//		AirLine ar=new AirLine();
		AirLineImpl ali=new AirLineImpl();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Option \n 1 for I1 \n Indigo Airline \n 2 for AI2 \n AirIndia \n 3 for V3 \n Vistara \n 4 for S4 \n SpiceJet  \n 5 for exit");
		int x=in.nextInt();
		switch(x){
			case 1:
				ar.setAirLineId("I1");
				ar.setAirLineName("Indigo");
				break;
			case 2:
				ar.setAirLineId("AI2");
				ar.setAirLineName("AirIndia");
				break;
			case 3:
				ar.setAirLineId("V3");
				ar.setAirLineName("Vistara");
				break;
			case 4:
				ar.setAirLineId("S4");
				ar.setAirLineName("SpiceJet");
				break;
			
			case 5:
				System.exit(0);
			default:
				System.out.println("Please enter valid Option!");
		}
		
		ali.airLineInfo(ar);
		
		
		
	}
	public void airLineDetailsIntl(AirLine ar) throws ClassNotFoundException, SQLException {
//		AirLine ar=new AirLine();
		AirLineImpl ali=new AirLineImpl();
		Scanner in=new Scanner(System.in);
		System.out.println("Enter Option \n 1 for EA5 \n Emirates Airlines \n 2 for MA6 \n Malaysia Airlines \n 3 for BA7 \n British Airways \n 4 for exit");
		int x=in.nextInt();
		switch(x){
		case 1:
			ar.setAirLineId("EA5");
			ar.setAirLineName("Emirates Airlines");
			break;
		case 2:
			ar.setAirLineId("MA6");
			ar.setAirLineName("Malaysia Airlines");
			break;
		case 3:
			ar.setAirLineId("BA7");
			ar.setAirLineName("British Airways");
			break;
		case 4:
			System.exit(0);
		default:
			System.out.println("Please enter valid Option!");
		}
		ali.airLineInfo(ar);
		
	}

}
