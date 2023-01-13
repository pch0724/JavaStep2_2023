package chapter11;

public abstract class Computer { // abstract class : 해당 클래스에는 하나 이상의 추상 메서드가 존재함 

	//추상 메서드(abstract) : Body가 없음 | 추상 메서드가 '하나'라도 있으면 Class에 abstract 선언 필요 | 사용 시 override 활용 
	public abstract void display();  // 하위 클래스 구현해서 사용하라는 의미
	public abstract void typing();
	
	//일반 메서드
	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
}
