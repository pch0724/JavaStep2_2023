package chapter09;

public class SuperMain {

	public static void main(String[] args) {

		Paprika pap = new Paprika();
		
		pap.Set1("피망류", "여름", "노랑 파프리카");//부모 클래스의 생성자
		pap.Set2("빨강", 7000, "빨강 파프리카");//자식 클래스의 생성자
		
		pap.Disp1();//부모클래스
		pap.Disp2();//자식클래스
		
	}//m

}//c
