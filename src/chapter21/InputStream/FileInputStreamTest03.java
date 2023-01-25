package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest03 {

	public static void main(String[] args){
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10]; // buffer로 활용 **buffer?
			
			int i;
			while((i = fis.read(bs)) != -1){
				// 버퍼읽기 : 10개씩 Garbage 값 출력
				for(byte b : bs) {
					System.out.print((char)b + " ");
				}//10개 출력 완료
				System.out.println(" : " + i + "byte read");
			}//while
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		System.out.println("end");
		
	}//main

}
