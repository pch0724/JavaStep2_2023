package chapter22;

public class DaeMonThread_Main implements Runnable {

	static boolean autoSave = false; // 자동저장기능 잠김
	
	public static void main(String[] args) {
		// Runnable의 run()은 Thread의 객체로 반드시 변환하여 사용해야 쓰레드로 활용 가능하다
		DaeMonThread_Main dm = new DaeMonThread_Main();
		Thread t = new Thread(dm); // 쓰레드 객체로 변환
		
		//데몬쓰레드로 설정 : 메인 쓰레드가 종료되면 같이 종료됨
		t.setDaemon(true);
		t.start();
		
		for(int i = 1; i <= 15; i++) {
			
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
			if(i==3) // 3초 뒤 저장모드로 전환
				autoSave =true;
		}
		
	}
//3초마다 저장 무한반복
	@Override
	public void run() {
		
		while(true) {
			
			try {
				Thread.sleep(3000); // 3초마다
			} catch (Exception e) {
				e.printStackTrace();
			}//try catch
			
			if(autoSave = true) {
				System.out.println("자동저장 됩니다.");
			}//if
		}//while
		
	}//run

}
