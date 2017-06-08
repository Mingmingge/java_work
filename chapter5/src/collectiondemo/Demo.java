package collectiondemo;

import java.util.*;

public class Demo {

	public static void main(String[] args) {
		Collection col = new ArrayList();
		col.add("java01");
		col.add("java02");
		col.add("java01");
		col.add("java03");
		col.add("java04");
		
		System.out.println(col);
		System.out.println(col.size());
		
		Collection col2 = new ArrayList();
		col2.addAll(col);
		
		System.out.println(col2);
		col2.remove("java03");
		System.out.println(col2);
		
		System.out.println(col2.isEmpty());
		
		
		
		
		

	}

}
