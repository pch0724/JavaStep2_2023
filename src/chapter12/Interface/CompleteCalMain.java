package chapter12;

public class CompleteCalMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =10;
		int num2 = 5;
				
		Calc calc = new CompleteCalc2();
		
		System.out.println("------default Method-------");
		calc.description(); // 디폴트메서드 호출
		System.out.println();
		
		System.out.println("------static Method-------");
		int[] arr = {1,2,3,4,5};
		System.out.println("1 ~ 5까지의 합 : " + Calc.total(arr));
		System.out.println();
		
		System.out.println("--------interface Method-------");
		System.out.println("--------------add--------------");
		System.out.println(calc.add(num1, num2));
		System.out.println("----------substract------------");
		System.out.println(calc.substract(num1, num2));
		System.out.println("-------------times-------------");
		System.out.println(calc.times(num1, num2));
		System.out.println("-------------divide------------");
		System.out.println(calc.divide(num1, num2));
		
		System.err.println("---------child method----------");
		CompleteCalc2 calc2 = new CompleteCalc2();
		calc2.showInfo();
		
	}

}
