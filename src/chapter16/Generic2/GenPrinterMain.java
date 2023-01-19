package chapter16.Generic2;

public class GenPrinterMain<O extends Material> {

	public static void main(String[] args) {
		
		
		Powder powder = new Powder();
		GenPrinter<Object> powderPrint = new GenPrinter<Object>();
		powderPrint.setObj(powder);
		System.out.println(powderPrint.getObj());
		powder.doPrinting();
		
		/*
		GenPrinter<Powder> powderPrint = new GenPrinter<Powder>();
		powderPrint.setObj(new Powder());
		Powder powder = powderPrint.getObj();
		System.out.println(powder);
		powder.doPrinting();
		*/
		
		System.out.println();
		Plastic plastic = new Plastic();
		GenPrinter<Object> plasticPrint = new GenPrinter<Object>();
		plasticPrint.setObj(plastic);
		System.out.println(plasticPrint.getObj());
		plastic.doPrinting();
		
		/*
		System.out.println();
		GenPrinter<Plastic> plasticPrint = new GenPrinter<Plastic>();
		plasticPrint.setObj(new Plastic());
		Plastic plastic = plasticPrint.getObj();
		System.out.println(plastic);
		plastic.doPrinting();
		*/
		
		System.out.println();
		Water water = new Water();
		GenPrinter<Object> waterPrint = new GenPrinter<Object>();
		waterPrint.setObj(water);
		System.out.println(waterPrint.getObj());
		water.doPrinting();
		
		//물의 재료는 허용되면 안되지만 제네릭의 특성상 허용하는 모순이 발생
		//GenPrinter<Water> waterPrint = new GenPrinter<Water>();
		//waterPrint.setObj(new Water());
		//Water water = waterPrint.getObj();
		//Water water = new Water();
		//System.out.println(water);
		//water.doPrinting();
		
	}

}
