package chapter14.Clone;

public class ArrayCloneTest {

	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2;
		
		arr2 = arr1.clone(); // 깊은 복사  
		//arr2의 배열이 단순히 arr1의 메모리값을 따라가는 것이 아닌 다른 메모리값에 값을 가져가기 때문에 arr2에서 수정이 이루어져도 arr1의 배열에는 영향이 없음
		System.out.println("복사된 arr2 배열");
		for(int num : arr2) {
			System.out.print(num + " ");
		}
		
		arr2[3]=0;
		System.out.println();
		System.out.println("변경 후 arr1 배열");
		for(int num : arr1) {
			System.out.print(num + " ");
		}
		System.out.println();
		System.out.println("변경 후 arr2 배열");
		for(int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
