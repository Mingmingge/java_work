package exe;

abstract class Ploygon
{
	private int num;
	
	public Ploygon(int num)
	{
		this.num = num;
	}
	
	public void print()
	{
		System.out.println("这是一个" + num + "边形！");
	}
}

interface Shape
{
	void area();
	void perimeter();
}

class Square extends Ploygon implements Shape
{
	private double length;
	
	public Square(double length)
	{
		super(4);
		this.length = length;
	}
	
	public void area()
	{
		System.out.println("面积是" + length * length + "!");
	}
	
	public void perimeter()
	{
		System.out.println("周长是" + 4 * length + "!");
	}
}


public class Test {

	public static void main(String[] args) {
		Square s1=new Square(1.5);
		s1.print();
	    s1.area();
        s1.perimeter();


	}

}
