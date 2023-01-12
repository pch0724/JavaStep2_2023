package chapter09;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		//this.customerID = customerID;
		//this.customerName = customerName;
		this.agentID = agentID;//vip 전문상담원
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}//vipcustomer

	@Override
	public int calcPrice(int price) {
		bonusPoint = ((price-(int)(price*saleRatio))*bonusRatio);
		return (price-(int)(price*saleRatio)); //VIP물건실제구매가격
	}

	@Override
	public String showCustomer() {
		return super.showCustomer()+"\n전문상담원은 " + agentID + "입니다.";
	}

	public int getAgentID() {
		return agentID;
	}
	
	
}
