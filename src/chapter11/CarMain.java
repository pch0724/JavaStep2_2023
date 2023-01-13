package chapter11;

public class CarMain {

	public static void main(String[] args) {
		System.out.println("AI Car");
		car(new AICar());
		System.out.println("------------------------------");
		System.out.println("Manual Car");
		car(new ManualCar());
		
	}
	
	public static void car(Car car) {
		car.run();
	}
	
}
