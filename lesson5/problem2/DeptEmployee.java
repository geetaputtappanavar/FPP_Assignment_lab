package mum.lesson5.problem2;

import java.time.LocalDate;

public class DeptEmployee {
	private String name;
	private LocalDate hireDate;
	double salary;
	public DeptEmployee(double salary, String name,LocalDate hireDate) {
		this.salary = salary;
		this.name = name;
		this.hireDate = hireDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}	
	
	public double computeSalary(){
		return this.salary;
	}
}
