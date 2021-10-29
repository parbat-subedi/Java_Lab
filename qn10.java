package javaLab;
		import java.util.Scanner;
public class qn10 {
	public static void main(String[] args){
		Scanner inpt = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int n1 = inpt.nextInt();
		System.out.print("Enter second number: ");
		int n2 = inpt.nextInt();
		for(int num=n1;num<=n2;num++)
		{
		if(num%2!=0)
		System.out.print(num + "\t");
		}
		}
}
