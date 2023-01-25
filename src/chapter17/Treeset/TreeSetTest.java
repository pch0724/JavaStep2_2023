package chapter17.Treeset;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {

		TreeSet<String> treeSet =  new TreeSet<String>();
		
		treeSet.add("홍길동");
		treeSet.add("강감잔");
		treeSet.add("이순신");
		
		for(String str : treeSet) {//정렬 기본 : 오름차순
			System.out.println(str);
		}
		
	}

}
