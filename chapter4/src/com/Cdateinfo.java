package com;

public class Cdateinfo {

	private int year;
	private int month;
	private int day;
	
	public Cdateinfo()
	{
		year = 2000;
		month = 1;
		day = 1;
	}
	
	public Cdateinfo(int y,int m,int d)
	{
		year = y;
		month = m;
		day = d;
	}
	
	public void setDate(int y,int m,int d)
	{
		year = y;
		month = m;
		day = d;	
	}
	
	public String getDate()
	{
		return year + "Äê" + month +"ÔÂ" + day + "ÈÕ";
	}
	
}
