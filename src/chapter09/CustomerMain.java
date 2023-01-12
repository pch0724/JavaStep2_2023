package chapter09;

public class CustomerMain {

	public static void main(String[] args) {
		
		//VIP고객
		System.out.println("------VIP고객------");
		int price = 10000;
		VIPCustomer vipcs = new VIPCustomer(1004, "홍길동", 900);
		
		int vipprice = vipcs.calcPrice(price);
		System.out.println(vipcs.getCustomerName()+"님이 " + price +"원 물품을 " + vipprice + "원에 구매하셨습니다.");
		System.out.println(vipcs.showCustomer());
		
		System.out.println("------일반고객------");
		price = 10000;
		
		Customer cs = new Customer(1234, "김철수");
		int csprice = cs.calcPrice(price);
		System.out.println(cs.getCustomerName() + "님이 " + price + "원 물품을 " + csprice + "원에 구매하셨습니다.");
		System.out.println(cs.showCustomer());
		
		
	}

}
