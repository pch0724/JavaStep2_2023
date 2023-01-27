package chapter22;

public class ThreadJoin implements Runnable{

	public static void main(String[] args) {
		System.out.println("메인 클래스 시작");

		ThreadJoin t1 = new ThreadJoin();
		Thread JThread = new Thread(t1);
		JThread.start(); // JThread : 쓰레드 객체
		
		try {
			JThread.join(); // run()메서드와 main()메서드가 join이 되어 run()이 완전히 종료될 때까지 기다림(위 -> 아래 || 왼 -> 오른으로 컴파일 진행)
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("메인 클래스 종료");
		
	} //main
//===============================================================
	@Override
	public void run() {
		System.out.println("run() 메서드 수행");
		first();
	}

	public void first() {
		System.out.println("first() 메서드 수행");
		second();
	}
	
	public void second() {
		System.out.println("second() 메서드 수행");
	}

}
