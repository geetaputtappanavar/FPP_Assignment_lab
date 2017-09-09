package fpp.assignments.lesson3.problem3;

public class MyDate {
	private int day;
	private int intMonth;
	private int year;
	private String strMonth;
	private int dayNum;
	
	// 3 integers
	public MyDate(int month, int day, int year) {
		this.intMonth = month;
		this.day = day;
		this.year = year;
	}
	//string month, int day and year
	public MyDate(String strMonth, int day, int year) {
		this.strMonth = strMonth;
		this.day = day;
		this.year = year;
	}
	
	//2 ints
	public MyDate(int dayNum, int year) {
		this.dayNum = dayNum;
		this.year = year;
	}
}
