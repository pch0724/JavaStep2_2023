package chapter21.InputStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class FileInputStreamTest04 {

	public static void main(String[] args){
		
		try(FileInputStream fis = new FileInputStream("input2.txt")) {
			
			byte[] bs = new byte[10]; // buffer로 활용 **buffer?
			
			int i;
			while((i = fis.read(bs)) != -1){
				// 버퍼읽기 : 10개 단위로 출력
				for(int j = 0; j < i; j++) {
					System.out.print((char)bs[j] + " ");
				}//10개 출력 완료
				System.out.println(" : " + i + "byte read");
			}//while
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("end");
		
	}//main

}
