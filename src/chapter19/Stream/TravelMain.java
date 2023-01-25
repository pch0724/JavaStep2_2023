package chapter19.Stream;

import java.util.ArrayList;
import java.util.List;

public class TravelMain {

	public static void main(String[] args) {

		List<TravelCustomer> customerList = new ArrayList<TravelCustomer>();
		
		//객체 생성
		TravelCustomer tc1 = new TravelCustomer("홍길동", 15, 15000);
		TravelCustomer tc2 = new TravelCustomer("김유신", 70, 20000);
		TravelCustomer tc3 = new TravelCustomer("이순신", 50, 50000);
		
		//추가
		customerList.add(tc1);
		customerList.add(tc2);
		customerList.add(tc3);
		
		System.out.println("==고객 명단 추가된 순서대로 출력==");
		//map : 데이터를 특정 조건과 매칭
		customerList.stream().map(c -> c.getName()).forEach(c -> System.out.println(c));
		//mapToInt : int형 자료로 변환
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 수입 : " + total);
		//filter : 특정 조건에 맞는 데이터만 추출
		customerList.stream().filter(c -> c.getAge() >= 20)
							 .map(c -> c.getName()).sorted() // filter 사용 중 sorted 사용해야하면 map 우선 실행
							 .forEach(c -> System.out.print(c + " "));
	}

}
