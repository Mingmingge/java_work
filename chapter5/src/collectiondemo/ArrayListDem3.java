package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDem3 {

	public static void main(String[] args) {
		ArrayList<Person> alist = new ArrayList<Person>();
		alist.add(new Person("p1", 21));
		alist.add(new Person("p2", 22));
		alist.add(new Person("p3", 20));
		alist.add(new Person("p1", 21));
		alist.add(new Person("p3", 20));
		
		alist = singleElement(alist);

		Iterator<Person> it = alist.iterator();
		while(it.hasNext())
		{
			Person p = it.next();
			System.out.println(p.getName() + " " + p.getAge());
		}
		

	}
	
	public static ArrayList<Person> singleElement(ArrayList<Person> alist)
	{
		ArrayList<Person> newList = new ArrayList<Person>();
		
		Iterator<Person> it = alist.iterator();
		while(it.hasNext())
		{
			Person s = it.next();
			if(!(newList.contains(s)))
				newList.add(s);
		}
		return newList;
	}


}
