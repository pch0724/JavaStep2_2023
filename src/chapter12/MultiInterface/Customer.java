package chapter12.MultiInterface;

public class Customer implements Buy, Sell{

	/*
	@Override
	//같은 이름의 default 메서드는 존재할 수 없으므로, 오버라이딩이 필수
	//최종 오버라이딩 메소드가 사용됨
	public void order() {
		System.out.println("고객 판매 주문");
	}
	*/
	
	@Override
	public void sell() {
		// TODO Auto-generated method stub
		System.out.println("판매하기");
	}
	@Override
	public void buy() {
		System.out.println("구매하기");
		
	}
	
	

}
