package jicheng;

public class Cat extends Animal {
	private String color;
	
	public Cat(int age ,String name,String color)
	{
		super(age,name);
		this.color = color;
	}
	
	public void eat()
	{
		System.out.println("Cat want to eat fish....");
	}
	
	public void speak()
	{
		System.out.println("miaomiaomiao.....");
	}
	
	public String getColor()
	{
		return color;
	}
	
	public void catchMouse()
	{
		System.out.println("◊•¿œ Û");
	}
	
	
}
