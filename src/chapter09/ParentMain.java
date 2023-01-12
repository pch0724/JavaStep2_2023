package chapter09;

public class ParentMain {

	public static void main(String[] args) {

		ChildExam c1 = new ChildExam();
		
		System.out.println(c1.getCar());
		System.out.println(c1.getMoney());//상속받은 재산
		System.out.println(c1.getStr());//상속받은 부동산
		System.out.println("----------------------------------------------");
		//------------------------------------------------
		if(c1 instanceof ParentExam) { //A instancof B: B겍체 안에 A라는 객체가 있는지? 
			System.out.println("c1은 ParentExam의 자식 클래스입니다.");
			System.out.println(c1.getMoney());
		}
		
		//------------------------------------------------
		//형변환 
		ChildExam ch = new ChildExam();
		ParentExam p1 = new ParentExam();
		System.out.println("--------------------------------");
		p1 = ch; // 부모 = 자식 -> 자동 형변환 | 자식 클래스에서 부모클래스와 동일한 이름의 필드를 다른 데이터 형으로 사용했을 때 부모객체와 자식객체가 같다고 명시해줄 경우 자식 객체에서 사용한 변수의 데이터형으로 자동적으로 형변환이 이루어짐  
		System.out.println(p1.getMoney());
		System.out.println(p1.getStr());
		System.out.println("--------------------------------");
		ch = (ChildExam)p1; // 명시적 형변환
		System.out.println(ch.getCar());
		System.out.println(ch.getMoney());
		System.out.println(ch.getStr());
	}

}
