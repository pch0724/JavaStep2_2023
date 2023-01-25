package chapter21.OutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream01 {

	public static void main(String[] args) throws IOException {

		//FileOutputStream fos = new FileOutputStream("output1.txt");//전체 저장
		FileOutputStream fos = new FileOutputStream("output2.txt");//특정 인덱스 지정 저장
		
		try(fos) {
			
			byte[] bs = new byte[26];
			byte data = 65; // 'A'
			
			for(int i = 0; i < bs.length; i++) {
				bs[i]= data;
				data++;
			}
			
			//fos.write(bs); // 배열 한번에 저장 => output1.txt
			fos.write(bs,2,10); // 배열의 2번 부터 10개만 저장 => output2.txt
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("저장이 완료 되었습니다.");
	}

}