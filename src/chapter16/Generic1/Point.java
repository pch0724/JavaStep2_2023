package chapter16.Generic1;

public class Point<T,V> {

	//멤버변수
	T x;
	V y;
	
	public Point(T x, V y) {
		this.x = x;
		this.y = y;
	}

	public T getX() {
		return x;
	}

	public V getY() {
		return y;
	}
	
	
}
