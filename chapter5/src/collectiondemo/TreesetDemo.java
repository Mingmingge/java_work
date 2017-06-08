package collectiondemo;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Mycompartor implements Comparator<String>
{
	public int compare(String o1, String o2)
	{
		return -o1.compareToIgnoreCase(o2);
	}
}

public class TreesetDemo {

	public static void main(String[] args) {
//		TreeSet<String> tset = new TreeSet<String>(new Mycompartor());
//		tset.add("hello");
//		tset.add("abc");
//		tset.add("world");
//		tset.add("thank");
//		tset.add("Tom");
//		
//		System.out.println(tset);
		
		TreeSet<Person> tset2 = new TreeSet<Person>();
		tset2.add(new Person("p1", 21));
		tset2.add(new Person("p2", 20));
		tset2.add(new Person("p3", 22));
		tset2.add(new Person("p4", 23));
		tset2.add(new Person("p5", 22));
		
		Iterator<Person> it = tset2.iterator();
		while(it.hasNext())
		{
			it.next().showInfo();
		}
				

	}

}
