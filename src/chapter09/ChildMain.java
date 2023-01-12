package chapter09;

public class ChildMain {

	public static void main(String[] args) {

		Child child = new Child();
		
		child.method1(); // Parent 클래스
		child.method2(); // Child 클래스 (Override된 메서드)
		child.method3(); // Child 클래스

		System.out.println();
		Parent parent2 = child;
		parent2.method1();
		parent2.method2();
		//--------------------------------------------------------------------------------------------------------------------
		
		System.out.println();
		Parent parent1 = new Parent();
		parent1.method1();
		parent1.method2(); // 메서드를 Override 했을 경우 기존 부모 클래스의 메서드를 사용하려면 부모 클래스 객체 생성 후 호출해야 사용 가능
		
	}

}
