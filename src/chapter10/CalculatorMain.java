package chapter10;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//방법1
		/*
		CalPlus cp = new CalPlus();
		CalMinus cm = new CalMinus();

		
		//getClass().getSimpleName() : 클래스명 가져오기
		System.out.println(cp.getClass().getSimpleName() +" : "+ cp.getResult(15, 15));
		System.out.println("CalMinus : " + cm.getResult(30, 15));
		*/
		//방법2
		int plus = calc(new CalPlus(), 20,10); // Calc c1 = new CalPlus();
		System.out.println("두 수의 합 : " + plus);
		
		int minus = calc(new CalMinus(), 20,10); // Calc c1 = new CalMinus();
		System.out.println("두 수의 차 : " + minus);
	}
	
	public static int calc(CalculatorExam c1, int a, int b) {
		return c1.getResult(a, b);
	}
}
