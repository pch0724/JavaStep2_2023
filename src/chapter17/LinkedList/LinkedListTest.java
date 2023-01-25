package chapter17.LinkedList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		// 특정 인덱스에서 객체를 제거하거나 추가하게 되면 바로 앞 뒤 링크로 연결
		// 빈번한 객체 삭제 삽입이 일어나는 곳에서는 ArrayList보다 성능이 좋다
		
		LinkedList<String> mylist = new LinkedList<String>();
		
		mylist.add("A");
		mylist.add("B");
		mylist.add("C");
		
		System.out.println(mylist);
		
		mylist.add(1, "D");
		System.out.println(mylist);

		mylist.addFirst("O");
		System.out.println(mylist);
		mylist.removeLast();
		System.out.println(mylist);
		
		mylist.addLast("G");
		System.out.println(mylist);
	}

}
