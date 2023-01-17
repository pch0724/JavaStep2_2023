package chapter12.Interface;

public class SmartTvMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartTv st = new SmartTv();
		
		st.turnOn();
		st.setVolume(15);
		st.turnOff();
		st.search("www.naver.com");
		System.out.println("-------------------------------");
		
		Remote rc = st;
		rc.turnOn();
		rc.setVolume(-7);
		rc.turnOff();
		//rc.search("www.naver.com");// 자신의 인터페이스에 정의되어 있지않은 메서드는 객체를 줘도 오버라이딩 되어있지 않아 다른 인터페이스의 메서드를 못읽음
		System.out.println("-------------------------------");
		
		Searchable sc = st;

		//sc.turnOn();
		//sc.setVoluem(0);
		//sc.turnOff();
		sc.search("www.google.com");
	}

}
