package chapter08;

import java.util.Scanner;

public class Tour2 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
	      
	      Guest gues=new Guest();
	      
	        
	      System.out.print("관광객 수 : ");
	      int n=scan.nextInt(); 
	      Guide guid=new Guide(n);
	      
	      
	      
	      
	      
	      
	      while (true) {
	         
	         for(int i=0;i<n;i++) {
	            System.out.print((i+1)+". 이름 : ");
	            guid.guest[i].setName(scan.next());
	            System.out.print((i+1)+". 성별 : ");
	            guid.guest[i].setGender(scan.next());
	            System.out.println("----------------------");
	         }//f
	         
	         System.out.println("1. 관광객 정보 \n2. 목적지 변경 \n3. 종료");
	         System.out.print("선택 >> ");
	         int a=scan.nextInt();
	         switch (a) {
	         case 1:
	        	 
	            break;

	         default:
	            break;
	         }//s
	      }//w
	      
	      
	      
	       
	   }//m

	}//c

