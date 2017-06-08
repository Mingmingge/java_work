package collectiondemo;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;

public class Demo2 {

	public static void main(String[] args) {

//		List<Person> list = new ArrayList<Person>();
//		list.add(new Person("p1", 21));
//		list.add(new Person("p2", 21));
//		list.add(new Person("p3", 22));
//		list.add(new Person("p4", 20));
//		list.add(new Person("p1", 21));
//
//		System.out.println(list);
//		
//		Iterator<Person> it = list.iterator();
//		
//		while(it.hasNext())
//		{
//			//Person p = (Person)it.next();
//			Person p = it.next();
//			if(p.getName().equals("p3"))
//				p.setAge(18);
//			p.showInfo();
//		}
		
		Collection<String> col = new ArrayList<String>();
		col.add("java01");
		col.add("java02");
		col.add("java01");
		col.add("java03");
		col.add("java04");
		
		String[] str = col.toArray(new String[col.size()]);
		for(String s:str)
		{
			System.out.println(s);
		}
		
		String[] str2 = {"hello","ok","java"};
		List<String> alist = Arrays.asList(str2);
		System.out.println(alist);

	}

}
