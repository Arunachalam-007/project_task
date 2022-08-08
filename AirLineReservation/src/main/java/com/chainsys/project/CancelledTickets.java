package com.chainsys.project;

public class CancelledTickets {

	String cancelledAirLineId;
	String cancelledMobile;
	String cancelledSeat;

	public CancelledTickets() {

	}

	public String getCancelledAirLineId() {
		return cancelledAirLineId;
	}

	public void setCancelledAirLineId(String cancelledAirLineId) {
		this.cancelledAirLineId = cancelledAirLineId;
	}

	public String getCancelledMobile() {
		return cancelledMobile;
	}

	public void setCancelledMobile(String cancelledMobile) {
		this.cancelledMobile = cancelledMobile;
	}

	public String getCancelledSeat() {
		return cancelledSeat;
	}

	public void setCancelledSeat(String cancelledSeat) {
		this.cancelledSeat = cancelledSeat;
	}

	@Override
	public String toString() {
		return "CancelledTickets [cancelledAirLineId=" + cancelledAirLineId + ", cancelledMobile=" + cancelledMobile
				+ ", cancelledSeat=" + cancelledSeat + "]";
	}
}
