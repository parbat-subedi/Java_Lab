package javaLab;
import java.util.Scanner;
public class qn16 {
	public static void main(String[] args){
		int addition = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int num1 = input.nextInt();
		System.out.print("Enter second number: ");
		int num2 = input.nextInt();
		for(int i=num1;i<=num2;i++)
		{
		addition+=i;
		}
		System.out.println("Sum of numbers from " + num1 + " to " + num2 + " is:\n " + addition);
		}
}
