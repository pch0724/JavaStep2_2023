package chapter17.List;

import java.util.Arrays;
import java.util.List;

public class ArrayTest {

	public static void main(String[] args) {

		int iArray[] = {5, 40, 300, 20, 10};
		String sArray[] = new String[5];
		//Arrays : 항목 정렬, 항목 검색, 항목 비교에 관한 메서드를 사용하기 위함
		
		System.out.println(Arrays.toString(iArray));
		Arrays.sort(iArray); // 정렬 => 오름차순으로만? 내림차순은??
		System.out.println(Arrays.toString(iArray));
		
		Arrays.fill(sArray, "Good!");
		System.out.println(Arrays.toString(sArray));
		
		List<String> City = Arrays.asList("Seoul", "Incheon", "Busan", "Jeju", "Daejeon");
		for(int i = 0; i < City.size(); i++) {
			System.out.print(City.get(i).toString() + " ");
		}//f
	}//m

}//c
