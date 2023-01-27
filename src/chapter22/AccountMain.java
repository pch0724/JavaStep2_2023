package chapter22;

import java.util.Scanner;

public class AccountMain{


	public static void main(String[] args) {

		Account acc = new Account();
		Runnable at = new AccountThread(acc);
		Thread t1 = new Thread(at); // 쓰레드화
		
		t1.start();
		
		//쓰레드와 별개로 값을 받아 입금 시키는 코드
		
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.print("입금 금액 > ");
		int n = sc.nextInt();
		acc.deposit(n);	
		if(acc.balance == 0) {
			break;
		}
		}
	}//m

}//c
