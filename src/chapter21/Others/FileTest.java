package chapter21.Others;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) throws IOException {
		// 입출력 기능은 없음
		// 파일의 속성, 경로, 이름 등의 정보를 제공하는 메서드
		
		File file = new File("reader.txt");
		
		file.createNewFile();
		
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
		System.out.println(file.getPath()); // 최종 경로(주로 폴더이름 또는 파일이름이 나옴)  
		System.out.println(file.canRead());
		System.out.println(file.canWrite());
		
		file.delete();
		
	}

}
