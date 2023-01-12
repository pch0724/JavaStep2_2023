package chapter09;
//상속 : 부모 클래스에 있는 요소들을 자식 클래스가 사용 가능(필드, 생성자(오버로딩), 메서드 등)
public class Berry extends Fruit{//자식(부모의 것을 상속받음)
	
	private String name;
	private String size;
	
	//생성자
	
	//setter
	public void Set2(String a, String b) {
		name = a;
		size = b;
	}
		
	//getter
	public void Disp2() {
		System.out.println("이름 : " + name);
		System.out.println("크기 : " + size);
	}
	
}
