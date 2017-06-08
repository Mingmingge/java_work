package mapdemo;

public class Student {
	private String name;
	private int age;
	private String cls;
	
	Student(String name,int age,String cls)
	{
		this.name = name;
		this.age = age;
		this.cls = cls;
	}
	
	public String getCls()
	{
		return cls;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void show()
	{
		System.out.println(name + "," + age + "," + cls);
	}
}
