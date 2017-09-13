package mum.lesson5.problme6;


public class Computer implements Cloneable{
	private String manufacturer;
	private String processor;
	private int ramSize;
	private int diskSize;
	private double processorSpeed;
	
	public Computer(String manufacturer, String processor, int ramSize, int diskSize, double processorSpeed) {
		this.manufacturer = manufacturer;
		this.processor = processor;
		this.ramSize = ramSize;
		this.diskSize = diskSize;
		this.processorSpeed = processorSpeed;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public String getProcessor() {
		return processor;
	}
	public int getRamSize() {
		return ramSize;
	}
	public int getDiskSize() {
		return diskSize;
	}
	public double getProcessorSpeed() {
		return processorSpeed;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public void setProcessor(String processor) {
		this.processor = processor;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public void setDiskSize(int diskSize) {
		this.diskSize = diskSize;
	}
	public void setProcessorSpeed(double processorSpeed) {
		this.processorSpeed = processorSpeed;
	}
	
	@Override
	public String toString() {
		return "Manufacturer: "+this.manufacturer;
	}
	
	@Override
	public Computer clone() throws CloneNotSupportedException {
		Computer clone = (Computer)super.clone(); 
		return clone;
	}
}
