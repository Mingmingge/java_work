package collectiondemo;

import java.util.List;
import java.util.Arrays;
import java.util.HashSet;

public class SetDemo {

	public static void main(String[] args) {
		String strBefor[] = {"1","2","4","6","2","4","3"}; 
		
		HashSet<String> hset = new HashSet<String>();
		
		List<String> list = Arrays.asList(strBefor);
		hset.addAll(list);
		
//		for(String s:strBefor)
//		{
//			hset.add(s);
//		}
		
		String[] strAfter =  hset.toArray(new String[hset.size()]);
		Arrays.sort(strAfter);
		
		System.out.println(hset);
		

	}

}
