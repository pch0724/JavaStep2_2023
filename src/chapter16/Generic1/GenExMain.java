package chapter16.Generic1;

public class GenExMain {

	public static void main(String[] args) {
		//사용자가 원하는 형태로 객체 생성
		//Generic Type 객체는 기본자료형(int, double, float, char 등) 인식할 수 없음
		//그러므로 오토박싱하여 사용
		GenEx<String> v1 = new GenEx<>();
		v1.setValue("100");
		System.out.println(v1.getValue());
		
		//정수
		GenEx<Integer> v2 = new GenEx<>();
		v2.setValue(7777);
		System.out.println(v2.getValue());

		//실수
		GenEx<Double> v3 = new GenEx<>();
		v3.setValue(3.141592);
		System.out.println(v3.getValue());
		
		//문자
		GenEx<Character> v4 = new GenEx<>();
		v4.setValue('A');
		System.out.println(v4.getValue());
	}
}
