package chapter12.MultiInterface;

import java.util.Scanner;

public class SchedulerMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
	outer : while(true) {
			System.out.println();
			System.out.println(" R or r : 한명씩 차례로 할당");
			System.out.println(" L or l : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
			System.out.println(" P or p : 업무 skill 값이 높은 상담원에게 할당");
			System.out.println(" S or s : 종료");
			System.out.print("전화 상담 방식을 선택하세요 : ");
			
			//문자를 아스키코드로 형변환
			//방법1
			//charAt(0) : 문자(char) 또는 문자열(String) => ASCII 즉 int
			char select = sc.nextLine().charAt(0); // 문자를 ASCII 코드 번호(숫자)로 변환 
			int num = (int)select;
			
			// System.in.read() : 콘솔에 입력받기 모든 입력값을 아스키 코드 값으로 변환
			// int ch = System.in.read(); //아스키코드값
			
			//방법2
			// String mun = scan.nextLine();
			// int ch = mun.charAt(0); // charAt(0):String => ASCII(int)
			
			
			//객체 생성
			Scheduler scheduler = null;
			
			if(num == 'R' || num == 'r') {
				scheduler = new RoundRobin();
				System.out.println();
			}else if(num =='L' || num == 'l') {
				scheduler = new LeastJob();
				System.out.println();
			}else if(num =='P' || num =='p') {
				scheduler = new PriorityAllocation();
				System.out.println();
			}else if(num == 'S' || num == 's') {
				System.out.println("종료합니다.");
				break;
			}else {
				System.out.println("올바른 문자를 입력하세요.");
				System.out.println();
				continue;
			}//if
			scheduler.getNextCall();
			scheduler.sendCallToAgent();
		}//w
	}//m

}//c
