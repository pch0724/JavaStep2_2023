package chapter16.Generic1;

class MyArrayG<E>{//Generic : 형변환 최소화하기 위한 요소 |  
	
	private Object[] array = new Object[10];
	int i;
	
	public void add(Object obj) {
		array[i++]=	obj;
	}
	
	public E get(int index) {
		return (E)array[index];
	}
}

public class MyArrayTest2 {
	
	public static void main(String[] args) {
		MyArrayG<String> ma1= new MyArrayG<>();
		ma1.add(new String("test"));
		String str = ma1.get(0); //Generic으로 다운캐스팅 필요X
		System.out.println(str);
		
		MyArrayG<Integer> ma2 = new MyArrayG<>();
		ma2.add(new Integer(10));
		Integer num  = ma2.get(0); //Generic으로 다운캐스팅 필요X
		System.out.println(num);
		
	}

}
