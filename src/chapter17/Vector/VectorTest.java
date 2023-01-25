package chapter17.Vector;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {

		Object obj;
		//크기 1의 배열 선언
		Vector<Object> vec = new Vector<Object>(1);//(n) :크기 지정
		
		obj=20221227;
		vec.addElement(obj); //element(요소) 추가
		System.out.println("용량은 #1 : " + vec.capacity()); //capacity : 용량
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #1 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="some people";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름
		System.out.println("용량은 #2 : " + vec.capacity()); //capacity : 용량
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #2 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="dream of success";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름
		System.out.println("용량은 #3 : " + vec.capacity()); //capacity : 용량 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #3 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="while";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름
		System.out.println("용량은 #4 : " + vec.capacity()); //capacity : 용량 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #4 : " + vec.size()); //size : 크기
		System.out.println();

		obj="outer people";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름 
		System.out.println("용량은 #5 : " + vec.capacity()); //capacity : 용량 // 요소를 하나하나 추가할때마다 2의 진수만큼 증가 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #5 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="get up";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름 
		System.out.println("용량은 #6 : " + vec.capacity()); //capacity : 용량 // 요소를 하나하나 추가할때마다 2의 진수만큼 증가 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #6 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="up";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름 
		System.out.println("용량은 #7 : " + vec.capacity()); //capacity : 용량 // 요소를 하나하나 추가할때마다 2의 진수만큼 증가 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #7 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="down";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름 
		System.out.println("용량은 #8 : " + vec.capacity()); //capacity : 용량 // 요소를 하나하나 추가할때마다 2의 진수만큼 증가 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #8 : " + vec.size()); //size : 크기
		System.out.println();
		
		obj="left";
		vec.addElement(obj); //element(요소) 추가 // 객체와 element는 다름 
		System.out.println("용량은 #9 : " + vec.capacity()); //capacity : 용량 // 요소를 하나하나 추가할때마다 2의 진수만큼 증가 
		//vector 저장되어 있는 element의 수
		System.out.println("크기는 #9 : " + vec.size()); //size : 크기
		System.out.println();
		
		// size는 요소를 추가하는 만큼 늘어남
		// capacity는 요소를 추가하는 경우 2의 진수에 미리 확보함 ex) 요소 5개 추가 시 용량은 8로 확보, 13번째 요소를 추가할때는 16까지 미리확보
		
		System.out.println(vec);
		
		
		
	}

}
