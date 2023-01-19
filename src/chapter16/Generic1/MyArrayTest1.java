package chapter16.Generic1;

class MyArray{
	
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=	obj;
	}
	
	public Object get(int index) {
		return array[index];
	}
}

public class MyArrayTest1 {

	public static void main(String[] args) {
		MyArray ma1 = new MyArray();
		ma1.add(new String("test"));
		String str = (String)ma1.get(0); //Object 타입 객체 => 다운캐스팅으로 반환 필요
		System.out.println(str);
		
		MyArray ma2 = new MyArray();
		ma2.add(new Integer(10));
		Integer num  = (Integer)ma2.get(0); //Object 타입 객체 => 다운캐스팅으로 반환 필요
		System.out.println(num);
		
	}

}
