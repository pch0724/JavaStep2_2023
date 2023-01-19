package chapter14.hashcode;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {

		//Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>(); // Key는 String을 꺼내기 위한 단서
		
		System.err.println(hashMap);
		
		//식별키의 객체를 이용하여 이름을 반환
		hashMap.put(new Key(1), "홍길동");//hascode Key 값(주소)을 1로 지정하고 String에 "홍길동" 값을 저장
		
		System.out.println(hashMap); // {chapter14.hashcode.Key@1877ab81=홍길동} => {chapter14.hashcode.Key@1=홍길동} 
		
		hashMap.put(new Key(1), "홍길동");//hascode 주소를 1로 지정
		hashMap.put(new Key(2), "김유신");//hascode 주소를 2로 지정
		
		System.out.println(hashMap); // 주소값의 반환은 16진수로 이루어짐 => ex. 주소값 10 => a로 반환 
	}//main

}//class
