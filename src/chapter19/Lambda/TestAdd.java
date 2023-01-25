package chapter19.Lambda;

public class TestAdd {

	public static void main(String[] args) {
		// Lambda : 메서드 이름이 없음 구현부만 존재함
		Add addF =(x,y)-> x+y;// (매개변수) -> 구현부 // c언어의 포인터 개념?
		
		System.out.println(addF.add(3, 5));
	}

}
