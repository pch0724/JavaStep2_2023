package chapter09;

public class A {
	// 같은 패키지에서는 protected = public 기능
	// 다른 패키지에서는 protected = private 기능 (메서드를 통해서만 호출 가능)
	protected String field;//protected : public이지만 상속 전용 
		
	// DC
	
	protected void method() {
		System.out.println("A Class");
		System.out.println(field);
	}
	
}//c
