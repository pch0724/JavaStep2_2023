package chapter09;

public class Car {

	int speed;
	
	void speedUp() {
		speed++;
	}
	
	final void stop() {
		System.out.println("스포츠카가 멈춥니다.");
		speed = 0;
	}

}
