package mum.lesson11.problem1;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class EmployeeAdmin {

	/**
	 * Returns a list of Employees whose social security number is on the input
	 * list socSecNums and whose salary is > 80000. The list must be ordered by
	 * social security number, from lowest to highest. To sort, you must use a
	 * Collections sorting method and you must define your own Comparator to be
	 * used to compare Employees by ssn.
	 */
	public static List<Employee> prepareReport(HashMap<String, Employee> table, List<String> socSecNums) {
		List<Employee> empList = new LinkedList<Employee>();
		Set<String> keySet = table.keySet();
		for (String key : keySet) {
			if (table.get(key).getSalary() > 80000) {
				for (String ssn : socSecNums) {
					if (key == ssn) {
						empList.add(table.get(key));
					}
				}
			}
		}
		Collections.sort(empList, new SSNComparator());
		return empList;
	}
}
