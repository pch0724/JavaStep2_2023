package chapter13;

import javax.swing.JOptionPane;

class Out2{
	
	//필드
	static int a = 1;
	int b;
	
	//생성자
	
	//메서드
	
	//내부 클래스
	public static class In{		
		String Infun() {
			return (a + "번째 static 내부 클래스 ");
		}
	}
	
}

public class EmbedMain {

	
	public static void main(String[] args) {

		//static은 클래스명으로 직접 접근 가능
		Out2.In obj1 = new Out2.In();
		//2. 내부에 있는 메소드
		String str = obj1.Infun();
		JOptionPane.showMessageDialog(null, str + "\n Success");
		
		
	}

}
