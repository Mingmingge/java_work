package collectiondemo;

import java.util.Comparator;
import java.util.List;
import java.util.Arrays;
import java.util.TreeSet;

class MyCompartor2 implements Comparator<String>
{
	public int compare(String o1,String o2)
	{
		return o1.compareToIgnoreCase(o2);
	}
}

public class TSetDemo {

	public static void main(String[] args) {

		String str[] = {"abc","de","gong","De","abc","Foo","gong"};
		
		List<String> al = Arrays.asList(str);
		
		TreeSet<String> tset = new TreeSet<String>(new MyCompartor2());
		tset.addAll(al);
		
		System.out.println(tset);

	}

}
