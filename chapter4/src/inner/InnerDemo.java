package inner;

abstract class AbsDemo
{
	abstract void fun();
	abstract void f2();
}

class Outer
{
	private int num = 100;
	
//	private class Inner extends AbsDemo
//	{
//		public void fun()
//		{
//			System.out.println("num=" + Outer.this.num);
//		}
//	}
	
	public void print()
	{
//		Inner in = new Inner();
//		in.fun();
		new AbsDemo(){
			public void fun()
			{
				System.out.println("num=" + Outer.this.num);
			}
			public void f2()
			{
				System.out.println("f2");
			}
		}.fun();
		new AbsDemo(){
			public void fun()
			{
				System.out.println("num=" + Outer.this.num);
			}
			public void f2()
			{
				System.out.println("f2");
			}
		}.f2();
	}
}

public class InnerDemo {

	public static void main(String[] args) {
//		Outer.Inner in = new Outer().new Inner();
//		in.fun();
		
		Outer out = new Outer();
		out.print();

	}

}

//class Body
//{ 
//	private
//	private class Xinzang
//	{
//	
//	}
//}


