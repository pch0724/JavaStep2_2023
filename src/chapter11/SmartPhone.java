package chapter11;

public class SmartPhone extends Phone{

	//부모 클래스의 생산자를 오버로딩시 기본 생성자로 인식 못하므로 추상클래스로 정의함
	public SmartPhone(String owner) {
		super(owner);
	}


	public void interSearch() {
		System.out.println("인터넷 검색을 합니다.");
	}
}
