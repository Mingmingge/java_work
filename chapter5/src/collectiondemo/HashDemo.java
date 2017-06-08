package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

class A
{
//	public int hashCode()
//	{
//		return 60;
//	}
	
}

public class HashDemo {

	public static void main(String[] args) {
		
//		A a1 = new A();
//		A a2 = new A();
//		System.out.println(a1);
//		System.out.println(a2);
//		
//		if(a1.equals(a2))
//			System.out.println("a1==a2");
//		else {
//			System.out.println("a1!=a2");
//		}
		
//		HashSet<String> hset = new HashSet<String>();
//		hset.add("java01");
//		hset.add("java02");
//		hset.add("java01");
//		hset.add("java03");
//		hset.add("java02");
//		
//		System.out.println(hset);
		
		HashSet<Person> hset = new HashSet<Person>();
		hset.add(new Person("p1", 21));
		hset.add(new Person("p2", 20));
		hset.add(new Person("p1", 21));
		hset.add(new Person("p3", 22));
		hset.add(new Person("p2", 20));
		
		Iterator<Person> it = hset.iterator();
		while(it.hasNext())
		{
			it.next().showInfo();
		}
		
		
	}

}
