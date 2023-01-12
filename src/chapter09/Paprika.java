package chapter09;

public class Paprika extends Vegetable{

	private String color;
	private int price;
	private String name; // Vegetable에도 같은 필드가 있음(모호성) => 22번라인 
	
	//DC
	
		//setter
		public void Set2(String a, int b, String c) {
			color = a;
			price = b;
			name = c;
		}
		
		public void Disp1() {
			System.out.println("-----paprika-----");
			System.out.println("분류 : " + sort);
			System.out.println("계절 : " + season);
			System.out.println("이름 : " + super.name);// super. => 부모 클래스의 기본 생성자 / 상속을 받았을 때 부모 클래스의 요소를 사용 / 필드에 부모클래스와 동일한 이름의 변수가 있을 경우 사용
		
			System.out.println();
		}
		
		public void Disp2() {
			System.out.println("-----paprika-----");
			System.out.println("색깔 : " + color);
			System.out.println("가격 : " + price);
			System.out.println("이름 : " + name);			
		
			System.out.println();
		}
	
}
