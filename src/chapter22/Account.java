package chapter22;

public class Account {

	int balance = 1000; //잔액
	
	//출금 메서드
	public synchronized void withdraw(int money) {
		if(balance < money) {
			try {
				wait(); //스레드 일시적으로 정지상태
			} catch (Exception e) {
				e.printStackTrace();
			}//try catch
			
		}	
		balance -= money;
	}//withdraw
	
	//입금 메서드
	public synchronized void deposit(int money) {
		balance += money;
		notify();// wait()으로 정지된 쓰레드 해제
	}//deposit
}


/*
멀티 쓰레드 환경에서 고려해야 할 쓰레드 간의 동기화
쓰레드 간 공유하는 Data가 존재할 시 수정하고 삭제하는 과정에서 동기화를 유지시켜야 함
자바에서는 synchronized를 통해 동기화를 시킴
*/
