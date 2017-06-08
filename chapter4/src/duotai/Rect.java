package duotai;

public class Rect implements shape {

	private double length;
	private double width;
	
	public Rect(double length,double width)
	{
		this.length = length;
		this.width = width;
	}
	
	@Override
	public double getArea() {
		return length * width;
	}

}
