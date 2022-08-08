package com.chainsys.projectdao;

import java.sql.SQLException;

import com.chainsys.project.BookedTickets;

public interface BookedTicketDao {

	public void bookingTicket(BookedTickets bt) throws SQLException, ClassNotFoundException;
}
