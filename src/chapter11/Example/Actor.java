package chapter11.Example;

import java.util.Scanner;

public class Actor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * 
		 * 검색할 배우 : ㅁ
		 * 해당배우가 존재하지 않습니다. ===> 검색이 제대로 이루어지지 않은 경우.
		 */
		//3열 2행 초기화
		String [][] actor ={ {"[송강호]", "박쥐", "괴물", "관상"},
							 {"[김수현]", "도둑들", "수상한 그녀", "은밀하게 위대하게"},
							 {"[이병헌]", "지아이조", "레드", "광해"}
							};
		int cnt = 0;
		System.out.print("검색할 배우 : ");
		Scanner scan = new Scanner(System.in);
		String actName = scan.next();
				
		for(int i = 0; i < actor.length; i++) {
			if(actor[i][0].equals("["+actName+"]")) {
				for(int j = 0; j < actor[i].length;j++) {
					System.out.print(actor[i][j] + " ");
				}
			}else{
			  	cnt++;
			   if(cnt >= actor.length){
			   	System.out.println("해당 배우가 존재하지 않습니다.");
			   }
			} 
			
				
			/*
			}else {
				System.out.print("해당 배우가 존재하지 않습니다.");
				break;
			}
			*/
		}
	}//m

}//c
