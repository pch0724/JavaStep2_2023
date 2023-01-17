package chapter13;

public class MemberInner {

	int a =10;
	private int b = 100;
	static int c = 200;
	
	//생성자
	
	//메서드
	
	//내부클래스
	class Inner{
		//필드
		//생성자
		//메서드
		public void printData() {
			System.out.println("int a : " + a);
			System.out.println("private int b : " + b);
			System.out.println("static int c : " + c);
		}//pD
	}//Inn
	
	
	public static void main(String[] args) {
		// 외부
		//MemberInner mi = new MemberInner();
		// 내부
		//MemberInner.Inner in = mi.new Inner();
		//in.printData();
		
		MemberInner.Inner inner = new MemberInner().new Inner(); // 27~30라인 한줄에 처리 가능
		inner.printData();
	}

}
