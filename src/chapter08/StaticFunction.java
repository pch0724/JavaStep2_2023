package chapter08;

public class StaticFunction {

	String str1 = "일반 회원변수";
	static String str2 = "static 회원변수";
	
	public static String getStatic() { // static 메서드 -> data 영역  -> static 변수만 사용 가능
		
		//str1 = "VIP" => static 변수가 아니여서 사용 불가
		
	
		return str2;
	}
	
}
