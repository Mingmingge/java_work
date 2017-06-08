package duotai;

public abstract class Animal {
	protected String name;
	
	public Animal()
	{
		
	}
	public Animal(String name)
	{
		this.name = name;
	}
	
	abstract public void eat();
	
	abstract public void speak();
}
