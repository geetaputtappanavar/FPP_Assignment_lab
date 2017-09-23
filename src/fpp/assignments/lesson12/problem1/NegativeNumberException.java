package fpp.assignments.lesson12.problem1;

public class NegativeNumberException extends Exception{
	@Override
	public String getMessage() {
		return "Mark is less than 0";
	}
}
