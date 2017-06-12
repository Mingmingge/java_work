package com;

class Point
{
	private int x;
	private int y;
	
	public Point()
	{
		x = 0;
		y = 0;
	}
	
	public Point(int x,int y)
	{
		this.x = x;
		this.y = y;
	}
	
	public String getPoint()
	{
		return "(" + x + "," + y + ")";
	}
}

public class T5 {

	public static void main(String[] args) {
		Point p1 = new Point();
		System.out.println(p1.getPoint());
		
		Point p2 = new Point(3,5);
		System.out.println(p2.getPoint());

	}

}
