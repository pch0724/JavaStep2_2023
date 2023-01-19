package chapter14.String;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

	public static void main(String[] args) {

		Date now = new Date();
		//System.out.println(now);
		String strNow = now.toString(); //toString : 객체 (Heap메모리) -> String 타입으로 변환
		System.out.println("--------DATA---------");
		System.out.println(strNow);
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String strNow2 = sdf.format(now);
		//String strNow2 = sdf.toString(); // 객체 반환(heap)
		System.out.println("-------SimpleDateFormat---------");
		System.out.println(strNow2);
		
		
	}

}
