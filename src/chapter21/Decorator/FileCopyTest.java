package chapter21.Decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) {

		long millisecond = 0;
		
		try (FileInputStream fis = new FileInputStream("output.zip");
			 FileOutputStream fos = new FileOutputStream("copy.zip")){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}//while
			
			millisecond = (System.currentTimeMillis() - millisecond);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("파일 복사에 " + millisecond + "milliseconds가 소요되었습니다.");
	}

}
