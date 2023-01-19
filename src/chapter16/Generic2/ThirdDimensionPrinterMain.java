package chapter16.Generic2;

public class ThirdDimensionPrinterMain{

	public static void main(String[] args) {

		ThirdDimensionPrinter tdp = new ThirdDimensionPrinter();
		//방법1
		Powder p1 = new Powder();
		tdp.setMaterial(p1);
		System.out.println(p1);
		//방법2
		Powder p2 = (Powder)tdp.getMaterial(); //다운캐스팅
		System.out.println(p2);
		
		
		ThirdDimensionPrinter tdp2 = new ThirdDimensionPrinter();
		
		Plastic p3 = new Plastic();
		tdp2.setMaterial(p3);
		System.out.println(p3);
		
		Plastic p4 = (Plastic)tdp2.getMaterial(); 
		System.out.println(p4);
		
	}

}
