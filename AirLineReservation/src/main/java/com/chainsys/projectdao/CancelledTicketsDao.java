package com.chainsys.projectdao;

import java.sql.SQLException;

public interface CancelledTicketsDao {

	public void cancelTicket() throws ClassNotFoundException, SQLException;
}
