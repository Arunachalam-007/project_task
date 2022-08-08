package com.chainsys.project;

public class Passenger {

	String passengerName;
	String passengerAddress;
	String passengerMobile;
	String userName;
	String userPassword;
	
	public Passenger() {
		
	}
	
	public String getPassengerName() {
		return passengerName;
	}

	public void setPassengerName(String passengerName) {
		this.passengerName = passengerName;
	}

	public String getPassengerAddress() {
		return passengerAddress;
	}

	public void setPassengerAddress(String passengerAddress) {
		this.passengerAddress = passengerAddress;
	}

	public String getPassengerMobile() {
		return passengerMobile;
	}

	public void setPassengerMobile(String passengerMobile) {
		this.passengerMobile = passengerMobile;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	
	@Override
	public String toString() {
		return "Passenger [passengerName=" + passengerName + ", passengerAddress=" + passengerAddress
				+ ", passengerMobile=" + passengerMobile + ", userName=" + userName + ", userPassword=" + userPassword
				+ "]";
	}

}
