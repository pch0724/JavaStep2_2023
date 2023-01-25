package chapter18.TreeMap;

import java.util.Iterator;
import java.util.TreeMap;

import chapter17.Treeset.Member3;



public class MemberTreeMap {

	private TreeMap<Integer, String> map;
	
	public MemberTreeMap() {
		map = new TreeMap<Integer, String>();
	}
	
	//add
	public void addMember(Member3 member) {
		
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
