package com.chainsys.projectimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.project.AirLine;
import com.chainsys.projectdao.AirLineDao;

public class AirLineImpl implements AirLineDao {

	public void airLineInfo(AirLine al) throws SQLException, ClassNotFoundException {

		try {
			Connection con = AirLineConnection.getConnection();

			String query = "insert into AirLine(airLineId,airLineName) values(?,?)";

			PreparedStatement ps = con.prepareStatement(query);

			ps.setString(1, al.getAirLineId());
			ps.setString(2, al.getAirLineName());

			int ex = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
