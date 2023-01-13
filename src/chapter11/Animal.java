package chapter11;

public abstract class Animal {

	public String kind;
	
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	public abstract void sound();//추상 메서드
}
