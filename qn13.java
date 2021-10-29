package javaLab;

public class qn13 {
	public static void main(String[] args){
		int num;
		System.out.println("Displaying prime numbers between 1 to 100:\n");
		for(num=1; num<=100; num++)
		{
		int count=0;
		for(int i=2; i<=num/2; i++)
		{
		if(num%i==0)
		{
		count++;
		break;
		}
		}
		if(count == 0 && num != 1)
		System.out.print(num + "\t");
		}
}
}
