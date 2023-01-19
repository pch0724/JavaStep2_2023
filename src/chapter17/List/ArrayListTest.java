package chapter17.List;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();
		
		list.add("Java");
		list.add("Oracle");
		list.add("Servlet/JSP");
		list.add(2, "Spring");
		list.add("Python");
		
		int size = list.size();
		System.out.println("총 객체 수 : " + size);
		System.out.println();
		
		String skill = list.get(2);
		System.out.println("2 : " + skill); // 15번 라인에서 Spring의 index를 2로 지정했기 때문에 Spring = 2 | Servlet/JSP = 3

		System.out.println("==============================================");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
		list.remove(2); // 3 : Servlet/JSP 가 index 2로 당겨짐
		list.remove(2); // 3 : Python => index 2
		list.remove("Python"); // 2 : Python 삭제
		
		System.out.println("==============================================");
		for(int i = 0; i < list.size(); i++) {
			String str = list.get(i);
			System.out.println(i + " : " + str);
		}
		System.out.println();
		
	}

}
