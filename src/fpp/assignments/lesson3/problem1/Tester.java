package fpp.assignments.lesson3.problem1;

public class Tester {

	public static void main(String[] args) {
		// create 3 cust objects
		Customer c1 = new Customer("aaa", "mmm", "xxx");
		Address billAdd1 = new Address("1000M", "chicago", "IOWA", "582211");
		c1.setBillingAddress(billAdd1);
		Address shipAdd1 = new Address("1000M", "Fairfiled", "IOWA", "582211");
		c1.setShippingAddress(shipAdd1);
		
		Customer c2 = new Customer("bbb", "nnn", "yyy");
		Address billAdd2 = new Address("1000N", "Chicago", "IOWA", "582212");
		c2.setBillingAddress(billAdd2);
		Address shipAdd2 = new Address("1000N", "Chicago", "IOWA", "582211");
		c2.setShippingAddress(shipAdd2);
		
		Customer c3 = new Customer("ccc", "ooo", "zzz");
		Address billAdd3 = new Address("1000O", "Bangalore", "Karnataka", "582210");
		c3.setBillingAddress(billAdd3);
		Address shipAdd3 = new Address("1000O", "Bangalore", "Karnataka", "582211");
		c3.setShippingAddress(shipAdd3);

		Customer[] custArr = new Customer[3];
		custArr[0]=c1;
		custArr[1]=c2;
		custArr[2]=c3;
		for(Customer cust:custArr){
			if(cust.getBillingAddress().getCity().equalsIgnoreCase("Chicago")){
				System.out.println(cust.toString());
			}
		}	
	}
}


/*#######Input and Output########
Output:
[aaa, mmm, ssn: xxx]
[bbb, nnn, ssn: yyy]
*/