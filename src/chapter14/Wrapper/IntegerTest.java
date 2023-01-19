package chapter14.Wrapper;

//Wrapper
public class IntegerTest {

	public static void main(String[] args) {
		
		//Integer i = new Integer(100); // int i = 100
		
		Integer num = 100; // 오토박싱 : 일반자료 => 클래스로 선언
		
		//.intValue() =>  클래스에 있는 int값 호출
		int iNum = num.intValue(); // 언박싱 : 클래스 => 일반자료
		
		int jNum = 200;
		
		int sum = iNum + jNum;
		System.out.println(sum);
		
		//언박싱(Integer => int) : 결과물이 일반자료
		int total = num +jNum; // num : 클래스이기 때문에 원래는 num.intValue를 해야하지만 자동으로 언박싱되어 연산이 이루어짐
		System.out.println(total);
		
		//오토박싱(int => Integer) : 결과물이 클래스타입
		Integer i = jNum;
		System.out.println(i); //Integer.valueOf(jNum)을 해야 Integer i 에 있는 int 값을 호출할 수 있으나 자동으로 오토박싱되어 연산이 이루어짐
		
		
	}

}
