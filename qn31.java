package javaLab;
import java.util.Scanner;
public class qn31 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] arrV = {0,5,2,13,4,5,5};

		System.out.println("Available Array is:\n");
		for(int i = 0; i < arrV.length; i++){
		System.out.print(arrV[i]+" ");
		}
		System.out.print("\nEnter Element to be deleted in an array : ");
		int element = input.nextInt();

		for(int i = 0; i < arrV.length; i++){
		if(arrV[i] == element){
		for(int j = i; j < arrV.length - 1; j++){
		arrV[j] = arrV[j+1];
		}
		break;
		}
		}

		System.out.println("\nAfter removing element from an array: " + element + "\n");
		for(int i = 0; i < arrV.length-1; i++){
		System.out.print(arrV[i]+" ");
		}
		}
}
