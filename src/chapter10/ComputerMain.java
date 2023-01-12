package chapter10;

public class ComputerMain {

	public static void main(String[] args) {

		int r = 10;
		Calculator cal = new Calculator();
		Computer com = new Computer();
		
		double pi = cal.areaCircle(r);
		System.out.println("반지름이 " + r + "인 원의 넓이는 " +  (double)(r*r*pi));
		
		System.out.println(com.areaCircle(r));
	}

}
