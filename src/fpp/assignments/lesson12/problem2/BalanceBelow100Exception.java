package fpp.assignments.lesson12.problem2;

public class BalanceBelow100Exception extends Exception{
	String msg;
	
	public BalanceBelow100Exception(String msg) {
		this.msg = msg;
	}
	
	@Override
	public String getMessage() {
		return msg;
	}
}
