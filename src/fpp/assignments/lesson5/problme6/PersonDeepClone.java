package mum.lesson5.problme6;


public class PersonDeepClone implements Cloneable{
	private String name;
	private Computer computer;
	
	public PersonDeepClone(String name, Computer computer) {
		this.name = name;
		this.computer = computer;
	}
	
	public String getName() {
		return name;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		PersonDeepClone obj = (PersonDeepClone) super.clone();
		obj.computer = computer.clone();
		return obj;
	}
	
	@Override
	public String toString() {
		return "Customer name: "+name+computer;
	}
}
