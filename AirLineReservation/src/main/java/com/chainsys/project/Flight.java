package com.chainsys.project;

import java.sql.Date;

public class Flight {

	String flightNumber;
	Date departureDate;
	String departureAirport;
	String destinationAirport;
	int price;

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Flight() {

	}

	public String getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(String flightNumber) {
		this.flightNumber = flightNumber;
	}

	public Date getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(Date departureDate) {
		this.departureDate = departureDate;
	}

	public String getDepartureAirport() {
		return departureAirport;
	}

	

	public void setDepartureAirport(String departureAirport) {
		this.departureAirport = departureAirport;
	}

	public String getDestinationAirport() {
		return destinationAirport;
	}

	public void setDestinationAirport(String destinationAirport) {
		this.destinationAirport = destinationAirport;
	}
	@Override
	public String toString() {
		return "Flight [flightNumber=" + flightNumber + ", departureDate=" + departureDate + ", departureAirport="
				+ departureAirport + ", destinationAirport=" + destinationAirport + ", price=" + price + "]";
	}

}
