package chapter18.HashMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTable {

	public static void main(String[] args) {
		//HashTable : 동기화
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("Spring", "123");
		map.put("Summer", "1234");
		map.put("Fall", "12345");
		map.put("Winter", "123456");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" LOGIN ");
			System.out.print("ID >");
			String id = sc.next();
			
			if(map.containsKey(id)) {
				System.out.print("PW >");
				String pw = sc.next();
				if(map.get(id).equals(pw)) {			
					System.out.println("LOGIN SUCCESS");
					break;
					
				}else {
					System.out.println("PW ERROR");
				}//inner if
			}else {
				System.out.println("ID ERROR");
			}//outer if
			System.out.println();
		}//while
		
	}//main

}//class
