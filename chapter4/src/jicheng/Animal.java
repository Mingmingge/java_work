package jicheng;

abstract public class Animal {
	protected int age;
	protected String name;
	
	public Animal()
	{
		this.age = 0;
		this.name = "unknow";
	}
	
	public Animal(int iAge,String strName)
	{
		this.age = iAge;
		this.name = strName;
	}
	
	abstract public void eat();
		
	public void speak()
	{
		System.out.println("Animal speak....");
	}
}
