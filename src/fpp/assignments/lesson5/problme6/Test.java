package mum.lesson5.problme6;

import mum.lesson5.problme6.Computer;

public class Test {
	public static void main(String[] args) throws CloneNotSupportedException {
		/*Testing shallow copy*/
		PersonShallowClone objBeforeClone = new PersonShallowClone("Geeta"+"\n", new Computer("HP", "I7", 8, 1000, 2.5));
		System.out.println("Before making Changes: ");
		System.out.println(objBeforeClone);
		PersonShallowClone objAfterClone = (PersonShallowClone) objBeforeClone.clone();
		System.out.println("\n"+objAfterClone);
		System.out.println("\nAfter making changes");
		objBeforeClone.getComputer().setManufacturer("Thoshiba");
		objBeforeClone.setName("Julie\n");
		System.out.println(objBeforeClone);
		System.out.println("\n"+objAfterClone);
		
		/*Testing Deep copy*/
		System.out.println("############Deep Clone##########");
		PersonDeepClone objBeforeDeepClone = new PersonDeepClone("Geeta"+"\n", new Computer("HP", "I7", 8, 1000, 2.5));
		System.out.println("Before making Changes: ");
		System.out.println(objBeforeDeepClone);
		PersonDeepClone objAfterDeepClone = (PersonDeepClone) objBeforeDeepClone.clone();
		System.out.println("\n"+objAfterDeepClone);
		System.out.println("\nAfter making changes");
		objBeforeDeepClone.getComputer().setManufacturer("Thoshiba");
		objBeforeDeepClone.setName("Julie\n");
		System.out.println(objBeforeDeepClone);
		System.out.println("\n"+objAfterDeepClone);
	}
}

/*
Input and Output:
Output:
	Before making Changes: 
		Customer name: Geeta
		Manufacturer: HP

		Customer name: Geeta
		Manufacturer: HP

		After making changes
		Customer name: Julie
		Manufacturer: Thoshiba

		Customer name: Geeta
		Manufacturer: Thoshiba
		############Deep Clone##########
		Before making Changes: 
		Customer name: Geeta
		Manufacturer: HP

		Customer name: Geeta
		Manufacturer: HP

		After making changes
		Customer name: Julie
		Manufacturer: Thoshiba

		Customer name: Geeta
		Manufacturer: HP
*/
