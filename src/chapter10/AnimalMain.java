package chapter10;

public class AnimalMain {

	public static void main(String[] args) {
		Bear b = new Bear();
		Lion l = new Lion();
		Spider s = new Spider();
		
		System.out.println("---------------곰-----------------");
		System.out.println("특 : " + b.Woong);
		System.out.println("눈 : " + b.getEye());
		System.out.println("다리 : " + b.getLeg());
		System.out.println("--------------사자-----------------");
		System.out.println("특 : " + l.galgi);
		System.out.println("눈 : " + l.getEye());
		System.out.println("다리 : " + l.getLeg());
		System.out.println("--------------거미-----------------");
		System.out.println("특 : " + s.web);
		System.out.println("눈 : " +s.getEye());
		System.out.println("다리 : " +s.getLeg());

	}

}
