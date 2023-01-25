package chapter17.Hashset;

import java.util.HashSet;
import java.util.Iterator;

import chapter17.Member2;

public class MemberHashSet {

	private HashSet<Member2> Hashset;
	
	//생성자를 통한 linkedlist 객체 생성
	public MemberHashSet() {
	Hashset = new HashSet<Member2>();
	}
	//addMember
	public void addMember(Member2 member) {
		Hashset.add(member);
		
	}
	//removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member2>it = Hashset.iterator();
		
		while(it.hasNext()) {
			Member2 member = it.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				Hashset.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//출력
	public void showall() {
		
		for(Member2 member : Hashset) {
			System.out.println(member);
		}
		System.out.println();
		
		/*
		for(int i = 0; i<linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
		System.out.println();
		*/
	}
}
