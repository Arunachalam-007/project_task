package com.chainsys.project;

public class AirLine {
	String airLineId;
	String airLineName;

	public AirLine() {

	}

	public String getAirLineId() {
		return airLineId;
	}

	public void setAirLineId(String airLineId) {
		this.airLineId = airLineId;
	}

	public String getAirLineName() {
		return airLineName;
	}

	public void setAirLineName(String airLineName) {
		this.airLineName = airLineName;
	}

	@Override
	public String toString() {
		return "AirLine [airLineId=" + airLineId + ", airLineName=" + airLineName + "]";
	}
}
