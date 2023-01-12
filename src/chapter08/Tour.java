package chapter08;

import java.util.Scanner;

public class Tour {

	public static void main(String[] args) {



		Scanner sc = new Scanner(System.in);
		
		System.out.print("관광객 수 : ");
		int num = sc.nextInt();
		
		Guide g = new Guide(num);
		
		System.out.println("관광객 등록");
		for(int i = 0; i <num; i++) {
			System.out.print( (i+1) + ". 이름 : ");
			g.guest[i].setName(sc.next());
			System.out.print( (i+1) + ". 성별 : ");
			g.guest[i].setGender(sc.next());
			Guide.point = "가거도";
			System.out.println("----------------------------");
		}//for
		
		while(true) {
			System.out.println();
			System.out.println("1. 관광객 정보" +"\n" + "2. 목적지 변경" + "\n" + "3. 종료" + "\n");
			
			System.out.print("선택 >> ");
			int n = sc.nextInt();
			
			if(n == 1) {
				for(int i =0; i < num; i++) {
					System.out.println((i+1) + ". 이름 : " + g.guest[i].getName());
					System.out.println((i+1) + ". 성별 : " + g.guest[i].getGender());
					System.out.println((i+1) + ". 목적지 : " + g.guest[i].getPoint());
					System.out.println("-----------------------------------------");
				}
			}else if(n == 2) {
				System.out.print("어디로 변경하시겠습니까 : ");
				Guide.point = sc.next();
				System.out.println(Guide.point + "로 목적지 변경");
			}else if(n == 3) {
				break;
			}//if
		}//while

	}//main	
		
}//class
