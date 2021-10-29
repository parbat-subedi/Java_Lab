package javaLab;

public class qn26 {
	public static void main(String[] args){
		int arrayV[] = {1,4,5,9};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayV[i] < arrayV[j])
		{
		int temp = arrayV[i];
		arrayV[i] = arrayV[j];
		arrayV[j] = temp;
		}
		}
		}
		System.out.println("Largest elements is: " + arrayV[0]);
		}
}
