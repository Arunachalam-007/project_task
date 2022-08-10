package com.chainsys.projectimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.project.Passenger;
import com.chainsys.projectdao.PassengerDao;

public class PassengerImpl implements PassengerDao {

	public void passengerInfo(Passenger p1) throws ClassNotFoundException, SQLException {

		try {

			Connection con = AirLineConnection.getConnection();

			String query = "insert into Passenger(passengerName,passengerAddress,passengerMobile,userName,userPassword) values (?,?,?,?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, p1.getPassengerName());
			ps.setString(2, p1.getPassengerAddress());
			ps.setString(3, p1.getPassengerMobile());
			ps.setString(4, p1.getUserName());
			ps.setString(5, p1.getUserPassword());

			int ex = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
