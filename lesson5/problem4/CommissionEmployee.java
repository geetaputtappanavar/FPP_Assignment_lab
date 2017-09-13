package mum.lesson5.problem4;

public class CommissionEmployee extends Employee{
	private double grossSales;
	private double comRateInPer;
	
	public CommissionEmployee(String fName, String lName, String ssn, double grossSales, double comRateInPer) {
		super(fName, lName, ssn);
		this.grossSales = grossSales;
		this.comRateInPer = comRateInPer;
	}
	public double getGrossSales() {
		return grossSales;
	}
	public void setGrossSales(double grossSales) {
		this.grossSales = grossSales;
	}
	public double getComRateInPer() {
		return comRateInPer;
	}
	public void setComRateInPer(double comRateInPer) {
		this.comRateInPer = comRateInPer;
	}

	@Override
	public double getPaymentAmount() {
		return this.grossSales*this.comRateInPer;
	}
	
	//String fName, String lName, String ssn, double grossSales, double comRateInPer
	@Override
	public String toString() {
		return "First Name: "+getfName()+"\n"+"last Name: "+getlName()+"\n"+"Social Security Number: "+getSsn()+"\n"
				+"Grosssales: "+getGrossSales()+"\n"+"Commission Rate: "+getComRateInPer()+"%"+"\n";
	}
}
