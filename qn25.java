package javaLab;

public class qn25 {
	public static void main(String[] args){
		int add = 0;
		int[] arrayV = {2,3,5,8,9};
		for(int abc: arrayV)
		{
		add += abc;
		}
		float avg = add / 4;
		System.out.println("Average of array elements is: " + avg);
		}
}
