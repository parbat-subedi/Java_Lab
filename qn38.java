package javaLab;

public class qn38 {
	void create(){
		System.out.println("Wood is created..");
		}
		}

		class Foam extends qn38{
		void insert(){
		System.out.println("Foam inserted..");
		}
		}

		class Duster extends qn38{
		void apply(){
		System.out.println("Wood applied..");
		}
		}
		

		public class Qno38{
			public static void main(String[] args){
			Duster d = new Duster();
			d.create();
			d.apply();
			}
}
		
