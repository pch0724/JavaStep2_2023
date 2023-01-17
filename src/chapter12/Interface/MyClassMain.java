package chapter12.Interface;

public class MyClassMain {

	public static void main(String[] args) {
		// X,Y, MyInterface 클래스 타입의 변수를 선언하여 출력
		MyClass mc = new MyClass();
		
		mc.x();
		mc.y();
		mc.myMethod();
		System.out.println("------------------------");
		
		X x = mc;//X 클래스 타입의 인스턴스 변수(보유 메서드 : x())
		x.x();
		System.out.println("------------------------");
		
		Y y = mc;//Y 클래스 타입의 인스턴스 변수(보유 메서드 : y())
		y.y();
		System.out.println("------------------------");
		
		MyInterface mi = mc;//MyInterface 클래스 타입의 인스턴스 변수(보유 메서드 : x(),y()[상속 메서드]  + myMethod()[자체 메서드] 
		mi.x();
		mi.y();
		mi.myMethod();
		
	}

}
