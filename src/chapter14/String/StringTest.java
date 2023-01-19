package chapter14.String;

public class StringTest {

	public static void main(String[] args) {

		String str ="";
		String str1 ="Hi everybody!";
		String str2 =" Have a nice Day!";
		
		System.out.println(System.identityHashCode(str1));//System.identityHashCode : 메모리 주소값 반환
		
		str = str1 + str2;
		System.out.println(System.identityHashCode(str1));//11번라인과 주소값 동일
		System.out.println(str);

		//str1의 다른 주소 생성
		str1 = str1.concat(str2);//concat : 
		System.out.println(System.identityHashCode(str1));//concat으로 인해 주소값 변경됨 

		//str1의 같은 주소 생성
		str = str1.concat(str2);//concat : 
		System.out.println(System.identityHashCode(str1));//concat으로 인해 주소값 변경된 값 유지
		
		System.out.println("str1 글자 수 : " + str1.length());
		System.out.println("str1 글자 수 : " + str2.length());
		
		System.out.println("str1 문자'd'의 위치 : " + str1.indexOf('d'));
		System.out.println("str2 문자'D'의 위치 : " + str2.indexOf('D'));
		
		System.out.println("str1 문자 모두 소문자로 : " + str1.toLowerCase());
		System.out.println("str2 문자'모두 소문자로 : " + str2.toLowerCase());
		
		System.out.println("str1 문자 모두 대문자로 : " + str1.toUpperCase());
		System.out.println("str2 문자'모두 대문자로 : " + str2.toUpperCase());
	}
}
