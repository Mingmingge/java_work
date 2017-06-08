package ioexample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.channels.SeekableByteChannel;
import java.util.ArrayList;
import java.util.Iterator;

class Student implements Serializable
{
	private String name;
	private int cn;
	private int en;
	private int ma;
	private int sum;
	
	public Student(String name,int cn,int en,int ma)
	{
		this.name = name;
		this.cn = cn;
		this.en = en;
		this.ma = ma;
		this.sum = this.cn + this.en + this.ma;
	}
	
	public String show()
	{
		return "Student[" + name + "," + cn + ","+
						en + "," + ma + "]" ;
	}
	
	public int getSum()
	{
		return sum;
	}
	
}

public class StudentInfoDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		ArrayList<Student> alist = getStudentInfo();
		write2File2(alist);
//		write2File(alist);
//		readStudens();
		

	}
	
	public static ArrayList<Student> getStudentInfo() throws IOException
	{
		ArrayList<Student> alist = new ArrayList<Student>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = null;
		
		while(true)
		{
			line = br.readLine();
			if("over".equals(line))
				break;
			String[] str = line.split(",");
			Student s = new Student(str[0],Integer.parseInt(str[1]),
					Integer.parseInt(str[2]),Integer.parseInt(str[3]));
			alist.add(s);
		}
		
		br.close();
		return alist;
	}

	public static void  write2File(ArrayList<Student> alist) throws FileNotFoundException, IOException
	{
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("e:\\obj.txt"));
		oos.writeInt(alist.size());
		Iterator<Student> it = alist.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			oos.writeObject(s);			
		}
		
		oos.close();
	}

	public static  void readStudens() throws IOException, ClassNotFoundException
	{
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e:\\obj.txt"));
		int num = ois.readInt();
		
		for(int i = 0;i < num;i++)
		{
			Student s = (Student)ois.readObject();
			System.out.println(s.show() + " " + s.getSum());
		}
	}

	public static void write2File2(ArrayList<Student> alist) throws IOException
	{
		BufferedWriter bw = new BufferedWriter(new FileWriter("e:\\obj2.txt"));
		
		for(Student s:alist)
		{
			bw.write(s.show() + " " + s.getSum());
			bw.newLine();
			bw.flush();
		}
		
		bw.close();
	}
}
