package chapter17.Hashset;

import java.util.HashSet;
import java.util.Random;

public class SetNumber {

	public static void main(String[] args) {
	//정렬 X 중복 X
	//get method가 없어서 따로 만들거나 iterator 활용해야함
		
		HashSet<Integer> hs = new HashSet<Integer>();
		
		while(true) {
			//난수발생
			int v = (int)((Math.random()*45)+1);
			//int v = new Random().nextInt(45)+1;
			
			hs.add(v);
			
			if(hs.size() >= 6) {
				break;
			}
		}
		System.out.println(hs);
		
	}

}
