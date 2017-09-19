package mum.lesson8List.problem1_personList;

class Person {
	private String lastName;
	private String firstName;
	private int age;

	public Person(String last, String first, int a) { 
		lastName = last;
		firstName = first;
		age = a;
	}

	public String getLast(){
		return lastName;
	}

	// chnage to all objs in al
	@Override
	public String toString() {
		return "Person [lastName=" + lastName + ","+"FirstName=" + firstName +","+ "Age=" + age + "]";
	}
	
	@Override
	public int hashCode() {
		return lastName.hashCode()+firstName.hashCode()+Integer.valueOf(age).hashCode();
	}
	@Override
	public boolean equals(Object obj) {
		Person p = (Person)obj;
		if(p.firstName.equals(firstName) && p.lastName.equals(lastName) && p.age==age) {
			return true;
		}else {
			return false;
		}
	}
} 
