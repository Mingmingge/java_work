
public class Fish extends Animal implements Pet{
	String name;
	public Fish()
	{
		super(0);
		name="";
	}
	public Fish(String name)
	{
		super(0);
		this.name=name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public void eat()
	{
		System.out.println("Fish eat.");
	}
	public void play()
	{
		System.out.println("Fish Play.");
	}
	public void walk()
	{
		System.out.println("Fish cannot walk.");
	}

}
