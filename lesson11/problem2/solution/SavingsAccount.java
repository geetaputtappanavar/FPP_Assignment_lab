package mum.lesson11.problem2.solution;

public final class SavingsAccount extends Account{
	double interestRate;
	
	public SavingsAccount(double balance, double interestRate) {
		this.balance = balance;
		this.interestRate = interestRate;
	}
	
	@Override
	public double getBalance() {
		double newbalance = balance + interestRate * balance;
		return newbalance;
	}
}
