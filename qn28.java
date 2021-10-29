package javaLab;

public class qn28 {
	public static void main(String[] args){
		int arrayV[] = {2,24,4,5};
		for(int i = 0; i<4; i++)
		{
		for(int j = i+1; j<4; j++)
		{
		if(arrayV[i] > arrayV[j])
		{
		int temp = arrayV[i];
		arrayV[i] = arrayV[j];
		arrayV[j] = temp;
		}
		}
		}
		System.out.println("Smallest elements is: " + arrayV[0]);
		}
}
