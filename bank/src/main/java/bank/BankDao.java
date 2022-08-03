package bank;

import java.sql.SQLException;

public interface BankDao {

	//Declaring Methods for implementation
	public void addBank(Bank b2) throws ClassNotFoundException, SQLException;
	public void addCustomer(Customer c) throws ClassNotFoundException, SQLException;
	
}
