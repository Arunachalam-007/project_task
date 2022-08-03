package bank;

public class Bank {
	//Data Members
	private String bname;
	private String bid;
	private String bcity;
	@Override
	public String toString() {
		return "Bank [bname=" + bname + ", bid=" + bid + ", bcity=" + bcity + "]";
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getBid() {
		return bid;
	}
	public void setBid(String bid) {
		this.bid = bid;
	}
	public String getBcity() {
		return bcity;
	}
	public void setBcity(String bcity) {
		this.bcity = bcity;
	}
}
	
	