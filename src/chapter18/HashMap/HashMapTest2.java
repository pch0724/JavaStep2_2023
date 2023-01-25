package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {

	public static void main(String[] args) {
		// Map map
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		//팀원 데이터(이름, 학번) 저장
		map.put("박창훈", 1);
		map.put("이석진", 2);
		map.put("박찬우", 3);
		map.put("이세정", 4);
		map.put("장준근", 5);
		map.put("한성무", 6);
		
		//팀원의 인원
		System.out.println("팀 인원 : " + map.size());
		System.out.println();
		
		//팀장의 학번
		System.out.println("팀장 학번");
		System.out.println(map.get("박창훈"));
		System.out.println();
		
		//팀원 모두의 학번 출력
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next(); //key 가져오기
			Integer value = map.get(key); // value 가져오기
			System.out.println("\t" + key + ":" + value);
		}//while
		System.out.println();
		
		//System.out.println("이름 : " + map.get("key");
		
	}//main

}//class
