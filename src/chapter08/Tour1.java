package chapter08;

import java.util.Scanner;

public class Tour1 {

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
	      
	      Guest gt=new Guest();
	      
	      System.out.print("관광객 수를 입력하세요 : ");
	      int a = scan.nextInt();
	      Guide gd=new Guide(a);
	      
	      // 관광객 등록
	      
	      while(true){
	         for(int i=0; i<a; i++) {
	            System.out.print((i+1)+".이름 : ");
	            gt.setName(scan.next());
	            System.out.print((i+1)+".성별 : ");
	            gt.setGender(scan.next());
	            System.out.println("==================");
	              }break;
	      }
	             
	         
	         System.out.println("원하는 번호를 입력하세요 : ");
	         System.out.println("1. 관광객 정보\t2. 목적지 변경\t3.종료");
	         System.out.print("선택 >>> ");
	         int n = scan.nextInt();
	         switch (n) {
	         case 1:
	            System.out.println("관광객 정보");
	            for(int j =0; j<a; j++) {
	               
	            System.out.println(gt.getName());
	            System.out.println(gt.getGender());
	            System.out.println(gt.getPoint());
	            System.out.println("============");
	            }
	            break;
	         case 2:
	            System.out.println("목적지 변경");
	            break;
	         case 3:
	            System.out.println("이용해주셔서 감사합니다.");
	            break;
	         default:
	            break;
	         }         }
	         
	      
	         
	         
	   

		

	}

