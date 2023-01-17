package chapter12.MultiInterface;

public class CustomerMain {

	public static void main(String[] args) {

		Customer cs = new Customer();
		System.out.println("--------Buy------------");
		Buy buyer = cs;
		buyer.buy();
		buyer.order();
		System.out.println();
		
		System.out.println("--------Sell-----------");
		Sell seller = cs;
		seller.sell();
		seller.sellorder();
		//seller.order();
		//seller : 부모 | Customer : 자식 
		if(seller instanceof Customer) {
			Customer cs2 = (Customer)seller; // 부모가 자식으로 올라가는 경우 자식 클래스로 캐스팅필요
			System.out.println(" -- Down Chasting");
			cs2.buy();
			cs2.sell();
			cs2.order();
		}
		
		cs.order();
	}
		
}
