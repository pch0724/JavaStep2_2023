package chapter09;

public class C extends A{

	public C() {
		super();//부모 클래스 생성자 컴파일
		this.field = "value";
		this.method();
	}
		
	
	public static void main(String[] args) {
		C obj = new C(); //자식 클래스
		obj.method(); //부모 클래스
	}
}
