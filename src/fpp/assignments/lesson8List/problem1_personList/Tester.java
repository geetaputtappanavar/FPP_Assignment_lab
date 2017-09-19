package fpp.assignments.lesson8List.problem1_personList;

public class Tester {
	public static void main(String[] args) {
		MyPersonList pAL = new MyPersonList();
		
		pAL.add(new Person("Tomy", "T", 21));
		pAL.add(new Person("Rimy", "R", 22));
		pAL.add(new Person("Radha", "RD", 11));
		pAL.add(new Person("BHeem", "B", 12));
		pAL.get(1);
		pAL.remove(new Person("Radha", "RD", 11));
		System.out.println(pAL);
	}
}
