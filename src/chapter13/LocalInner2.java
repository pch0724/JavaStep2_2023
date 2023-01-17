package chapter13;

class outer{
	
	//외부 클래스 필드
	int outNum = 100;
	static int sNum = 200;
	
	//Runnable 매개변수(int i)와 멤버변수(int num)는 final로 정의된다.
	//Runnable Data 영역에 들어가며 익명의 클래스라고 한다.
	Runnable getRunnable(int i) {//반드시 오버라이딩이 필요함(추상 메서드)
		int num = 100; // final = 재정의 못함
		
		class MyRunnable implements Runnable{
			int localnum = 10;//내부 클래스의 멤버변순
			
			@Override
			public void run() {
				//num = 200; // num은 Runnable의 멤버변수로 final이기때문에 재정의가 불가능함
				//i = 100; // i는 Runnable의 매개변수로 final이기때문에 재정의가 불가능함
				System.out.println("i = " +i);
				System.out.println("num = " +num);
				System.out.println("localnum = " +localnum);
				System.out.println("outnum = " +outNum + "(외부)");
				
			System.out.println("outer.sNum = " + outer.sNum + "(외부Data영역)");	
			}//r
			
		}//my
		
		return new MyRunnable();
	}//get
}//out



public class LocalInner2 {

	public static void main(String[] args) {
		outer out = new outer();
		Runnable runner = out.getRunnable(10);
		runner.run();
	}//m
}//c
