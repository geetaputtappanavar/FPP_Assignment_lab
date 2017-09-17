package mum.lesson5.problem2;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		DeptEmployee[] department = new DeptEmployee[5];
		department[0] = new Professor(50000, "Tom", LocalDate.of(2012, 8, 28), 5);
		department[1] = new Professor(60000, "Ramu", LocalDate.of(2010, 10, 19), 7);
		department[2] = new Professor(75000, "Krishna", LocalDate.of(1976, 5, 6), 12);
		department[3] = new Secretary(42000, "John", LocalDate.of(2014, 8, 29), 7);
		department[4] = new Secretary(38000, "Teena", LocalDate.of(2009, 5, 2), 12);
		
		double secSalSum = 0.0;
		double proSalSum = 0;
		
		for(DeptEmployee emp:department){
			if(emp.getClass().getSimpleName().equals("Professor")){
				proSalSum+=emp.computeSalary();
			}else if(emp.getClass().getSimpleName().equals("Secretary")){
				secSalSum+=emp.computeSalary();
			}
		}	
		
		System.out.println("Sum of all Professor salary = "+proSalSum);
		System.out.println("Sum of all Secretary salary = "+secSalSum);
		System.out.println("All salaries in the department = "+(secSalSum + proSalSum));
	}
}


/*Input and Output
Output:
	Sum of all Professor salary = 185000.0
	Sum of all Secretary salary = 9000000.0
	All salaries in the department = 9185000.0*/

	