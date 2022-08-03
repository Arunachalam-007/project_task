package bank;

import java.sql.Date;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class BankTest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
		//Creating instance object
		Bank b=new Bank();
		Customer c=new Customer();
		BankImpl bi=new BankImpl();
		BankValidation bv=new BankValidation();
		
		//Getting Bank info from users
		Scanner in=new Scanner(System.in);
		System.out.println("Please enter Bank details:");
		System.out.println("*************************************");
		System.out.println("Enter Branch name");
		String bname=in.nextLine();
		String bnameValidations=bv.bankNameVal(bname);
		b.setBname(bnameValidations);
		
		
		System.out.println("Enter Branch Id");
		String bid=in.next();
		String bidValidations=bv.branchIdVal(bid);
		b.setBid(bidValidations);
		
		System.out.println("Enter Branch location");
		String bcity=in.next();
		String bcityValidations=bv.branchLocVal(bcity);
		b.setBcity(bcityValidations);
		
		
		
		//Getting Customer Details from users
		System.out.println("*************************************");
		System.out.println("Please enter Customer Details");
		System.out.println("Enter Customer Name");
		String cname=in.next();
		String custNameValidations=bv.custNameVal(cname);
		c.setCname(custNameValidations);
		
		System.out.println("Enter Branch Id");
		String branchId=in.next();
		String custBidValidations=bv.customerBranchIdVal(branchId);
		c.setBranchId(custBidValidations);
		
		System.out.println("Enter Customer Id");
		String cid=in.next();
		String custidValidations=bv.customerIdVal(cid);
		c.setCid(custidValidations);
		
		System.out.println("Enter Customer City");
		String ccity=in.next();
		String custCityValidations=bv.custLocVal(ccity);
		c.setCcity(custCityValidations);
		
		System.out.println("Enter Mobile No");
		String mobileNo=in.next();
		String custMobNoValidations=bv.mobileNoVal(mobileNo);
		c.setMobileNo(custMobNoValidations);
		
		System.out.println("Enter DOB");
		String dob=in.next();
		
		LocalDate valueDate = LocalDate.parse(dob);
        Date loc = Date.valueOf(valueDate);
		c.setDob(loc);
		
		
		bi.addBank(b);
		bi.addCustomer(c);
		
		
	
		//Display Option selection using switch case
		System.out.println("Enter option \n 1 for Inner Join \n 2 for Left Join \n 3 for Right Join \n 4 for Bank Info \n 5 for Customer Info \n 6 for Update Customer \n 7 for Delete Customer \n 8 for Read Customer Info \n 9 for Exit");
		int x=in.nextInt();
		switch(x){
			case 1:
				String query6="select bankBnfo.bname,bankBnfo.bid,bankBnfo.bcity,customerInfo.cname,customerInfo.cid,customerInfo.ccity,customerInfo.mobileNo,customerInfo.dob from bankBnfo INNER JOIN customerInfo on bankbnfo.bid=customerinfo.branchid";
				bi.joinImpl(query6);
				break;
			case 2:
				String query7="select bankBnfo.bname,bankBnfo.bid,bankBnfo.bcity,customerInfo.cname,customerInfo.cid,customerInfo.ccity,customerInfo.mobileNo,customerInfo.dob from bankBnfo LEFT JOIN customerInfo on bankbnfo.bid=customerinfo.branchid";
				bi.joinImpl(query7);
				break;
			case 3:
				String query8="select bankBnfo.bname,bankBnfo.bid,bankBnfo.bcity,customerInfo.cname,customerInfo.cid,customerInfo.ccity,customerInfo.mobileNo,customerInfo.dob from bankBnfo RIGHT JOIN customerInfo on bankbnfo.bid=customerinfo.branchid";
				bi.joinImpl(query8);
				break;
			case 4:
				ArrayList<Bank> data = new ArrayList<Bank>(); 
				data = (ArrayList<Bank>) bi.displayInfo();
				for(int i=0; i<data.size(); i++) {
					System.out.println("Name :" + data.get(i).getBname());
					System.out.println("Branch Id :" + data.get(i).getBid());
					System.out.println("Branch City :" + data.get(i).getBcity());
					
				}
				break;
			case 5:
				ArrayList<Customer> data1 = new ArrayList<Customer>(); 
				data1 = (ArrayList<Customer>) bi.customerDisplayInfo();
				for(int i=0; i<data1.size(); i++) {
					System.out.println("Customer Name :" + data1.get(i).getCname());
					System.out.println("Branch Id :" + data1.get(i).getBranchId());
					System.out.println("Customer Id :" + data1.get(i).getCid());
					System.out.println("Customer City :" + data1.get(i).getCcity());
					System.out.println("Customer Mobile No :" + data1.get(i).getMobileNo());
					System.out.println("Customer DOB :" + data1.get(i).getDob());
				}
				break;
			case 6:
				bi.updateInfo(c);
				break;
			case 7:
				bi.deleteInfo(c);
				break;
			case 8:
				bi.readInfo(c);
				break;
			case 9:
				System.exit(0);
			default:
				System.out.println("Enter Valid Option");
		}
	
		
		
	}

	}

