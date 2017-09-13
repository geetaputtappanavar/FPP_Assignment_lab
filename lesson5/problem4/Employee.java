package mum.lesson5.problem4;

public abstract class Employee implements Payable{
	private String fName;
	private String lName;
	private String ssn;
	
	public Employee(String fName, String lName, String ssn) {
		this.fName = fName;
		this.lName = lName;
		this.ssn = ssn;
	}
	
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
