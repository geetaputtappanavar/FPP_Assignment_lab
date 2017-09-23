package fpp.assignments.lesson12.problem1;

public class GreaterNumberException extends Exception{
	@Override
	public String getMessage() {
		return "Mark is greater than 100";
	}
}
