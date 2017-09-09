package fpp.assignments.lesson3.problem3;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		String continueFlag = "Y";
		try {
		while(true) {
		System.out.println("Enter 1 for format: MM/DD/YYYY");	
		System.out.println("Enter 2 for format: Month DD, YYYY");
		System.out.println("Enter 3 for format: DDD YYYY");
		System.out.println("Enter 4 to Exit");
		System.out.println("Choose your Choice :");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		int day = 0;
		int year = 0;
		DateTimeFormatter dtf1 = null;
		DateTimeFormatter dtf = null;
		LocalDate dateFormat2 = null;
		String inDate = null;
		System.out.println("Choice: "+choice);
		
		switch (choice) {
		case 1:
			System.out.println("Enter Month:");
			int month = scanner.nextInt();
			System.out.println("Enter Day:");
			day = scanner.nextInt();
			System.out.println("Enter Year:");
			year = scanner.nextInt();
			inDate = Integer.toString(month)+"/"+Integer.toString(day)+"/"+Integer.toString(year);
			dtf1 = DateTimeFormatter.ofPattern("M/d/yyyy");
			dateFormat2 = LocalDate.parse(inDate, dtf1);
			System.out.println("MM/dd/yyyy: "+inDate);
			dtf1 = DateTimeFormatter.ofPattern("M/d/yyyy");
			dtf = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
			dateFormat2 = LocalDate.parse(inDate, dtf1);
			String monthDayYear = dtf.format(dateFormat2);
			System.out.println("MMMM dd,yyyy: "+monthDayYear);
			System.out.println("DDD yyyy: "+dateFormat2.getDayOfYear()+" "+Integer.toString(year));
			System.out.println("Do you want to Continue :Y/N");
			continueFlag = scanner.next();
			break;
		
		case 2:
			System.out.println("Enter Month in text(ex: January): ");
			String strMonth = scanner.next();
			System.out.println("Enter day: ");
			day = scanner.nextInt();
			System.out.println("Enter year: ");
			year = scanner.nextInt();
			dtf1 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
			inDate = strMonth+" "+day+","+year;
			dateFormat2 = LocalDate.parse(inDate, dtf1);
			dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
			System.out.println("MM/dd/yyyy: "+dtf.format(dateFormat2));
			System.out.println("MMMM dd,yyyy: "+inDate);
			System.out.println("DDD yyyy: "+dateFormat2.getDayOfYear()+" "+strMonth);
			System.out.println("Do you want to Continue :Y/N");
			continueFlag = scanner.next();
			break;
		case 3: 
			System.out.println("Enter Day of Year: ");
			int dayOfYear = scanner.nextInt();
			System.out.println("Enter Year: ");
			year = scanner.nextInt();
			inDate = dayOfYear+" "+year;
			dtf1 = DateTimeFormatter.ofPattern("DD yyyy");
			dateFormat2 = LocalDate.parse(inDate, dtf1);
			dtf = DateTimeFormatter.ofPattern("M/d/yyyy");
			System.out.println("MM/dd/yyyy: "+dtf.format(dateFormat2));
			DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MMMM dd,yyyy");
			System.out.println("MMMM dd,yyyy: "+dtf3.format(dateFormat2));
			System.out.println("DDD yyyy: "+inDate);
			System.out.println("Do you want to Continue :Y/N");
			continueFlag = scanner.next();
			break;
		case 4:
			System.out.println("Terminated");
			continueFlag = "n";
			break;
		default:
			System.out.println("Invali Entry");
			break;
		}
		
		if(continueFlag.equalsIgnoreCase("N")) {
			break;
		}
	}}catch (DateTimeParseException e) {
		System.out.println("Rerun the application and Enter a valid date");
	}
	}
}


/*###########Input and Output################

Enter 1 for format: MM/DD/YYYY
Enter 2 for format: Month DD, YYYY
Enter 3 for format: DDD YYYY
Enter 4 to Exit
Choose your Choice :
1
Choice: 1
Enter Month:
12
Enter Day:
12
Enter Year:
2009
MM/dd/yyyy: 12/12/2009
MMMM dd,yyyy: December 12,2009
DDD yyyy: 346 2009
Do you want to Continue :Y/N
*/