package mum.lesson11.problem2.solution;

import java.util.List;



public class AccountManager {
	public static double computeAccountBalanceSum(List<Employee> emps) {
	        double sum = 0;
		for(Employee e:emps){
			for(Account a:e.getAccounts()){
				sum += a.getBalance();
			}
		}
		return sum;
	}
}
