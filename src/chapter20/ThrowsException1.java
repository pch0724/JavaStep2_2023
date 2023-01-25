package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException1 {

	public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException{
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		
		return c;
	}
	
	public static void main(String[] args) {

		ThrowsException1 test = new ThrowsException1(); // 객체 생성 및 메모리 할당
		
		try {
			test.loadClass("b.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {// Exception 계열 최상위
			System.out.println(e);
		}//try catch
		
		System.out.println("end");
		
	}//main

}//class
