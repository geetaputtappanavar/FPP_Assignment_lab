package mum.lesson8List.day2.prob1Comparator;

import java.util.Comparator;

public class SalesComparator implements Comparator<Marketing>{

	@Override
	public int compare(Marketing o1, Marketing o2) {
		int i = Double.compare(o1.salesamount, o2.salesamount);
		if(i==0){
			i = o1.employeename.compareTo(o1.employeename);
		}
		return i;
	}
}
