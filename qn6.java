package javaLab;
import java.util.Scanner;
public class qn6 {
	public static void main(String[] args){
		 
		//input
		Scanner input = new Scanner(System.in);
		System.out.println("1. Separate Information\n 2. Combined Information");
		System.out.println("\nEnter a position to display information(1/2): ");
		int opt1 = input.nextInt();
		switch(opt1)
		//switched opt1.
		{
		case 1:
		System.out.println("1. Name\n2. Phone No.");
		System.out.println("Enter your choice(1/2)");
		int opt2 = input.nextInt();
		switch(opt2)
		{
		case 1:
		System.out.println("Name : paru raj upadhayaye");
		break;
		case 2:
		System.out.println("Phone No. : 9812345678");
		break;
		default:
		System.out.println("Invalid input");
		}
		break;
		case 2:
		System.out.println("Name: paru raj upadhayaye \n Phone Number : 9812345678");
		break;
		default:
		System.out.println("Invalid input");
		}
		}
}
