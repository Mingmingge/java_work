package com;

public class User {
	private String userName;
	private String passWord;
	private String email;
	private static int num = 0;
	
	public User(String userName,String passWord)
	{
		this.userName = userName;
		this.passWord = passWord;
		num++;
		System.out.println("User(uname,pw)...");
	}
	
	public User(String userName,String passWord,String email)
	{
		this(userName,passWord);
		this.email = email;
		System.out.println("User(uname,pw,email)....");
	}
	
	public String getUserName()
	{
		return userName;
	}
	
	public void setUserName(String uname)
	{
		userName = uname;
	}
	
	public static int getNum()
	{
		return num;
	}
	
	public void print()
	{
		System.out.println(userName + " " + num);
	}
	
	public String getEmail()
	{
		return email;
	}
	
	
}
