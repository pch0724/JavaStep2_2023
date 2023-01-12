package chapter08;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Tour3 {

   public static void main(String[] args) {
      // 관광객 등록

      Scanner scan = new Scanner(System.in);
      System.out.print("관광객 수: " );
      int a = scan.nextInt();
      Guide gues2 = new Guide(a);
      
      System.out.println("관광객 등록");
      
      for(int i=0; i<a; i++) {    
      System.out.print((i+1) + " . 이름 : ");
      gues2.guest[i].setName(scan.next());
      System.out.print((i+1) + " . 성별 : ");
      gues2.guest[i].setGender(scan.next());
      Guide.point="가거도";   
      }
      
      
      outer : while(true) {
         
         System.out.println("1. 관광객정보: ");
         System.out.println("2. 목적지변경: ");
         System.out.println("3. 종료: ");
         System.out.print("선택 >>");
          int select = scan.nextInt();
          
         switch(select) {
         case 1:
            for(int i=0; i<a; i++) {
               System.out.println((i+1)+" 이름: "+gues2.guest[i].getName());
               System.out.println((i+1)+" 성별: "+gues2.guest[i].getGender());
               System.out.println((i+1)+" 목적지: "+gues2.guest[i].getPoint());
            }
            break;
            
         case 2:
            System.out.print("어디로변경하시겠습니까?");
            Guide.point=scan.next();
            System.out.println(Guide.point+"로 목적지변경되었습니다");
            break;
            
         case 3:
               System.out.println("종료");
            break outer;
         }//switch
         
      }//while

   }

}