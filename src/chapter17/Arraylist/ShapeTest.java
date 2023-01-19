package chapter17.Arraylist;

import java.util.ArrayList;

class Shape{
	
	void draw() {
		System.out.println("draw Shape");
	}//d
	
}//S

class Circle extends Shape{

	@Override
	void draw() {
		System.out.println("draw Circle");
	}
	
	void circle() {
		System.out.println("원 모양 입니다.");		
	}
	
}//C

class Rectangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Rectangle");
	}
	
	void Rectangle() {
		System.out.println("사각형 모양 입니다.");		
	}
	
}//R

class Triangle extends Shape{
	
	@Override
	void draw() {
		System.out.println("draw Triangle");
	}
	
	void Triangle() {
		System.out.println("삼각형 모양 입니다.");		
	}
	
}//T


public class ShapeTest {

	//shape와 shape를 상속받은 모든 클래스 타입이 사용하는 ArrayList
	ArrayList <Shape> sList = new ArrayList <Shape>();
	
	public static void main(String[] args) {
		ShapeTest sTest = new ShapeTest();
		System.out.println("---- 업캐스팅 ----");
		sTest.addShape(); //Shape sc = new Circle
		System.out.println("---- 다운캐스팅 ----");
		sTest.testCasting();
	}//main
	
	public void addShape() {
		sList.add(new Circle()); // => Circle s = new Circle(); 생략 
		sList.add(new Rectangle());
		sList.add(new Triangle());
		
		for(Shape s : sList) {
			s.draw();
		}//for
	}//addShape
	
	public void testCasting() {
		
		for(int i = 0; i < sList.size(); i++) {
			Shape s = sList.get(i); // 부모(Shape) 타입으로 가져옴

			if(s instanceof Circle) {
				Circle c = (Circle)s; //다운캐스팅
				c.circle();
			}else if(s instanceof Rectangle) {
				Rectangle r = (Rectangle)s;
				r.Rectangle();
			}else if(s instanceof Triangle) {
				Triangle t = (Triangle)s;
				t.Triangle();
			}else {
				System.out.println("지원되지 않는 타입입니다.");
			}//if
			
		}//for
	
	}//testCasting
	
	
}//class


