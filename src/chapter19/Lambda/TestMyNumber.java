package chapter19.Lambda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		// 인스턴스 변수방에 구현부를 저장
		MyNumber getMaxf = (x,y) -> (x>=y)? x : y;
		// 구현부를 대입하여 실행함
		System.out.println(getMaxf.getMax(1, 10));
		
		//lambda => 2줄 | 복잡한 함수는 X
		
		//========================================
		
		MyNumber aa = new MyNumber() {
			
			@Override
			public int getMax(int x, int y) {
				int max=(x>=y)? x:y;
				return max;
			}
		};
		System.out.println(aa.getMax(15, 20));
		//overriding => 8줄 |추상메서드는 무조건 overriding 필요
	}

}
