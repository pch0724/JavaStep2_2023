package chapter11;

public class MyLapTop extends LapTop{ 
// 부모 클래스의 추상 메서드를 모두 override 하지 않고, abstract class 선언도 안하려고 할때
// 기존 부모 클래스를 상속 받는 것이 아닌, 기존 부모클래스를 상속 받은 자식 클래스를 부모클래스로 하여 상속 받아야함
	

	@Override
	public void typing() {
		System.out.println("MyLapTop Typing");
	
	}
}
