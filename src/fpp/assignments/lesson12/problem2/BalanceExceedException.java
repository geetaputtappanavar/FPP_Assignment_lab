package fpp.assignments.lesson12.problem2;

public class BalanceExceedException extends Exception{
	String msg;
	
	public BalanceExceedException(String msg) {
		this.msg = msg;
	}
	@Override
	public String getMessage() {
		return msg;
	}
}
