package com.chainsys.project;

public class BookedTickets {

	String bookedAirLineId;
	String bookedPassengerName;
	String bookedMobile;
	int seatNo;

	public BookedTickets() {

	}

	public String getBookedAirLineId() {
		return bookedAirLineId;
	}

	public void setBookedAirLineId(String bookedAirLineId) {
		this.bookedAirLineId = bookedAirLineId;
	}

	public String getBookedPassengerName() {
		return bookedPassengerName;
	}

	public void setBookedPassengerName(String bookedPassengerName) {
		this.bookedPassengerName = bookedPassengerName;
	}

	public String getBookedMobile() {
		return bookedMobile;
	}

	public void setBookedMobile(String bookedMobile) {
		this.bookedMobile = bookedMobile;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	@Override
	public String toString() {
		return "BookedTickets [bookedAirLineId=" + bookedAirLineId + ", bookedPassengerName=" + bookedPassengerName
				+ ", bookedMobile=" + bookedMobile + ", seatNo=" + seatNo + "]";
	}
}
