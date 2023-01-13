package chapter11;
//상속 받는 부모클래스에 추상메서드가 있으면 해당 추상 메서드에 대한 오버라이드 필요
//또는 abstract class 선언
public class DeskTop extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop Display()");

	}

	@Override
	public void typing() {
		System.out.println("DeskTop Typing()");
	}

	
}
