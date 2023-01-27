package chapter22;

public class ThreadEx02_Main {

	public static void main(String[] args) {

		ThreadEx02 t2 = new ThreadEx02();
		
		t2.start(); // start() 메서드 수행하면 내부의 run() 메서드 수행
		
		try {
			Thread.sleep(2000);
			System.out.println("프로그램 종료");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
