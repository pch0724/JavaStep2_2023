package chapter17.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayEx1 {

	public static void main(String[] args) {
		//Collection => List => ArrayList
		ArrayList<Integer> list = new ArrayList<Integer>();
		System.out.println("list.size() : " + list.size());
		
		list.add(100);
		list.add(20);
		System.out.println("list.size() : " + list.size());
		
		for(int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i) + " ");
			//인덱스로 접근하는 구조는 깊이가 있으면 있을수록 처리 속도가 느려짐
			//위의 문제점을 해결하기 위해 Iterator 사용
		}//f
		System.out.println();
		
		System.out.println("----------------------------------------------");
		//Collection 은 Iterator 사용
		//1) List 구조의 자원을 반복자로 변환
		Iterator<Integer> it = list.iterator(); //Iterator : Collection | list : ArrayList 객체
		
		//2) 반복자를 반복문으로 수행 // **로그인 코딩에 활용** 
		while(it.hasNext()){	//hasNext() : 반복자 안에서 커서가 이동
			int v = it.next(); // UnBoxing (객체 => 기본자료형)
			System.out.println(v);
		}
	}//m

}//c
