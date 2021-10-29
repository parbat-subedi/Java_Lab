package javaLab;
import java.util.Scanner;
public class qn14 {
	public static void main(String[] args){
		int number;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		System.out.println("displaying prime numbers between " + num1+ " and "+ num2 + " is: \n");
		for(number=num1; number<=num2; number++)
		{
		int count=0;
		for(int i=2; i<=number/2; i++)
		{
		if(number%i==0)
		{
		count++;
		break;
		}
		}
		if(count == 0 && number != 1)
		System.out.print(number + "\t");
		}
	}
}
