package mum.lesson8List.day2.prob1Comparator;

import java.util.List;


public class Marketing {
	 String employeename;
	 String productname;
	 double salesamount;
	
	 public Marketing(String employeename, String productname, double salesamount) {
		this.employeename = employeename;
		this.productname = productname;
		this.salesamount = salesamount;
	}
	@Override
	public String toString() {
		return employeename+","+productname+","+salesamount;
	}
	
	@Override
	public int hashCode() {
		return employeename.hashCode()+productname.hashCode()+new Double(salesamount).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		Marketing m = (Marketing)obj;
		/*if(){
			
		}*/
		return employeename.equals(m.employeename) && salesamount==m.salesamount;
	}
}
