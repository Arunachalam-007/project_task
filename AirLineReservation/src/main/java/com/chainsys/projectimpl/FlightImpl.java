package com.chainsys.projectimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Scanner;

import com.chainsys.project.AirLine;
import com.chainsys.project.BookedTickets;
import com.chainsys.project.Flight;
import com.chainsys.projectdao.FlightDao;
import com.chainsys.projecttest.BookedTicketsTest;

public class FlightImpl implements FlightDao {
	int price;
	String flightNumber, departureDate, departureAirport, destinationAirport;
	Date dateValue;

	Flight f = new Flight();

	public void confirmTicket() throws ClassNotFoundException, SQLException {
		Scanner in = new Scanner(System.in);
		BookedTicketsTest btt = new BookedTicketsTest();
		System.out.println("Do u want to Book your tickets : \n 1 for Yes \n 2 for No");
		int n1 = in.nextInt();
		switch (n1) {
		case 1:
			btt.bookTicket();
			break;
		case 2:
			System.exit(0);
		default:
			System.out.println("Please enter valid Option!");
		}
	}

	public void flightInfoDomestic(BookedTickets bt) throws SQLException, ClassNotFoundException {

		Scanner in = new Scanner(System.in);
		System.out.println("Please confirm for Your Flight :");
		System.out.println("Enter option \n 1 for I1 \n 2 for AI2 \n 3 for V3 \n 4 for S4");

		int x = in.nextInt();
		if (x == 1) {
			System.out.println("Indigo");

			flightNumber = "I1";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Chennai")) && (destinationAirport.equals("Mumbai"))) {
				price = 2000;

			} else if ((departureAirport.equals("Madurai")) && (departureAirport.equals("Trichy"))) {
				price = 1500;
			} else if ((departureAirport.equals("Hyderabad")) && (destinationAirport.equals("Chennai"))) {
				price = 5000;
			} else {
				System.out.println("Please enter valid Location");
			}

		} else if (x == 2) {
			System.out.println("Air India");

			flightNumber = "AI2";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Delhi")) && (destinationAirport.equals("Bengaluru"))) {
				price = 3000;

			} else if ((departureAirport.equals("Bengaluru")) && (departureAirport.equals("Chennai"))) {
				price = 2500;

			} else if ((departureAirport.equals("Mumbai")) && (destinationAirport.equals("Hyderabad"))) {
				price = 6000;
			} else {
				System.out.println("Please enter valid Location");
			}

		} else if (x == 3) {
			System.out.println("Vistara");

			flightNumber = "V3";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Madurai")) && (destinationAirport.equals("Bengaluru"))) {
				price = 2000;

			} else if ((departureAirport.equals("Bengaluru")) && (departureAirport.equals("Kolkata"))) {
				price = 3500;
			} else if ((departureAirport.equals("Chennai")) && (destinationAirport.equals("Delhi"))) {
				price = 5000;
			} else {
				System.out.println("Please enter valid Location");
			}

		} else if (x == 4) {
			System.out.println("SpiceJet");

			flightNumber = "S4";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Madurai")) && (destinationAirport.equals("Bengaluru"))) {
				price = 3000;

			} else if ((departureAirport.equals("Delhi")) && (departureAirport.equals("Kolkata"))) {
				price = 2500;
			} else if ((departureAirport.equals("Chennai")) && (destinationAirport.equals("Madurai"))) {
				price = 2000;
			} else {
				System.out.println("Please enter valid Location");
			}

		} else {
			System.out.println("Please select valid option");
		}

		f.setFlightNumber(flightNumber);
		f.setDepartureDate(dateValue);
		f.setDepartureAirport(departureAirport);
		f.setDestinationAirport(destinationAirport);
		f.setPrice(price);

		Connection con = AirLineConnection.getConnection();

		String query = "insert into Flight(flightNumber,departureDate,departureAirport,destinationAirport,price) values(?,?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(1, f.getFlightNumber());
		ps.setDate(2, f.getDepartureDate());
		ps.setString(3, f.getDepartureAirport());
		ps.setString(4, f.getDestinationAirport());
		ps.setInt(5, f.getPrice());

		int ex = ps.executeUpdate();

		// *******************************************************************

		Connection con1 = AirLineConnection.getConnection();

		String query1 = "insert into bookedTickets(bookedAirLineId,bookedPassengerName,bookedMobile,seatNo) values (?,?,?,seat_val.nextval)";

		PreparedStatement ps1 = con1.prepareStatement(query1);

		ps1.setString(1, f.getFlightNumber());
		ps1.setString(2, bt.getBookedPassengerName());
		ps1.setString(3, bt.getBookedMobile());

		int ex1 = ps1.executeUpdate();
		System.out.println("*************Ticket Booked Successfully*********");

	}

	public void flightInfoInternl(BookedTickets bt1) throws SQLException, ClassNotFoundException {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter option \n 1 for EA5 \n 2 for MA6 \n 3 for BA7");

		int x = in.nextInt();

		if (x == 1) {
			System.out.println("Emirates Airlines");

			flightNumber = "EA5";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Delhi")) && (destinationAirport.equals("Dubai"))) {
				price = 20000;

			} else if ((departureAirport.equals("Singapore")) && (departureAirport.equals("Trichy"))) {
				price = 25000;
			} else if ((departureAirport.equals("Chennai")) && (destinationAirport.equals("USA"))) {
				price = 30000;
			} else {
				System.out.println("Please enter valid Location");
			}
		} else if (x == 2) {
			System.out.println("Malaysia Airlines");

			flightNumber = "MA6";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Chennai")) && (destinationAirport.equals("Dubai"))) {
				price = 27800;

			} else if ((departureAirport.equals("Trichy")) && (departureAirport.equals("UK"))) {
				price = 30550;
			} else if ((departureAirport.equals("USA")) && (destinationAirport.equals("Dubai"))) {
				price = 21300;
			} else {
				System.out.println("Please enter valid Location");
			}

		} else if (x == 3) {
			System.out.println("British Airways");
			flightNumber = "BA7";
			System.out.println("Enter Journey start Date yyyy-MM-dd :");
			departureDate = in.next();

			LocalDate locDate = LocalDate.parse(departureDate);
			dateValue = Date.valueOf(locDate);

			System.out.println("Enter departure Airport :");
			departureAirport = in.next();

			System.out.println("Enter Destination Airport");
			destinationAirport = in.next();

			if ((departureAirport.equals("Chennai")) && (destinationAirport.equals("UK"))) {
				price = 24300;

			} else if ((departureAirport.equals("Trichy")) && (departureAirport.equals("Austrialia"))) {
				price = 25200;
			} else if ((departureAirport.equals("Delhi")) && (destinationAirport.equals("England"))) {
				price = 34600;
			} else {
				System.out.println("Please enter valid Location");
			}

		} else {
			System.out.println("Please select valid option");
		}

		f.setFlightNumber(flightNumber);
		f.setDepartureDate(dateValue);
		f.setDepartureAirport(departureAirport);
		f.setDestinationAirport(destinationAirport);
		f.setPrice(price);

		try {
			Connection con = AirLineConnection.getConnection();

			String query = "insert into Flight(flightNumber,departureDate,departureAirport,destinationAirport,price) values(?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, f.getFlightNumber());
			ps.setDate(2, f.getDepartureDate());
			ps.setString(3, f.getDepartureAirport());
			ps.setString(4, f.getDestinationAirport());
			ps.setInt(5, f.getPrice());

			int ex = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// ************************************************************************

		try {
			Connection con1 = AirLineConnection.getConnection();

			String query1 = "insert into bookedTickets(bookedAirLineId,bookedPassengerName,bookedMobile,seatNo) values (?,?,?,seat_val.nextval)";

			PreparedStatement ps1 = con1.prepareStatement(query1);

			ps1.setString(1, f.getFlightNumber());
			ps1.setString(2, bt1.getBookedPassengerName());
			ps1.setString(3, bt1.getBookedMobile());

			int ex1 = ps1.executeUpdate();
			System.out.println("*************Ticket Booked Successfully*********");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
