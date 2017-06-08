package mapdemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Demo2 {

	public static void main(String[] args) {
		HashMap<String,Student> hmap = new HashMap<String, Student>();
		
		hmap.put("01",new Student("s1", 21, "class1"));
		hmap.put("02",new Student("s2", 22, "class2"));
		hmap.put("03",new Student("s3", 24, "class1"));
		hmap.put("04",new Student("s4", 22, "class2"));
		hmap.put("05",new Student("s5", 20, "class1"));
		
		Set<String> keyset = hmap.keySet();
		Iterator<String> it = keyset.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			Student s = hmap.get(key);
			System.out.print(key +":");
			s.show();
		}
		

	}

}
