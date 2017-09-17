package mum.lesson5.problem4;

public class HourlyEmployee extends Employee{
	private double wage;
	private double hours;
	
	public HourlyEmployee(String fName, String lName, String ssn, double wage, double hours) {
		super(fName, lName, ssn);
		this.wage = wage;
		this.hours = hours;
	}
	public double getWage() {
		return wage;
	}
	public void setWage(double wage) {
		this.wage = wage;
	}
	public double getHours() {
		return hours;
	}
	public void setHours(double hours) {
		this.hours = hours;
	}

	@Override
	public double getPaymentAmount() {
		return this.wage*this.hours;
	}
	
	public String toString() {
		return "First Name :"+getfName()+"\n"+"last Name: "+getlName()+"\n"+"Social Security Number: "+getSsn()+"\n"
				+"Wage: "+getWage()+"\n"+"Hours: "+getHours()+"\n";
	}
}
