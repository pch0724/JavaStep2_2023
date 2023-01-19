package chapter14.Clone;

import java.util.ArrayList;

class MyBook implements Cloneable{
	
	String title;
	
	public MyBook(String title) {
		this.title = title;
	}	
	
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return title;
	}

	
}

public class ObjectArrayClone {

	public static void main(String[] args) {

		ArrayList<MyBook> bookList = new ArrayList<MyBook>();
		
		MyBook book1 = new MyBook("JavA");
		MyBook book2 = new MyBook("Spring");
		MyBook book3 = new MyBook("Python");
		
		bookList.add(book1);
		bookList.add(book2);
		bookList.add(book3);
		
		ArrayList<MyBook> copyList = (ArrayList)bookList.clone(); // 깊은 복사
		/*
		MyBook copybook = new MyBook("C++");
		copyList.add(copybook);
		*/
		copyList.add(new MyBook("Oracle"));
		System.out.println(bookList);
		System.out.println(copyList);
		
		book3.setTitle("C++");
		System.out.println(bookList);
		System.out.println(copyList);
		
		
	}

}
