package com.chainsys.projectdao;

import java.sql.SQLException;

import com.chainsys.project.BookedTickets;
import com.chainsys.project.Flight;

public interface FlightDao {

	public void flightInfoDomestic(BookedTickets bt) throws SQLException, ClassNotFoundException;
	public void flightInfoInternl(BookedTickets bt1) throws SQLException, ClassNotFoundException;
}
