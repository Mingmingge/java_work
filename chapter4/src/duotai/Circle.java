package duotai;

public class Circle implements shape {

	private double radius;
	
	public Circle(double radius)
	{
		this.radius = radius;
	}
	
	@Override
	public double getArea() {
		return PI * radius * radius;
	}

}
