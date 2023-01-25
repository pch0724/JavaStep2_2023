package chapter20;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling2 {

	public static void main(String[] args) {

		FileInputStream fis = null;
		
		//try-catch 필수 사용
		//fis = new FileInputStream("a.txt");
		
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
		} finally {
			try {// close 전용 try-catch
				fis.close(); 
			} catch (IOException e) {
				e.printStackTrace();
			}// inner try-catch
		}//finally
		System.out.println("end");
		
	}

}
