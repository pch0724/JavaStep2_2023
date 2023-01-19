package chapter14.String;

public class Example_object {
	//메서드의 인자값(=매개변수)이 String 또는 int 
	
	Object value; //java 객체의 최상위인 Object형으로 변수생성
	
	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {// Object는 최상위 객체로 Object 안에 String, int, double 등 모든 데이터형 포함 
		this.value = value; // 기본자료형 int => 객체(Object) : AutoBoxing         **객체 -> 기본자료형 : UnBoxing
	}
	
	
}
