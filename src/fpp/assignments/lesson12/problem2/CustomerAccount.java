package fpp.assignments.lesson12.problem2;

public class CustomerAccount {
	String custName; 
	int accNo; 
	double balance;
	
	public CustomerAccount(String custName, int accNo, double balance) {
		this.custName = custName;
		this.accNo = accNo;
		this.balance = balance;
	}
	
	public void deposit(double balance) {
		this.balance+=balance;
	}

	public void Withdraw(double amount) throws BalanceBelow100Exception, BalanceExceedException {
		if(amount>balance) {
			throw new BalanceExceedException("You can not withdraw more than your balance: "+balance);
		}
		balance-=amount;
		if(balance<100) {
			throw new BalanceBelow100Exception("Your current balance "+balance+" which is less than 100. Please maintain 100$ in your account");
		}
	}
	
	@Override
	public String toString() {
		return "Your account details: \nCustomer Name: "+custName+"\nAccount Name: "+accNo+"\nCurrent Balance: "+balance;
	}
}