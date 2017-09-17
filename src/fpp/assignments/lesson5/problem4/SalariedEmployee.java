package mum.lesson5.problem4;

public class SalariedEmployee extends Employee{
	private double weeklySal;
	public SalariedEmployee(String fName, String lName, String ssn, double weeklySal) {
		super(fName, lName, ssn);
		this.weeklySal = weeklySal;
	}
	public double getWeeklySal() {
		return weeklySal;
	}
	public void setWeeklySal(double weeklySal) {
		this.weeklySal = weeklySal;
	}

	@Override
	public double getPaymentAmount() {
		return this.weeklySal;
	}
	
	public String toString() {
		return "First Name: "+getfName()+"\n"+"last Name: "+getlName()+"\n"+"Social Security Number: "+getSsn()+"\n"
				+"Weekly Salary: "+getWeeklySal()+"\n";
	}
}
