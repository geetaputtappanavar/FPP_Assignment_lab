package mum.lesson5.problme6;


public class PersonShallowClone implements Cloneable{
	private String name;
	private Computer computer;
	
	public PersonShallowClone(String name,  Computer computer) {
		this.name = name;
		this.computer = computer;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	@Override
	public String toString() {
		return "Customer name: "+name+computer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Computer getComputer() {
		return computer;
	}

	public void setComputer(Computer computer) {
		this.computer = computer;
	}
	
	
}
