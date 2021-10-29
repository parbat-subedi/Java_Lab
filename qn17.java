package javaLab;

public class qn17 {
	public static void main(String[] args){
		int add = 0;
		for(int i=1;i<=100;i++)
		{
		if(i%2!=0)
		add+=i;
		}
		System.out.println("Sum of odd number between 1 to 100 is " + add);
		}
}
