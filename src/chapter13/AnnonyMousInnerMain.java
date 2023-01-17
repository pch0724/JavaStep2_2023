package chapter13;

//방법1
class outter2 {
	//익명의 클래스는 인스턴스 이름이 없다.
	Runnable getRunnable(int i) {
		int num = 100;
		// new와 동시에 부모 클래스(Runnable)의 run() 메서드를 상속받으므로 추상 메서드인 run()을 반드시 overriding 해서 사용해야한다
		return new Runnable() {
			
			@Override
			public void run() {
				//i = 10; Runnable 멤버변수, 매개변수 = final => 재정의 불가
				System.out.println(i);
				System.out.println(num);
				
			}//run()
		};// return 끝
	}//Runnable
	
	//방법2
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			System.out.println("Runnable이 구현된 익명의 클래스 변수");
		}
	};
}//outter2

public class AnnonyMousInnerMain {

	public static void main(String[] args) {
		outter2 out = new outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		out.runner.run();
	}

}
