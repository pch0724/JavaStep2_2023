package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest2 {

	public static void main(String[] args) {
		// 부모 = 자식 (자동형변환)
		Customer vc = new VIPCustomer(10003, "김치", 20000);
		System.out.println(vc.showCustomer());
		int price = 10000;
		System.out.println(vc.getCustomerName() + "님이 " + vc.calcPrice(price) + "원을 지불 완료하였습니다.");
		
		
	}

}
