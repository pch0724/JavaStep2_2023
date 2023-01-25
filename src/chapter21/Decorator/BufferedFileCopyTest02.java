package chapter21.Decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedFileCopyTest02 {

	public static void main(String[] args) {

		long millisecond = 0;
		
		try (FileInputStream fis = new FileInputStream("output.zip");
			 FileOutputStream fos = new FileOutputStream("copy2.zip");
			 BufferedInputStream bis = new BufferedInputStream(fis); // Buffered : 처리 속도가 더 빨라짐
			 BufferedOutputStream bos = new BufferedOutputStream(fos)){
			
			millisecond = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}//while
			
			millisecond = (System.currentTimeMillis() - millisecond);
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}//try catch
		System.out.println("파일 복사에 " + millisecond + "milliseconds가 소요되었습니다.");
	}//class

}
