package com;

class Fu
{
	int num = 4;
	String id = "hdu";
	
	public Fu() {
		System.out.println("Fu()....");
	}
	
	public Fu(int num)
	{
		this.num = num;
		print();
		System.out.println("Fu(int)...." + num);
	}
	
	void print()
	{
		System.out.println("Fu.num=" + num);
	}
}

class Zi extends Fu
{
	int num = 6;
	
	public Zi() {
		super(99);
		System.out.println("Zi()....");
	}
	
	public Zi(int num)
	{
		super(99);
		this.num = num;
		System.out.println("Zi(int)....");
	}
	
	void print()
	{
		super.print();
		System.out.println("Zi.num=" + this.num +",id=" + id);
	}
}

public class Jichen {

	public static void main(String[] args) {
		Zi z = new Zi();
		z.print();
		
		Fu f = new Fu(99);
		

	}

}
