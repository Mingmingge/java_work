package jicheng;

public class Main {

	public static void main(String[] args) {
//		Animal a = new Animal(3,"Tom");
//		a.eat();
//		a.speak();
		
		Cat c = new Cat(3, "Tom", "white");
		fun(c);
		
		Dog d = new Dog(4,"Jack","jiwawa");
		fun(d);		
		
		Animal an = c;
		an.speak();
		
		Cat cat = new Cat(2, "T","black");
		cat = (Cat)an;
		
		Animal a1 = new Cat(2, "T","black");
		
		System.out.println(cat.getClass());
		

	}
	
	public static void fun(Animal a)
	{
		a.eat();
		a.speak();
		
		if(a instanceof Cat)
		{
			Cat c = (Cat)a;
			c.catchMouse();
		}
		
		if(a instanceof Dog)
		{
			((Dog) a).kanjia();
		}
	}
}
