package chapter18.HashMap;

import java.util.HashMap;
import java.util.Iterator;

import chapter17.Member;
import chapter17.Member2;

public class MemberHashMap {

	private HashMap<Integer, String> map;
	
	public MemberHashMap() {
		map = new HashMap<Integer, String>();
	}
	
	//add
	public void addMember(Member2 member) {
		
		map.put(member.getMemberId(), member.getMemberName());
	}
	
	//remove
	public boolean removeMember(int memberId) {
		
		while(map.containsKey(memberId)) {
				map.remove(memberId);
				return true;
		}//while
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	//출력
	public void showall() {
		
		Iterator<Integer> ir = map.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next();
			String member = map.get(key);
			System.out.println(member);
		}
		System.out.println();
	}	
	
	

	
}
