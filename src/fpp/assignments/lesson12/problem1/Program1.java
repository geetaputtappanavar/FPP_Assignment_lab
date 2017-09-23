package fpp.assignments.lesson12.problem1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Program1 obj = new Program1();
		Scanner scanner = null;
		//while(true) {
			System.out.println("Enter the input: ");
			scanner = new Scanner(System.in);
			try {
				int mark = scanner.nextInt();
				//double mark = Double.valueOf(input);
				obj.checkMark(mark);
			} catch (NegativeNumberException | GreaterNumberException | InputMismatchException e) {
				System.err.println(e.getMessage());
				//e.printStackTrace();
			}finally {
				System.out.println("\nEnd: Closing the resources...");
				scanner.close();
			}
		//}
	}
	
	public void checkMark(double mark) throws NegativeNumberException, GreaterNumberException {
		if(mark<0) {
			throw new NegativeNumberException();
		}
		if(mark>100) {
			throw new GreaterNumberException();
		}
		else {
			System.out.println("You entered: "+mark);
		}
	}
}


/*Input and Output:
	
	Enter the input: 
	11
	You entered: 11.0
	End: Closing the resources...
	---------------------------
	
	
	Enter the input: 
	1111
	Mark is greater than 100
	
	End: Closing the resources...
	-------------------------
	
	
	Enter the input: 
	-1
	Mark is less than 0
	
	End: Closing the resources...
	*/