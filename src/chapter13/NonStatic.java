package chapter13;

import javax.swing.JOptionPane;

class Out{
	
	// 필드
	static int a = 1;
	
	// 생성자
	
	// 메서드
	
	
	//내부 클래스
	public class In{
		
		//필드
		
		// 생성자
		
		// 메서드
		public String Infun() {
			
			return (a+"번째 Non-Static 내부 실습");
		}//Inf
	}//claI
	
}//CO



public class NonStatic {

	public static void main(String[] args) {

		Out obj1 = new Out();// 바깥 클래스 객체
		
		Out.In obj2 =obj1.new In(); // 내부 클래스 객체
		
		String str = obj2.Infun();//내부 메서드
		
		JOptionPane.showMessageDialog(null, str+"\n Success");
	}

}
