package chapter17.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

import chapter17.Member;

public class MemberLinkedList {

	private LinkedList<Member> linkedList;
	
	//생성자를 통한 linkedlist 객체 생성
	public MemberLinkedList() {
	linkedList = new LinkedList<Member>();
	}
	//addMember
	public void addMember(Member member) {
		linkedList.add(member);
		
	}
	//removeMember
	public boolean removeMember(int memberId) {
		Iterator<Member>it = linkedList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(tempId == memberId) {
				linkedList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberId + "가 존재하지 않습니다.");
		return false;
	}
	
	//출력
	public void showall() {
		
		for(Member member : linkedList) {
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
