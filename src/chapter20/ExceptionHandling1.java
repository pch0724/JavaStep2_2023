package chapter20;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		int[]arr = {1,2,3,4,5};
		
		try {
			for(int i = 0; i <= 5; i++) {
				System.out.println(arr[i]);
			}//inner for
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}//try-catch
		System.out.println("비정상 종료");
	}//main

}//class
