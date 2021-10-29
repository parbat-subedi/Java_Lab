package javaLab;
import java.util.*;
public class qn32 {
	public static int[] addX(int n, int arr[], int x)
	{
	int i;
	// create a new array of size n+1
	int newarr[] = new int[n + 1];
	for (i = 0; i < n; i++)
	newarr[i] = arr[i];

	newarr[n] = x;
	return newarr;
	}

	public static void main(String[] args)
	{
	int num = 10;
	int i;
	Scanner input = new Scanner(System.in);
	int arr[] ={0,1,3,2,5,7,6,8,12,19 };
	System.out.println("\nInitial Array:\n" + Arrays.toString(arr));
	System.out.print("\nEnter the new element for array: ");
	int x = input.nextInt();
	arr = addX(num, arr, x);
	System.out.println("\nArray with " + x + " added:\n" + Arrays.toString(arr));
	}
}
