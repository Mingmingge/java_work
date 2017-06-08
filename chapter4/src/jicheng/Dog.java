package jicheng;

public class Dog extends Animal
{
	private String breed;
	
	public Dog(int age,String name,String breed)
	{
		super(age,name);
		this.breed = breed;
	}
	
	public void eat()
	{
		System.out.println("Dog want to eat bone...");
	}
	
	public void speak()
	{
		System.out.println("wang wang wang....");
	}
	
	public void kanjia()
	{
		System.out.println("¿´¼Ò");
	}
	

}
