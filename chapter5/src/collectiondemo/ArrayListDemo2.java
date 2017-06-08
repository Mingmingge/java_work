package collectiondemo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("java001");
		alist.add("java002");
		alist.add("java001");
		alist.add("java003");
		alist.add("java002");
		alist.add("java004");
		
		alist = singleElement(alist);

		System.out.println(alist);
	}
	
	public static ArrayList<String> singleElement(ArrayList<String> alist)
	{
		ArrayList<String> newList = new ArrayList<String>();
		
		Iterator<String> it = alist.iterator();
		while(it.hasNext())
		{
			String s = it.next();
			if(!(newList.contains(s)))
				newList.add(s);
		}
		return newList;
	}

}
