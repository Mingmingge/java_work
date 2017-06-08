package mapdemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class AvgAgeDemo {

	public static void main(String[] args) {
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(new Student("s1", 20, "class1"));
		al.add(new Student("s2", 22, "class1"));
		al.add(new Student("s3", 18, "class2"));
		al.add(new Student("s4", 21, "class1"));
		al.add(new Student("s5", 22, "class2"));
		al.add(new Student("s6", 20, "class2"));
		
		HashMap<String,ArrayList<Student>> hmap = new HashMap<String, ArrayList<Student>>();
		
		Iterator<Student> it = al.iterator();
		while(it.hasNext())
		{
			Student s = it.next();
			String clsName = s.getCls();
			
			if(!(hmap.containsKey(clsName)))
			{
				ArrayList<Student> alist = new ArrayList<Student>();
				alist.add(s);
				hmap.put(clsName, alist);
			}
			else {
				ArrayList<Student> alist = hmap.get(clsName);
				alist.add(s);
			}
		}
		
		Set<String> keyset = hmap.keySet();
		Iterator<String > keyit = keyset.iterator();
		while(keyit.hasNext())
		{
			String clsName = keyit.next();
			ArrayList<Student> stulist = hmap.get(clsName);
			double sum = 0.0;
			for(Student s :stulist)
			{
				sum += s.getAge();
			}
			System.out.println(clsName + "的平均年龄为：" + sum/stulist.size());
		}
		
		
		
		
	}

}
