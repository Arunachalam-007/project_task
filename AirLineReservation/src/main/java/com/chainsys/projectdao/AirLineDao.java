package com.chainsys.projectdao;

import java.sql.SQLException;

import com.chainsys.project.AirLine;

public interface AirLineDao {

	public void airLineInfo(AirLine al) throws SQLException, ClassNotFoundException;
}
