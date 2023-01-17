package chapter13;

public class StaticInner {

	int a =10;
	private int b = 100;
	static int c = 200; //Data영역 메모리
	
	//생성자
	
	//메서드
	
	//내부클래스
	static class Inner{
		//필드
		static int d = 1000;
		//생성자
		//메서드
		public void printData() {
			//a, b는 static이 아니여서 데이터 영역에서 사용할 수 없음
			//System.out.println("int a : " + a);//heap?
			//System.out.println("private int b : " + b);//heap?
			System.out.println("static int c : " + c);
			System.out.println("static int d : " + d);
		}//pD
		
	}//Inn
	
	
	public static void main(String[] args) {
		
		Inner inner = new Inner();
		inner.printData();
		
	}

}
