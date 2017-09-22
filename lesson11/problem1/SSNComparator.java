package mum.lesson11.problem1;

import java.util.Comparator;

public class SSNComparator implements Comparator<Employee>{
	@Override
	public int compare(Employee e1, Employee e2) {
		return e1.getSsn().compareTo(e2.getSsn());
	}
}
