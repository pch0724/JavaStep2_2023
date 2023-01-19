package chapter14.Clone;

public class Point {

	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() { // 객체를 호출했을때는 16진수의 Hashcode가 반환되지만 toString을 통해 객체의 데이터 값을 호출함
		
	
		return "x = " + x + ", y =" + y;
	}
	
	
	
}
