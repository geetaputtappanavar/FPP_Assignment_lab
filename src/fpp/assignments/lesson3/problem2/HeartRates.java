package fpp.assignments.lesson3.problem2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class HeartRates {
	private String firstName;
	private String lastName;
	private String dob;
	private double[] rangeArr = new double[2];
	private int ageInYears;
	private int MHR;
	
	public HeartRates(String firstName, String lastName, String dob) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
	}
	public HeartRates() {
		
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public double[] getRangeArr() {
		return rangeArr;
	}
	
	public void setRangeArr(double[] rangeArr) {
		this.rangeArr = rangeArr;
	}
	
	public int getAgeInYears() {
		return ageInYears;
	}
	public void setAgeInYears(int ageInYears) {
		this.ageInYears = ageInYears;
	}
	public int getMHR() {
		return MHR;
	}
	public void setMHR(int mHR) {
		MHR = mHR;
	}
	public int calculateAge(String birthDate){
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-M-d");
		LocalDate ld = LocalDate.parse(birthDate, dtf);
		LocalDate today = LocalDate.now();
		int ageInYears = Period.between(ld, today).getYears();
		return ageInYears;
	} 
	
	public int calculateMHR(int ageInYears){
		return 220-ageInYears;
	}
	
	public double[] calculateTHRRange(int MHR){
		int RHR = 70;
		int AHR = MHR-RHR;
		double LB = 0.5;
		double UB = 0.85;
		double LBTHR = (AHR*LB) + RHR;
		double UBTHR = (AHR*UB) + RHR;
		double[] rangeArr = new double[2];
		rangeArr[0] = LBTHR;
		rangeArr[1] = UBTHR;
		return rangeArr;
	}
	
	@Override
	public String toString() {
		return "Name: "+firstName+" "+lastName+"\n"+"Date of Birth: "+dob+"\n"+"Age in Years: "+ageInYears+"\n"+"Maximum heart rate: "+MHR+"\n"+"Target-heart-rate range: "+rangeArr[0]+" - "+rangeArr[1];
	}
}




