package chapter09;

public class ChildMain {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.method1(); // Parent 클래스
		child.method2(); // Child 클래스 (Override된 메서드)
		child.method3(); // Child 클래스
		
		System.out.println();
		
		Parent parent = new Parent();
		parent.method1();
		parent.method2();
	}

}
