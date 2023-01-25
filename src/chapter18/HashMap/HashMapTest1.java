package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("김치", 85);
		map.put("홍길동", 90);
		map.put("박수", 98);
		map.put("동장군", 75);
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		//객체 찾기
		/*
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		System.out.println("\t박수 : " + map.get("박수"));
		System.out.println("\t김치 : " + map.get("김치"));
		System.out.println("\t동장군 : " + map.get("동장군"));
		*/
		
		//Iterator 활용
		Set<String> keySet = map.keySet(); // keySet = { 김치, 홍길동, 박수, 동장군 } | .keySet() : 객체 가져오기
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //키받기
			Integer value = map.get(key); // 키를 이용하여 값 받기
			System.out.println("\t" + key + " : " + value);
		}//while
		
		System.out.println();
		
		//해당 key에 해당하는 객체만 삭제
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println();
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet(); // Entry를 한번에 다 땡겨옴
		
		Iterator<Map.Entry<String, Integer>> entryIt = entrySet.iterator();
		
		while(entryIt.hasNext()) {
			Map.Entry<String, Integer> entry = entryIt.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);			
		}
		System.out.println();
		
		//객체 전체 삭제
		map.clear();
		System.out.println("총 Entry 수 : " + map.size());
	}//main

}//class
