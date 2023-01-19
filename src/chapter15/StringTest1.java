package chapter15;

public class StringTest1 {

	public static void main(String[] args) {
		
		String javaStr = new String("java "); // heap
		String androidStr = new String(" andriod"); // heap
		System.out.println(javaStr); // String에는 toString() 내포
		System.out.println(javaStr.hashCode()); // .hashCode() : 10진수로 반환
		System.out.println(System.identityHashCode(javaStr)); // System.identityHashCode() : 16진수 반환
		
		javaStr = javaStr.concat(androidStr);
		System.out.println();
		System.out.println(javaStr);
		System.out.println(System.identityHashCode(javaStr)); // concat으로 인해 기존 HashCode 값 변경됨
	}

}
