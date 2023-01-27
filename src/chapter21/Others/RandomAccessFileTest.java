package chapter21.Others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {
	// 입출력 클래스 중에서 유일하게 입출력이 동시에 가능한 클래스
	// 포인터를 이용하여 동시에 입출력이 가능하다
	// 다양한 자료형 메서드 제공
	
	public static void main(String[] args) throws IOException {

		RandomAccessFile raf = new RandomAccessFile("random.txt", "rw");
		raf.writeInt(100);//4byte
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer()); // 파일 포인터는 데이터형의 byte 만큼 증가함
		raf.writeDouble(3.14);//8byte
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		raf.writeUTF("눈이옵니다"); // 한 글자 당 3byte => 3*5 +2(null) | **공백은 1byte
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		
		raf.seek(0); // 파일 포인터 위치 지정 메서드
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		
		int i = raf.readInt();
		Double d = raf.readDouble();
		String u = raf.readUTF();
		
		System.out.println("---------------------------------------");
		System.out.println("파일 포인터의 위치 : " + raf.getFilePointer());
		System.out.println(i);
		System.out.println(d);
		System.out.println(u);
		
	}

}
