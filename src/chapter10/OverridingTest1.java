package chapter10;

import chapter09.Customer;
import chapter09.VIPCustomer;

public class OverridingTest1 {

	public static void main(String[] args) {

		Customer csLee = new Customer(10001, "이순신");
		csLee.bonusPoint = 1000;
		
		System.out.println(csLee.showCustomer());
		System.out.println("-----------------------------------------------------");
		VIPCustomer vipKim = new VIPCustomer(10002, "김유신", 1004);
		vipKim.bonusPoint = 1000;
		System.out.println(vipKim.showCustomer());
		System.out.println();
		
		int price = 10000;
		System.out.println(csLee.getCustomerName() + "님이 " + csLee.calcPrice(price) + "원을 지불 완료하였습니다.");
		System.out.println("-----------------------------------------------------");
		System.out.println(vipKim.getCustomerName() + "님이 " + vipKim.calcPrice(price) + "원을 지불 완료하였습니다.");
		
	}

}
