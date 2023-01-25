package chapter19.Lambda;



@FunctionalInterface // import, 상속과 유사한 개념 
public interface Add {
	
	//@FunctionalInterface : 인터페이스로 구현하되, 추상메서드는 하나만 존재할 수 있음
	public int add(int x, int y);
	
	
	
}//interface
