package fpp.assignments.lesson12.problem2;

import java.util.Scanner;

public class Tester {
	public static void main(String[] args) {
		CustomerAccount cust1 = new CustomerAccount("Tomy", 22222, 2008.89);
		System.out.println(cust1+"\n");
		System.out.println("Enter the amount to withdraw:");
		Scanner scanner = new Scanner(System.in);
		double amount = scanner.nextDouble();
		try {
			cust1.Withdraw(amount);
			System.out.println(cust1);
		} catch (BalanceBelow100Exception | BalanceExceedException e) {
			System.out.println(e.getMessage());
			//e.printStackTrace();
		}finally {
			scanner.close();
			System.out.println("\nThank you for banking with us...\nClosing the resources..");
		}
	}
}



/*Input and Output:
	
		Your account details: 
		Customer Name: Tomy
		Account Name: 22222
		Current Balance: 2008.89

		Enter the amount to withdraw:
		1000
		Your account details: 
		Customer Name: Tomy
		Account Name: 22222
		Current Balance: 1008.8900000000001

		Thank you for banking with us...
		Closing the resources..
		
		------------------------------
		
		Your account details: 
		Customer Name: Tomy
		Account Name: 22222
		Current Balance: 2008.89
		
		Enter the amount to withdraw:
		2000
		Your current balance 8.8900000000001 which is less than 100. Please maintain 100$ in your account
		
		Thank you for banking with us...
		Closing the resources..
		--------------------------------------
		
		
		Your account details: 
		Customer Name: Tomy
		Account Name: 22222
		Current Balance: 2008.89
		
		Enter the amount to withdraw:
		30000
		You can not withdraw more than your balance: 2008.89
		
		Thank you for banking with us...
		Closing the resources..	
*/