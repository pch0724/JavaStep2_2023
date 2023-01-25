package chapter19.Lambda;

public class TestStringConcat extends StringConcatImple{

	public static void main(String[] args) {

		String s1 = "Hello";
		String s2 = "World";
		
		//인스턴스 변수
		System.out.println("--인스턴스 변수--");
		StringConcatImple sci = new StringConcatImple();
		sci.makeString(s1, s2);
		
		//Lambda
		System.out.println("--람다식 방식--");
		StringConcat sc = (s, v) -> System.out.println(s + ", " + v);
		sc.makeString(s1, s2);
		
		//익명의 내부 클래스 방식
		System.out.println("--익명의 내부 클래스 방식--");
		StringConcat sc3 = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
				
			}//override
		};//sc3
		
		sc3.makeString(s1, s2); // 호출
		
	}

}
