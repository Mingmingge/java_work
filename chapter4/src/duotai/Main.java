package duotai;

public class Main {

	public static void main(String[] args) {
		
		shape s[] = new shape[3];
		s[0] = new Circle(2);
		s[1] = new Rect(2, 3);
		s[2] = new Circle(4);
		
		double sum = 0;
		
		for(shape x:s)
		{
			sum += x.getArea();
		}
		
		System.out.println(sum);

	}

}
