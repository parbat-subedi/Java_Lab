package javaLab;

public class qn29 {
	public static void main(String[] args){
		int arrayV[] = {2,13,5,23};
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
		System.out.println("Second smallest number is: " + arrayV[1]);
		}
}
