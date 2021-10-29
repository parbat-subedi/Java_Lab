package javaLab;

public class qn37 {
	String bookName;
	String author;
	int price;
	qn37(String bookName, String author, int price){
	this.bookName = bookName;
	this.author = author;
	this.price = price;
	}
	void infoDisplay(){
	System.out.println("Book Name: " + bookName);
	System.out.println("Book Author: " + author);
	System.out.println("Book Price: " + price);
	}
	public static void main(String[] args){
	qn37 bond = new qn37("OOP in java","Yubaraj Kalathoki",200);
	bond.infoDisplay();
	}
}
