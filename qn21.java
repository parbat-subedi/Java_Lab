package javaLab;

public class qn21 {
	public static void main(String[] args){
		int num,add=0;
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
		add+=num;
		}
		System.out.print("Sum of prime number between 1 to 100 is: \t " + add);
		}
}
