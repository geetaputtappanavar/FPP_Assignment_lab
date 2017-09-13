package mum.lesson5.problem4;

public class Invoice implements Payable{
	private String partNum;
	private String partDesc;
	private int quantity;
	private double pricePerItem;
	
	public Invoice(String partNum, String partDesc, int quantity, double pricePerItem) {
		this.partNum = partNum;
		this.partDesc = partDesc;
		this.quantity = quantity;
		this.pricePerItem = pricePerItem;
	}
	public String getPartNum() {
		return partNum;
	}
	public void setPartNum(String partNum) {
		this.partNum = partNum;
	}
	public String getPartDesc() {
		return partDesc;
	}
	public void setPartDesc(String partDesc) {
		this.partDesc = partDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}

	@Override 
	public double getPaymentAmount() {
		return this.quantity*this.pricePerItem;
	}
	
	//String partNum, String partDesc, int quantity, double pricePerItem
	public String toString() {
		return "Part Number: "+getPartNum()+"\n"+"Part Description: "+getPartDesc()+"\n"+"Quanity: "+getQuantity()+"\n"
				+"Price per Item: "+getPricePerItem()+"\n";
	}
}
