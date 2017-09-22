package mum.lesson11.problem2.solution;

public final class CheckingAccount extends Account{
	public CheckingAccount(double balance) {
		this.balance = balance;
	}
	
	@Override
	public double getBalance() {
		return balance;
	}
}
