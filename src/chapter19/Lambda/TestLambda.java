package chapter19.Lambda;

interface PrintString{
	
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {

		//람다식
		PrintString ps = s -> System.out.println(s); // 함수명을 변수명으로 대체
		
		showMyString(ps);
		
		PrintString reStr= returnString(); // returnString() 메서드 안의 람다식 구현부 호출
		reStr.showString("hello");
		
	} // main

	public static void showMyString(PrintString p) { // 매개변수 구현 => p가 body
		p.showString("hello lambda");
	}//showMyString
	
	public static PrintString returnString() {//반환값으로 body 구현
		return s -> System.out.println(s + " world");
	}//PrintString
	
}//class
