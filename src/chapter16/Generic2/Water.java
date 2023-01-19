package chapter16.Generic2;

public class Water extends Material{

	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "재료는 Water 입니다.";
	}

	@Override
	public void doPrinting() {
		System.out.println("Water 재료는 불가능합니다.");
	}

	
	
}
