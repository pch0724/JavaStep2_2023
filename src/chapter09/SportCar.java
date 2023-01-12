package chapter09;

public class SportCar extends Car{

	@Override
	void speedUp() {
		speed += 10;
		System.out.println("speed : " + speed);
	}
	
	/*
	void stop() {
		System.out.println("스포츠카가 멈춥니다."); // 같은 이름의 메서드가 부모클래스에서 final 선언되었으므로 Override가 불가능함
		speed = 0;
	}
	*/
	
	public static void main(String[] args) {

		Car c = new Car();
		SportCar ac = new SportCar();
		
		ac.speedUp();
		System.out.println(ac.speed);
		ac.stop();
		
		
	}

}
