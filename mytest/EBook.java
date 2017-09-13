package mum.lesson5;

public class EBook extends Book{
	String eType;
	public EBook(double price, String title, String author, String eType) {
		super(title, price, author);
		this.eType = eType;
	}

}
