package javaLab;
import java.util.Scanner;
public class qn30 {
		public static void main(String[] args){
		int cnt=0, n;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number to search: ");
		n = input.nextInt();
		int arrayVar[] = {1,4,5,3,6,7,23,6};
		for(int i = 0; i < arrayVar.length; i++){
		if(n == arrayVar[i])
		cnt++;
		}
		if(cnt!=0)
		System.out.println(n + " is present in array and repeated " + cnt + " times.");
		else
		System.out.println(n + " is not present in array.");
		}
}
