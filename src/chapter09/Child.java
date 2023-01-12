package chapter09;

public class Child extends Parent {

	//overloading : 기본생산자와 같은 이름의 메서드 생산할때 쓰는데 조건으로는 매개변수의 이름, 갯수가 달라야함
	//override : 부모클래스의 메서드의 이름과 같은 메서드를 생산할때 사용하는데, overload와 다르게 부모클래스로부터 상속 받을 때 사용가능하며, 매개변수의 이름이나 갯수가 다르지 않아도 된다
	//통일성, 다형성을 목적으로 사용
	@Override // Override => 부모클래스의 메서드 내의 수행문을 수정 // 기존 부모클래스의 메서드는 기존 형태를 유지함 
	public void method2() {
		//super.method2(); => 부모클래스의 메서드에 요소를 추가하거나 할때는 유지
		System.out.println("Child - Method2()");
	}
	
	public void method3() {
		//super.method2(); => 부모클래스의 메서드에 요소를 추가하거나 할때는 유지
		System.out.println("Child - Method3()");
	}

	
	
}
