package chapter12.MultiInterface;

public interface Sell {

	void sell();
	
	//최종 오버라이딩 메소드가 줄력됨
	/*
	default void order() {
		System.out.println("판매주문");
	}
	*/
	default void sellorder(){
		System.out.println("판매주문");
	}
}
