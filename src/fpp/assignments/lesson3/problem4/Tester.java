package fpp.assignments.lesson3.problem4;

import java.util.Scanner;

public class Tester {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		while(true){
			System.out.println("Enter C for Circle");
			System.out.println("Enter R for Rectangle");
			System.out.println("Enter T for Triangle");
			String option = scanner.nextLine();
			String continueFlag = "y";
		
			switch (option.toUpperCase()) {
			case "C":
				System.out.println("Enter the radius of circle");
				double radius = Double.parseDouble(scanner.nextLine());
				Circle c = new Circle(radius);
				System.out.println("Area of the circle is: "+c.computeArea());
				System.out.println("Do you want to continue: Y/N");
				continueFlag = scanner.nextLine();
				break;
			case "R":
				System.out.println("Enter the width of the Rectangle ");
				double rWidth = Double.parseDouble(scanner.nextLine());
				System.out.println("Enter the height of the Rectangle");
				double rHeight = Double.parseDouble(scanner.nextLine());
				Rectangle r = new Rectangle(rHeight, rWidth);
				System.out.println("Area of the Rectangle: "+r.computeArea());
				System.out.println("Do you want to continue: Y/N");
				continueFlag = scanner.nextLine();
				break;
			case "T":
				System.out.println("Enter the base of the Traingle ");
				double tBase = Double.parseDouble(scanner.nextLine());
				System.out.println("Enter the height of the Traingle");
				double tHeight = Double.parseDouble(scanner.nextLine());
				Triangle t = new Triangle(tBase, tHeight);
				System.out.println("Area of the Triangle: "+t.computeArea());
				System.out.println("Do you want to continue: Y/N");
				continueFlag = scanner.nextLine();
				break;
			default:
				break;
			}
			if(continueFlag.equalsIgnoreCase("N")){
				System.out.println("Have a good day");
				break;
			}
		}
	}

}


/*###############Input and Output:##################
	
	Enter C for Circle
	Enter R for Rectangle
	Enter T for Triangle
	c
	Enter the radius of circle
	3
	Area of the circle is: 28.274333882308138
	Do you want to continue: Y/N
	y
	Enter C for Circle
	Enter R for Rectangle
	Enter T for Triangle
	r
	Enter the width of the Rectangle 
	4
	Enter the height of the Rectangle
	6
	Area of the Rectangle: 24.0
	Do you want to continue: Y/N
*/