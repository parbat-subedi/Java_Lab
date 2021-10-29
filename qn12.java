package javaLab;
import java.util.Scanner;
public class qn12 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first choicce: ");
		int n1 = input.nextInt();
		System.out.print("Enter second choice: ");
		int n2 = input.nextInt();
		System.out.println("displaying the numbers between " + n1 + "and " + n2+ " is:");
		for(int num=n1;num<=n2;num++)
		{
		if(num%2==0)
		System.out.print(num + "\t");
		}
		}
}
