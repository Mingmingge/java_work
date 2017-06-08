package collectiondemo;

import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> col = new ArrayList<String>();
		col.add("java01");
		col.add("java02");
		col.add("java01");
		col.add("java03");
		col.add("java04");
		
		ListIterator<String> it = col.listIterator();
		while(it.hasNext())
		{
			if(it.next().equals("java03"))
				it.set("java007");
				//it.remove();
		}
		
		System.out.println(col);
		
		col.add(2,"java009");
		System.out.println(col);
		col.set(3,"java008");
		System.out.println(col);
		
		for(int i = 0;i < col.size();i++)
		{
			System.out.println(col.get(i));
		}
		
		col.add("java02");
		System.out.println(col);
		
		System.out.println(col.indexOf("java02"));
		System.out.println(col.lastIndexOf("java02"));
		
		List<String> list2 = col.subList(2, 5);
		System.out.println(list2);
		
	}

}
