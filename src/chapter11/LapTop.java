package chapter11;

public abstract class LapTop extends Computer {
// 부모클래스의 추상 메서드가 여러 개 일때 추상 메서드 전체를 override 하지 않으면 abstract class 선언 필요
// ex. 부모클래스 추상 메서드 : 4개 => 자식 클래스 override : 3개  ==> 자식클래스 : abstract class 선언
	@Override
	public void display() {
		System.out.println("LapTop Display");

	}

	
	
}
