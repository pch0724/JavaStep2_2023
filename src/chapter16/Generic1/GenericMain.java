package chapter16.Generic1;

public class GenericMain {

	public static <T,V> double makeReckangle(Point<T, V> p1, Point<T, V> p2) { // 매개변수로 Generic 타입이 들어갈 수 있음
		double left = ((Number)p1.getX()).doubleValue(); //왼쪽 T
		double top = ((Number)p1.getY()).doubleValue(); //위쪽 V
		// double로 캐스팅 해도 괜찮음
		double right = ((Number)p2.getX()).doubleValue(); //오른쪽 T
		double bottom = ((Number)p2.getY()).doubleValue(); //오른쪽 V
		
		double wide = right - left;
		double height = bottom - top;
		
		return wide * height;
	}
	
	public static void main(String[] args) {
		
		Point<Integer, Double> p1 = new Point<Integer, Double>(0, 0.0);
		Point<Integer, Double> p2 = new Point<>(10, 10.0);
		
		double rect = GenericMain.<Integer, Double>makeReckangle(p1, p2);
		System.out.println("두 point로 만들어진 사각형의 넓이 : " + rect);
		
		
	}

}
