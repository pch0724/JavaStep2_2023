package chapter14.Wrapper;

public class AutoBoxingUnBoxingExample {

	public static void main(String[] args) {
		
		// AutoBoxing
		Integer obj = 100;
		System.out.println("value : " + obj.intValue()); // 언박싱
		
		//obj를 언박싱으로 자동 변환
		int value = obj;
		System.out.println("vlaue : " + value);
		
		//연산시 자동 unboxing
		int result = obj + 100;
		System.out.println("result : " + result);
		
		
	}

}
