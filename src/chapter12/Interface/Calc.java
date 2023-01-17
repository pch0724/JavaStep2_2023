package chapter12.Interface;

public interface Calc {

	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() { //default??
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //private method
	}
	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr) {
			total+=i;
		}
		myStaticMethod(); // private method 호출
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 입니다.");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 입니다.");
	}
	
	//인터페이스 : 건물의 뼈대
	//인터페이스 구성요소
	/*
	 - 추상 메서드 : body가 없는 메서드 사용시 무조건 override 필요
	    --자바 8부터 제공--
	 - 디폴트 메서드 : 기본 수행문을 가질 수 있는 메소드이며 재정의(override)를 할 수 있다.
	 - 정적(static) 메서드 : 객체 생성과 관계 없이 인터페이스 타입(class 명)으로 사용할 수 있다.
	 - private 메서드 : 인터페이스를 구현한 클래스 내부에서만 사용 가능 / override가 불가능
	 				   즉, 인터페이스(현재의 클래스)에서만 사용하기 위함
	 */
	
}
