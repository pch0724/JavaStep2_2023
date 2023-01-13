package chapter11;

public class PhoneMain {

	public static void main(String[] args) {

		//Phone phone = new Phone(); // 추상 클래스에 추상 메서드가 없으면 생산자 반드시 overload 해야함
		
		SmartPhone sp = new SmartPhone("김유신");
		
		System.out.println(sp.owner + "님");	
		sp.turnOn();
		sp.interSearch();
		sp.turnOff();
	
	}//m

}//c
