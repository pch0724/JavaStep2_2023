package chapter17.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PersonManager {

	public void personMgr() {
		int select;
		Person p;
		
		ArrayList<Person> personArr = new ArrayList<Person>();
		
		while(true) {
			
			System.out.println("1. 회원 추가");
			System.out.println("2. 회원 탈퇴");
			System.out.println("3. 회원 정보");
			System.out.println("4. 종    료");
			System.out.print("항목 선택 : ");
			
			Scanner sc = new Scanner(System.in);
			select = sc.nextInt();
			
			if(select == 1) {
				p = new Person();
				System.out.println("====정보 입력====");
				System.out.print("이름 : ");
				p.setName(sc.next());
				System.out.print("나이 : ");
				p.setAge(sc.nextInt());
				System.out.print("전화 : ");
				p.setTel(sc.next());
				personArr.add(p);
				System.out.println("정보가 저장되었습니다.");
				
			}else if(select == 2) {
				System.out.print("삭제할 회원 이름 입력 >");
				String name = sc.next();
				for(int i = 0; i < personArr.size(); i++) {
					if(name.equals(personArr.get(i).getName())) {
						personArr.remove(i);
						System.out.println(name + " 회원 정보가 삭제되었습니다.");					
					}//in if
				}//in for
				
			}else if(select == 3) {
				System.out.println("전체 회원수 : " + personArr.size());
				System.out.println("===============================");
				for(int i = 0; i < personArr.size(); i++) {
					System.out.println("회원번호 : " + (i+1));
					System.out.println("이름 : " + personArr.get(i).getName());	
					System.out.println("나이 : " + personArr.get(i).getAge());	
					System.out.println("전화 : " +personArr.get(i).getTel());
					System.out.println("=====================================");
				}//in for
				/*
				Iterator<Person> it = personArr.iterator();
				while(it.hasNext());
				p = it.next();
				System.out.println("회원번호 : " + );
				System.out.println("이름 : " + );
				System.out.println("나이 : " + );
				System.out.println("번호 : " + );
				*/
			}else if(select == 4) {
				System.out.println("프로그램 종료");
				break;
			}//out if
			
		}//while
		
	}//personMgr
	
}//PersonManager
