package mum.lesson5.problem5;

public class Computer {
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
	public double computePower(){
		return this.ramSize*this.processorSpeed;
	}

	@Override
	public String toString() {
		return "Manufacturer: "+this.manufacturer+"\n"+"Processor: "+this.processor+"\n"
				+"Ramsize: "+ramSize+"\n"+"Disk Size: "+this.diskSize+"\n"+"Processor Speed: "+processorSpeed;
	}
	
	@Override
	public int hashCode() {
		return 7+manufacturer.hashCode()+processor.hashCode()+Integer.valueOf(ramSize).hashCode()+Integer.valueOf(diskSize)+Double.valueOf(processorSpeed).hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj==null){
			return false;
		}else if(!(obj instanceof Computer)){
			return false;
		}else{
			Computer c = (Computer)obj;
			boolean res = c.getDiskSize()==getDiskSize()&&c.getManufacturer().equals(getManufacturer())
						  && c.getProcessor().equals(getProcessor())&&c.ramSize == getRamSize()&&c.getProcessorSpeed()==getProcessorSpeed();
			return res;
		}
	}
}
