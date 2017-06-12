package t_8;

import java.util.ArrayList;
import java.util.Iterator;

class StudentT8
{
	//学号，姓名，班号，课程名，成绩
	private int sid;
	private String name;
	private String cls;
	private String courseName;
	private int score;
	
	public StudentT8(int sid,String name,String cls,String courseName,int score)
	{
		this.sid = sid;
		this.name = name;
		this.cls = cls;
		this.courseName = courseName;
		this.score = score;
	}
	
	//获得班号getClass(),课程号getCourse()，获得成绩getScore()，toString()方法
	public String getCls()
	{
		return cls;
	}
	
	public String getCourse()
	{
		return courseName;
	}
	
	public int getScore()
	{
		return score;
	}
	
	public String toString()
	{
		return sid + "," + name + "," + cls + "," + courseName + "," + score;
	}
	
}

public class T8 {

	public static void main(String[] args) {
		ArrayList<StudentT8> alist = new ArrayList<StudentT8>();
		alist.add(new StudentT8(1, "s1", "class1", "C++", 90));
		alist.add(new StudentT8(2, "s2", "class1", "java", 92));
		alist.add(new StudentT8(3, "s3", "class2", "C++", 92));
		alist.add(new StudentT8(4, "s4", "class2", "sql", 90));
		alist.add(new StudentT8(5, "s5", "class1", "C++", 96));
		
		double sum = 0;
		int num = 0;
		Iterator<StudentT8> it = alist.iterator();
		while(it.hasNext())
		{
			StudentT8 s = it.next();
			if(s.getCourse().equalsIgnoreCase("C++"))
			{
				sum += s.getScore();
				num++;
			}
		}
		System.out.println("c++课程的平均分为：" + sum/num);

	}

}
