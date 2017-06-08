package chapter6;

class FushuException extends Exception
{
	private double value;
	
	public FushuException(String msg)
	{
		super(msg);
	}
	
	public FushuException(String msg,double value)
	{
		super(msg);
		this.value= value;
	}
	
	public double getValue()
	{
		return value;
	}
	
	
}

class Demo
{
	public int div(int a,int b) throws FushuException,Exception
	{
//		if(b < 0)
//			throw new FushuException("除数为负数了",b);
//		if(b == 0)
//			throw new Exception("除数是0");
		return a/b;
	}
}



public class ExpDemo1 {

	public static void main(String[] args) {
		Demo d = new Demo();
		try{
			double r = d.div(3, 0);
			System.out.println(r);
		}
		catch(FushuException e)
		{
//			System.out.println(e.getMessage());	
			System.out.println(e.toString() + e.getValue());
//			e.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("over");
		}
		

	}

}
