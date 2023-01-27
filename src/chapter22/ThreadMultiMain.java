package chapter22;

public class ThreadMultiMain {

	public static void main(String[] args) {
		// Multi Thread
		ThreadEx03 t1 = new ThreadEx03(); // 1
		ThreadEx03_2 t2 = new ThreadEx03_2(); // 2
		
		t1.start();
		t2.start();
		// 번갈아가면서 실행됨 (동기화가 유지되고 있지않음)(쓰레드 간 경쟁상태)
	}

}
