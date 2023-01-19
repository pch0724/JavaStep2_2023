package chapter17.List;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

	public static void main(String[] args) { //List > ArrayList
		// 리스트구조를 갖는 ArrayList 클래스의 객체 생성
		//String[] ls1 = {};//배열 = fixed length : 수정, 추가, 삭제가 어려움
		List<String> ls = new ArrayList<String>();
		// 리스트에 데이터 추가
		ls.add("Hi!"); //index 0
		ls.add("Happy!"); // 1
		ls.add("Nice!"); // 2
		
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i)); // String 외 다른 데이터 형은 hashcode로 반환되므로 toString()이 필요함
		}
		System.out.println();
		System.out.println("----데이터 추가후----");
		ls.add(3, "Good");
		
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i)); // String 외 다른 데이터 형은 hashcode로 반환되므로 toString()이 필요함
		}
		System.out.println();
		System.out.println("----데이터 추가후----");
		ls.remove(0); // index 0이 삭제되지만 0이 비는 것이 아닌 1번이 0번이 되는 식으로 당겨짐
		for (int i = 0; i < ls.size(); i++) {
			System.out.println(i + " : " + ls.get(i)); // String 외 다른 데이터 형은 hashcode로 반환되므로 toString()이 필요함
		}
		System.out.println();
		
	}

}
