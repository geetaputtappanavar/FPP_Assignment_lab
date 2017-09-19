package fpp.assignments.lesson8List.problem1_personList;

public class Tester {
	public static void main(String[] args) {
		MyPersonList pAL = new MyPersonList();
		
		pAL.add(new Person("Tomy", "T", 21));
		pAL.get(1);
	}
}
