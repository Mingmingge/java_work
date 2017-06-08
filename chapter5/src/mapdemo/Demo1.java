package mapdemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		HashMap<String,String> hmap = new HashMap<String, String>();
		hmap.put("01", "java01");
		hmap.put("02", "java02");
		hmap.put("03", "java03");
		hmap.put("04", "java04");
		hmap.put("02", "java007");	
		
		System.out.println(hmap);
		
		System.out.println(hmap.containsKey("03"));
		System.out.println(hmap.containsValue("008"));
		
		hmap.remove("02");
		System.out.println(hmap);
		
		System.out.println(hmap.get("03"));
		
		Collection<String> col = hmap.values();
		Iterator<String> it = col.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		Set<String> keyset = hmap.keySet();
		
		it = keyset.iterator();
		while(it.hasNext())
		{
			String key = it.next();
			String value = hmap.get(key);
			System.out.println(key + "====" + value);

		}
		
		Set<Map.Entry<String, String>> entryset = hmap.entrySet();
		Iterator<Map.Entry<String,String>> iter = entryset.iterator();
		while(iter.hasNext())
		{
			Map.Entry<String, String> entry =  iter.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "==========" + value);
		}
		

	}

}
