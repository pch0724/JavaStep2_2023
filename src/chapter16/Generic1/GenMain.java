package chapter16.Generic1;

public class GenMain {

	public static void main(String[] args) {

		Gen gen = new Gen();
		
		//정수형 배열
		Integer[] iArr = {1,2,3,4,5};
		System.out.println("정수형 배열 : ");
		gen.printArray(iArr);

		//더블형
		System.out.println("더블형 배열 : ");
		Double[] dArr = {1.1, 1.2, 1.3, 1.4, 1.5};
		gen.printArray(dArr);

		//문자형
		System.out.println("문자형 배열 : ");
		Character[] cArr = {'a','b','c','d','e'};
		gen.printArray(cArr);
	}

}
