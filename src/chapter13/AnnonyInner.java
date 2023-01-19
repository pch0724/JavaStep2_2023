package chapter13;

public class AnnonyInner {

	public void	test() {
		
		new TestInter() { //TestInter ti = new TestInter -> ti.printData()
			
			@Override
			public void printData() {
				System.out.println("화요일");
			}// 추상메서드 구현 | printData()
		}.printData();//TestInter
	}//test()
	
	public static void main(String[] args) {
		
		AnnonyInner AI = new AnnonyInner();
		AI.test();
	}

}
