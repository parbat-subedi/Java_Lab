package javaLab;

public class qn40 {
	public static void main(String args[]){
		try{
		int data=25/0;
		System.out.println(data);
		}
		catch(ArithmeticException exc){System.out.println(exc);}
		finally{System.out.println("Swagaat nahi karoge hamaraaaaa!!!!!");}
		System.out.println("i am finally forward ");
		}
}
