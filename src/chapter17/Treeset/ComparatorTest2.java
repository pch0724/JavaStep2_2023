package chapter17.Treeset;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String o1, String o2) {
		
		return (o1.compareTo(o2)) * -1; // *-1 : 내림차순
	}
	
}

public class ComparatorTest2 {

	public static void main(String[] args) {
		//오름차순
		Set<String> set = new TreeSet<String>();
		
		set.add("aaa");
		set.add("ddd");
		set.add("hhh");
		set.add("bbb");
		
		System.out.println(set);
		
		//내림차순
		Set<String> set2 = new TreeSet<String>(new MyCompare());
		
		set2.add("aaa");
		set2.add("ddd");
		set2.add("hhh");
		set2.add("bbb");
		
		System.out.println(set2);
		
	}

}
