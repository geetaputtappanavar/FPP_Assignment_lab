package mum.lesson8List.day2.prob1Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
	public static void main(String[] args) {
		//Tester obj= new Tester();
		List<Marketing> al = new ArrayList<Marketing>();
		///add
		al.add(new Marketing("Tom", "Laptop", 2250.88));
		al.add(new Marketing("Tim", "iPad", 2250.88));
		al.add(new Marketing("Radha", "Calulator", 1950.88));
		al.add(new Marketing("Bheem", "HeadPhone", 150.88));
		al.add(new Marketing("Raju", "Mobile", 850.88));
		al.add(new Marketing("Silly", "Pen", 50.88));	
		System.out.println("add-->");
		System.out.println(al);
		al.remove(2);
		System.out.println("\nafter remove-->");
		System.out.println(al);
		al.set(1, new Marketing("Geeta", "Missile", 9999.99));
		System.out.println("\nafter modify-->");
		System.out.println(al);
		System.out.println("\nsize --->");
		System.out.println(al.size());
		Collections.sort(al, new SalesComparator());
		System.out.println("\nSorted list with sales amount-->");
		System.out.println(al);
		List<Marketing> tempList = listMoreThan1000(al);
		Collections.sort(tempList, new NameComparator());
		System.out.println("\nSorted list with more than 1000$-->");
		System.out.println(tempList);		
		SalesComparator comp = new SalesComparator();
		Marketing m1 = new Marketing("Tom", "Laptop", 2250.88);
		Marketing m2 = new Marketing("Radha", "Calulator", 1950.88);
		System.out.println("\ncomparator and equals consistency-->");
		System.out.println(comp.compare(m1, m2)+"--"+m1.equals(m2));		
	}
	public static List<Marketing> listMoreThan1000(List<Marketing> list){
		List<Marketing> tempList = new ArrayList<Marketing>();
		for(Marketing m:list){
			if(m.salesamount>1000){
				tempList.add(m);
			}
		}
		return tempList;
	}
}

/*Input and Output:
Output:
	add-->
	[Tom,Laptop,2250.88, Tim,iPad,2250.88, Radha,Calulator,1950.88, Bheem,HeadPhone,150.88, Raju,Mobile,850.88, Silly,Pen,50.88]

	after remove-->
	[Tom,Laptop,2250.88, Tim,iPad,2250.88, Bheem,HeadPhone,150.88, Raju,Mobile,850.88, Silly,Pen,50.88]

	after modify-->
	[Tom,Laptop,2250.88, Geeta,Missile,9999.99, Bheem,HeadPhone,150.88, Raju,Mobile,850.88, Silly,Pen,50.88]

	size --->
	5

	Sorted list with sales amount-->
	[Silly,Pen,50.88, Bheem,HeadPhone,150.88, Raju,Mobile,850.88, Tom,Laptop,2250.88, Geeta,Missile,9999.99]

	Sorted list with more than 1000$-->
	[Geeta,Missile,9999.99, Tom,Laptop,2250.88]

	comparator and equals consistency-->
	1--false

	*/
