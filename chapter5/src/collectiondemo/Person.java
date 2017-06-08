package collectiondemo;

public class Person implements Comparable<Person>
{
	private int age;
	private String name;
	
	public Person(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public void showInfo()
	{
		System.out.println(name + " " + age);
	}
	
	public boolean equals(Object obj)
	{
		if(!( obj instanceof Person))
			return false;
		Person p = (Person)obj;
		System.out.println(p.name + "======="+ this.name);
		return this.age == p.age && this.name.equals(p.name);
	}
	
	public int hashCode()
	{
		return this.name.hashCode() + 23 * this.age;
	}
	
	public int compareTo(Person o)
	{
		if(this.age > o.age) return 1;
		if(this.age == o.age) return 0;
		return -1;
	}
	
	
	
}
