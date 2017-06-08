package com;

class Car
{
	protected String color = "red";
	int num = 4;
	
	public void show()
	{
		System.out.println("color:" + color + ",num:" + num);
	}
}



public class Exe1 {

	static void fun(Car c)
	{
		c.show();
		c.color = "blue";
		c.show();
	}
	
	public static void main(String[] args) {
//		Car c = new Car();
//		c.show();
//		c.color="blue";
//		c.show();
		
		
		fun(new Car());
		
		Student s = new Student();
		s.show();
		s.setName("Tom");
		s.show();
		System.out.println(s.getName());
		
		Student s1 = new Student("Tom",2);
		s1.show();
		
		Cdateinfo da =new Cdateinfo();
		System.out.println(da.getDate());
		Cdateinfo da2 =new Cdateinfo(2017,3,9);
		System.out.println(da2.getDate());
		
		da.setDate(2017, 9, 3);
		System.out.println(da.getDate());

	}

}
