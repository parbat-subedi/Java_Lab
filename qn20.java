package javaLab;
import java.util.Scanner;
public class qn20 {
	public static void main(String[] args){
		int add = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = input.nextInt();
		System.out.print("Enter second number: ");
		int n2 = input.nextInt();
		for(int i=n1;i<=n2;i++)
		{
		if(i%2==0)
		add+=i;
		}
		System.out.println("Sum of even number between " + n1 + " to " + n2 + " is:\n " + add);
		}
}
