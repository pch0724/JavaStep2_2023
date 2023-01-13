package chapter11;

public class ComputerMain {

	public static void main(String[] args) {
		// 추상 클래스는 객체 생성이 불가능함
		/*Computer c1 = new Computer() {
			
			@Override
			public void typing() {
				// TODO Auto-generated method stub
				
			}//t
			
			@Override
			public void display() {
				// TODO Auto-generated method stub
				
			}//d
		};
		*/
		/*
		Computer c3 = new LapTop() {
			
			@Override
			public void typing() {
				// TODO Auto-generated method stub
				
			}
		};
		*/
		Computer c2 = new DeskTop();
		Computer c4 = new MyLapTop();
		
		c2.typing();
		c2.display();
		c4.display();
	}

}
