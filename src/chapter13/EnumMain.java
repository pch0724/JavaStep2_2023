package chapter13;

import java.util.Scanner;

public class EnumMain {
	
	public enum Item{ // enum = 배열이라고 생각하면 편함
		Start, Pause, Exit // index => 0, 1, 2
	}// Item()
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("숫자를 입력하세요 [0 : 게임시작 | 1 : 일시정지 | 2 : 게임종료] : ");
			int n = sc.nextInt();
			
			Item start = Item.Start;//Item start에 '0' 값 부여
			Item pause = Item.Pause;//Item pause에 '1' 값 부여
			Item exit = Item.Exit;//Item exit에 '2' 값 부여
			
			if(n == start.ordinal()) {// ordinal => start에 입력된 값을 가져옴 ex. start = 0, pause = 1, exit = 2
				System.out.println("게임이 시작함");
			}else if(n==pause.ordinal()) {
				System.out.println("게임이 일시정지됨");
			}else {
				System.out.println("게임 종료");
				return; //break; 도 사용가능
			}
		}
	}

}
