package javaLab;

public class qn3 {
	public static void main(String[] args){
		// automatic type conversion in java
		int inum = 100;
		long l = inum;
		float f = l;
		System.out.println("Int value is: "+inum);
		System.out.println("Long value is: "+l);
		System.out.println("Float value is:"+f);
		System.out.println("\n");
		double dou = 100.04;
		long lon = (long)dou;
		int num = (int)lon;
		System.out.println("Double value "+dou);
		System.out.println("Long value "+lon);
		System.out.println("Int value " + num);
		}
		}
