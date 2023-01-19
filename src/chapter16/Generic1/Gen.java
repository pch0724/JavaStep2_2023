package chapter16.Generic1;

public class Gen<T> {

	public <T> void printArray(T[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " | ");
		}
		System.out.println();
	}
}
