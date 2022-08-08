package com.chainsys.projectdao;

import java.sql.SQLException;

import com.chainsys.project.Passenger;

public interface PassengerDao {

	public void passengerInfo(Passenger p) throws ClassNotFoundException, SQLException;
}
