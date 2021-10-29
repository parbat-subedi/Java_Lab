package javaLab;
class Animals{
void eat(){
System.out.println("Eating...");
}
}

class bufallow extends Animals{
void speak(){
System.out.println("haaaaiii haaaaiii...");
}
}
class junglysuwor extends bufallow{
void weep(){
System.out.println("both hungry...");
}
}
public class qn41 {
	public static void main(String[] args){
		junglysuwor a = new junglysuwor();
		a.eat();
		a.speak();
		a.weep();
		}
}
