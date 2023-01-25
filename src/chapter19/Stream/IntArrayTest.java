package chapter19.Stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayTest {

	public static void main(String[] args) {

		int[] arr = {1,2,3,4,5};
		
		//한번 생성된 스트림은 재 사용시 다시 생성해야함 ???
		// 합계 | sum()은 Integer로 반환하므로 int로 받아야함
		int sumVal =Arrays.stream(arr).sum(); 
		// 개수 | Arrays.stream().count() : long 타입 => 다운캐스팅 필요
		int count =(int)Arrays.stream(arr).count(); 
		
		System.out.println("arr[]의 합계 : " + sumVal);
		System.out.println("arr[]의 개수 : " + count);
		
		/*
		//int => IntStream 형변환
		IntStream stream=Arrays.stream(arr);
		int a = stream.sum();
		int b = (int)stream.count();
		System.out.println(a);
		System.out.println(b);
		//이미 사용되었으므로 소멸된 Stream => 호출 시 error => 재선언 필요
		*/
		
		//reduce(초기값, 전달되는 요소 -> 각 요소가 수행해야 하는 기능)
		System.out.println(Arrays.stream(arr).reduce(0, (c,d) -> c+d));
	}//main

}//class
