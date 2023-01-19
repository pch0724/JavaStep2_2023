package chapter15;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.StringTokenizer;

public class NewPerson {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		Person person1 = new Person();
		System.out.println(person1);
		
		Class pClass = Class.forName("chapter15.Person");
		System.out.println(pClass);
		
	
		Person person2 = (Person)pClass.newInstance();
		System.out.println(person2);
		
		//=====================================================
		//String 클래스의 정보 가져오기
		Class sClass = Class.forName("java.lang.String");
		System.out.println(sClass);
		//String 클래스의 생성자들 정보
		Constructor[] cons = sClass.getConstructors();
		for(Constructor c : cons) {
			System.out.println(c);	
		}
		
		System.out.println("----------------------------------------------");
		Field[] field= sClass.getFields();
		for(Field f: field) {
			System.out.println(f);
		}
		
		System.out.println("----------------------------------------------");
		Method[] method= sClass.getMethods();
		for(Method m: method) {
			System.out.println(m);
		}
		
		//===================================================================
		String str = "Have,a,Nice,Day";
		//Token : 배열 인덱스 구조를 가지고 있고 띄어쓰기를 기준으로 하나의 토큰으로 취급
		//Tokenizer = import java.util.StringTokenizer 필요
		//StringTokenizer(1,2,3)
		//1 : 사용할 String 문자열
		//2 : 토큰 분리 기준 ex. " ", "," ...
		//3 : 분리 기준 표시 여부
		StringTokenizer obj = new StringTokenizer(str, ",", true);//StringTokenizer(str(사용 문자열), " "(자르는 기준), true of false(자르는 기준 표시 여부)
		
		
		
		while(obj.hasMoreTokens()) {
			String t = obj.nextToken();
			System.out.println(t);
		}
	}
	
}
