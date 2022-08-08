package com.chainsys.projectimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import com.chainsys.projectdao.CancelledTicketsDao;

public class CancelledTicketsImpl implements CancelledTicketsDao{

	
	public void cancelTicket() throws ClassNotFoundException, SQLException {
		Scanner in = new Scanner(System.in);
		try {
			Connection con = AirLineConnection.getConnection();
			
			System.out.println("Enter Airline ID to Cancel the Ticket:");
			String idtoDelete = in.next();

			System.out.println("Enter Seat Number to Cancel the Ticket :");
			int seattoDelete = in.nextInt();

			String query = "delete bookedTickets where bookedAirLineId=? and seatNo=?";
			PreparedStatement ps = con.prepareStatement(query);
			ps.setString(1, idtoDelete);
			ps.setInt(2, seattoDelete);
			
			int ex = ps.executeUpdate();
			System.out.println("********************Ticket Cancelled Successfully*********************");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
