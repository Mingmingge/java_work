package test;

public class Dog extends Animal {
	static int b=0;
	public Dog(){
		jiao();
		b=1000;
	}
	public static void jiao(){
		System.out.println("b="+b);
		System.out.println("I am a dog!");
	}

}
