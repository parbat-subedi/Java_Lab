package javaLab;
import java.util.Scanner;
public class qn35 {
	static String name, email;
	static int rollNo;
	static long phoneNo;

	//creating three arguments constructor
	qn35(String nm, int rN, String em){
	name = nm;
	rollNo = rN;
	email = em;
	}

	//creating four arguments constructor
	qn35(String nm, int rN, String em, long phn){
	name = nm;
	rollNo = rN;
	email = em;
	phoneNo = phn;
	}

	void infoDisplay(){
	System.out.println("\nStudent Details");
	System.out.println("Name: "+ name);
	System.out.println("Roll No.: "+ rollNo);
	System.out.println("Email: "+ email);
	System.out.println("Phone Number: "+ phoneNo);
	}

	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("your Details");
	System.out.print("Enter your Name: ");
	name = input.nextLine();

	System.out.print("Enter your roll number: ");
	rollNo = Integer.parseInt(input.nextLine());

	System.out.print("Enter your email: ");
	email = input.nextLine();

	System.out.print("Enter your phone Number: ");
	phoneNo = Long.parseLong(input.nextLine());

	qn35 std1 = new qn35(name,rollNo,email,phoneNo);
	std1.infoDisplay();
	
	}
}
