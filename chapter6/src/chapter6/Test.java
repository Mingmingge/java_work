package chapter6;

public class Test {

	public static void main(String[] args) {

		Circle c = null;
		try{
			c = new Circle(-1);
			System.out.println(c.getArea());
		}
		catch(FushuException e)
		{
			System.out.println(e.toString());
		}


	}

}
