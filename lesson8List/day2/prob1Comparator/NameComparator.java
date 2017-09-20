package mum.lesson8List.prob1Comparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		Marketing m1 = (Marketing)o1;
		Marketing m2 = (Marketing)o2;
		return m1.employeename.compareTo(m2.employeename);
	}
}
