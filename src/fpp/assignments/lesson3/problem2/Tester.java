package fpp.assignments.lesson3.problem2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Tester tester = new Tester();
		HeartRates hr = new HeartRates();
		String[] detArr = tester.getAgeFromConsole();
		if(detArr!=null){
			hr.setFirstName(detArr[0]);
			hr.setLastName(detArr[1]);
			hr.setDob(detArr[2]);
			int ageInYears = 0;
			if(detArr[2] != null){
				ageInYears = hr.calculateAge(detArr[2]);
			}
			hr.setAgeInYears(ageInYears);
			int MHR = hr.calculateMHR(ageInYears);
			hr.setMHR(MHR);
			double[] rangeArr = hr.calculateTHRRange(MHR);
			hr.setRangeArr(rangeArr);
			System.out.println("\nYour Details are: ");
			System.out.println(hr.toString());
			System.out.println("Thank you.. Have a good day..");
		}
		
	}
	
	public String[] getAgeFromConsole(){
		DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-M-d");
		String[] detArr = new String[3];
		Scanner scanner = new Scanner(System.in);
		LocalDate birthDay = null;
		System.out.println("Please enter your first name: ");
		String fName = scanner.nextLine();
		System.out.println("Please enter your last name: ");
		String lName = scanner.nextLine();
		System.out.println("Please enter your DOB in yyyy-MM-dd format");
		String input = scanner.nextLine();	
		try{
			birthDay = LocalDate.parse(input, df);
			detArr[0] = fName;
			detArr[1] = lName;
			detArr[2] = birthDay.toString();
		}catch(DateTimeParseException e){
			System.out.println("Please rerun the application and Enter the valid date of birth");
			detArr =null;
		}

		return detArr;
	}
}


/*Input and Output

Please enter your first name: 
Jerry
Please enter your last name: 
Tom
Please enter your DOB in yyyy-MM-dd format
1976-08-08

Your Details are: 
Name: Jerry Tom
Date of Birth: 1976-08-08
Age in Years: 41
Maximum heart rate: 179
Target-heart-rate range: 124.5 - 162.64999999999998
Thank you.. Have a good day..
*/