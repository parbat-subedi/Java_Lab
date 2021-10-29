package javaLab;
//nestedif statement
public class qn4B {
	public static void main(String[] args){
		int numb = -5;
		if(numb > 0)
		{
		if(numb % 2 == 0)
		System.out.println(numb + " is positive even number");
		else
		System.out.println(numb + " is positive odd number");
		}
		else
		{
		if(numb % 2 == 0)
		System.out.println(numb + " is negative even number");
		else
		System.out.println(numb + " is negative odd number");
		}
		}
}
