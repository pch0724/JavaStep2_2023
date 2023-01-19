package chapter14.String;

public class Example_objectMain {

	public static void main(String[] args) {

		//문자열
		Example_object v1 = new Example_object();
		v1.setValue("Test"); //String이지만 이미 Object가 상속되어 있으므로 자동형변환이 이루어짐
		System.out.println(v1.getValue());
		
		//정수로 인자값을 대입
		Example_object v2 = new Example_object();
		v2.setValue(123);
		System.out.println(v2.getValue());
		
		//소수로 인자값을 대입
		Example_object v3 = new Example_object();
		v3.setValue(123.12456);
		System.out.println(v3.getValue());
		
		// 문자
		Example_object v4 = new Example_object();
		v4.setValue('A');
		System.out.println(v4.getValue());
		
		
		int i = (int)v2.getValue(); // UnBoxing: 객체 v2 -> 기본자료형 int i
		System.out.println(i + 2);
	}

}
