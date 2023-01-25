package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException2 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException2 test = new ThrowsException2(); // 객체 생성 및 메모리 할당
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException | ClassNotFoundException e) { // 논리연산자, >,<,>=,<= 등 사용 가능
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(e);
		}
		
		System.out.println("end");
		
	}//main

}//class
