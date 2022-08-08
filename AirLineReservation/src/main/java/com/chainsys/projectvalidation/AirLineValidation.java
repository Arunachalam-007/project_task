package com.chainsys.projectvalidation;

public class AirLineValidation {

	public String pnameVal(String pname) {
		String expression = "^[a-zA-Z\\s]+";

		if ((pname.trim().length() > 2) && (pname.matches(expression))) {
			System.out.println("Passenger Name is valid");
			return pname;
		} else {
			System.out.println("Invalid Passenger name");
			System.exit(1);

		}
		return "plz enter valid Pasenger name";
	}

	public String paddrVal(String paddr) {
		String expression = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

		if ((paddr.trim().length() > 2) && (paddr.matches(expression))) {
			System.out.println("Passenger Address is valid");
			return paddr;
		} else {
			System.out.println("Invalid Passenger Address");
			System.exit(1);

		}
		return "plz enter valid Pasenger Address";
	}

	public String pmobNoVal(String pmobileNo) {
		String expression = "(0/91)?[7-9][0-9]{9}";

		if ((pmobileNo.trim().length() > 3) && (pmobileNo.matches(expression))) {
			System.out.println("Passenger Mobile Number is valid");
			return pmobileNo;
		} else {
			System.out.println("Invalid Mobile No");
			System.exit(1);

		}
		return "plz enter valid Mobile No";
	}

	public String puserNameVal(String pusernName) {
		String expression = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";

		if ((pusernName.trim().length() > 3) && (pusernName.matches(expression))) {
			System.out.println("User Name is valid");
			return pusernName;
		} else {
			System.out.println("Invalid User name");
			System.exit(1);

		}
		return "plz enter valid User name";
	}

	public String ppasswordValidation(String ppassword) {
		String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}";
		if ((ppassword.trim().length() >= 8) && (!ppassword.isEmpty()) && (ppassword.matches(pattern))) {
			System.out.println("password is valid");
			return ppassword;
		} else {
			System.out.println("Invalid Password");
			System.exit(1);

		}
		return "plz enter valid password";
	}
}
