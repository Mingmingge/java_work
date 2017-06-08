package com;

public class Student {
	private String sname ;
	private int sid ;
	
	public Student()
	{
		sname="unknow";
		sid = 0;
	}
	
	public Student(String name)
	{
		sname = name;
		sid = 0;
	}
	
	public Student(String name,int id)
	{
		sname = name;
		sid = id;
	}
	
	public void setName(String name)
	{
		sname = name;
	}
	
	public String getName()
	{
		return sname;
	}
	
//	public void setID(int id)
//	{
//		sid = id;
//	}
	
	public int getID()
	{
		return sid;
	}
	
	public void show()
	{
		System.out.println("name:"+ sname + ",sid:" + sid);
	}
	
	public boolean equals(Object obj)
	{
		if(obj == null)
			return false;
		if(obj.getClass()!= getClass())
			return false;
		if(this == obj)
			return true;
		Student other = (Student)obj;
		return this.sname.equals(other.sname) && this.sid == other.sid;
	}
	
}
