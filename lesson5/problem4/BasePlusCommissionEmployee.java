package mum.lesson5.problem4;

public class BasePlusCommissionEmployee extends CommissionEmployee{
	private double baseSal;
	public BasePlusCommissionEmployee(String fName, String lName, String ssn, double grossSales, double comRateInPer, double baseSal) {
		super(fName, lName, ssn, grossSales, comRateInPer);
		this.baseSal = baseSal;
	}
	public double getBaseSal() {
		return baseSal;
	}
	public void setBaseSal(double baseSal) {
		this.baseSal = baseSal;
	}

	@Override
	public double getPaymentAmount() {	
		return this.baseSal+getGrossSales()*getComRateInPer();
	}
	//String fName, String lName, String ssn, double grossSales, double comRateInPer, double baseSal
	@Override
	public String toString() {
		return "First Name: "+getfName()+"\n"+"last Name: "+getlName()+"\n"+"Social Security Number: "+getSsn()+"\n"
				+"Grosssales: "+getGrossSales()+"\n"+"Commission Rate: "+getComRateInPer()+"%"+"\n"+"Base Salary: "+getBaseSal()+"\n";
	}
}
