package ioexample;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Students implements Serializable
{
	String name;
	int age;
	
	static final long serialVersionUID = 67L;

	
	public Students(String name,int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String toString()
	{
		return name + " ," + age;
	}
}

public class ObjectDemo {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
//		Student s = new Student("s1", 21);
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\obj.txt"));
//		oos.writeObject(s);
//
//		oos.close();
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\obj.txt"));
		Students ss = (Students)ois.readObject();
		System.out.println(ss);
	}

}
