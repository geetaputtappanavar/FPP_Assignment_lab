package mum.lesson5.problem4;

public class Driver {
	public static void main(String[] args) {
		Payable[] payables = new Payable[6];
		double totalSal = 0.0;
		payables[0] = new CommissionEmployee("Geeta", "Puttappanavar", "GP001", 23.7, 20);
		payables[1] = new HourlyEmployee("Tigist", "Damesa", "TD002", 67.7, 4);
		payables[2] = new SalariedEmployee("Stanley", "Julian", "SJ009", 800);
		payables[3] = new SalariedEmployee("Mamba", "Manlai", "MM098", 1200);
		payables[4] = new BasePlusCommissionEmployee("Luku", "Man", "LM999", 20.9, 30, 600);
		payables[5] = new Invoice("KTK009", "Flash Drive", 89, 22.34);
		
		for(Payable obj:payables){
			System.out.println(obj);
			if(obj instanceof Employee){
				//System.out.println(obj.getPaymentAmount());
				totalSal+=obj.getPaymentAmount();
			}
		}
		System.out.println("Total salaries of all the employees = "+totalSal);
	}
}

/*Input and Output:

Output:
First Name: Geeta
last Name: Puttappanavar
Social Security Number: GP001
Grosssales: 23.7
Commission Rate: 20.0%

First Name :Tigist
last Name: Damesa
Social Security Number: TD002
Wage: 67.7
Hours: 4.0

First Name: Stanley
last Name: Julian
Social Security Number: SJ009
Weekly Salary: 800.0

First Name: Mamba
last Name: Manlai
Social Security Number: MM098
Weekly Salary: 1200.0

First Name: Luku
last Name: Man
Social Security Number: LM999
Grosssales: 20.9
Commission Rate: 30.0%
Base Salary: 600.0

Part Number: KTK009
Part Description: Flash Drive
Quanity: 89
Price per Item: 22.34

Total salaries of all the employees = 3971.8
*/
