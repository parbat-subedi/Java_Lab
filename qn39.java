package javaLab;

public class qn39 {
	int bikeNo;
	String bikeName;
	float bikePrice;
	qn39(int bikeNo,String bikeName, float bikePrice){
	this.bikeNo = bikeNo;
	this.bikeName = bikeName;
	this.bikePrice = bikePrice;
	}
	void display()
	{
	System.out.println(bikeNo + " " + bikeName + " Rs." + bikePrice);
	}
	}

	public class Qn038 {
	public static void main(String[] args){
	qn39 b = new qn39(4262, "FZS", 260000f);
	b.display();
	}
	}


	//2. Program using super keyword
	class Animal{
	String color= "red";
	}

	class Rabbit extends Animal{
	String color = "White";
	void printColor(){
	System.out.println("Rabbit color: " + color); // prints color of Rabbit
	System.out.println("Animal color: " + super.color); //prints color of animal
	}
	}

	public class Qn039{
	public static void main(String[] args){
	Rabbit r = new Rabbit();
	r.printColor();
	}
}
