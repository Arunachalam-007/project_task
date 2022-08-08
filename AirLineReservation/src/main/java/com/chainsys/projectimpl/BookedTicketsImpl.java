package com.chainsys.projectimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.project.BookedTickets;
import com.chainsys.projectdao.BookedTicketDao;

public class BookedTicketsImpl implements BookedTicketDao {

	public void bookingTicket(BookedTickets bt) throws SQLException, ClassNotFoundException {
		Connection con = AirLineConnection.getConnection();

		String query = "insert into bookedTickets(bookedAirLineId,bookedPassengerName,bookedMobile,seatNo) values (?,?,?,?)";

		PreparedStatement ps = con.prepareStatement(query);

		ps.setString(2, bt.getBookedPassengerName());
		ps.setString(3, bt.getBookedMobile());

		

		int ex = ps.executeUpdate();
	}


}
