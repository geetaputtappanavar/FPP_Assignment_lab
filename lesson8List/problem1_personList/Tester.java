package mum.lesson8List.problem1_personList;

public class Tester {
	public static void main(String[] args) {
		MyPersonList pAL = new MyPersonList();
		System.out.println("1.-----add------");
		pAL.add(new Person("T", "Tomy", 21));
		pAL.add(new Person("R", "Rimy", 22));
		pAL.add(new Person("RD", "Radha", 11));
		pAL.add(new Person("B", "BHeem", 12));
		System.out.println(pAL);
		System.out.println("\n2.----get------\n"+pAL.get(1));
		System.out.println("\n3.----finding Person in person list----: \n"+ pAL.find(new Person("B", "BHeem", 12)));
		System.out.println("\n4.-----------Insert---------");
		pAL.insert(new Person("P", "Geeta", 99), 2);
		System.out.println("Person list after inserting: \n"+pAL);
		pAL.remove(new Person("RD", "Radha", 11));
		System.out.println("\n5.----Person list after removing: -----\n"+pAL);


	} 
}

/*Input and Output:
Output:
	1.-----add------
	[Person [lastName=T,FirstName=Tomy,Age=21]
	 Person [lastName=R,FirstName=Rimy,Age=22]
	 Person [lastName=RD,FirstName=Radha,Age=11]
	 Person [lastName=B,FirstName=BHeem,Age=12]]

	2.----get------
	Person [lastName=R,FirstName=Rimy,Age=22]

	3.----finding Person in person list----: 
	true

	4.-----------Insert---------
	Person list after inserting: 
	[Person [lastName=T,FirstName=Tomy,Age=21]
	 Person [lastName=R,FirstName=Rimy,Age=22]
	 Person [lastName=P,FirstName=Geeta,Age=99]
	 Person [lastName=RD,FirstName=Radha,Age=11]
	 Person [lastName=B,FirstName=BHeem,Age=12]]

	5.----Person list after removing: -----
	[Person [lastName=T,FirstName=Tomy,Age=21]
	 Person [lastName=R,FirstName=Rimy,Age=22]
	 Person [lastName=P,FirstName=Geeta,Age=99]
	 Person [lastName=B,FirstName=BHeem,Age=12]]*/

