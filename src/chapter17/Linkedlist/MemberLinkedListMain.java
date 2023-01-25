package chapter17.LinkedList;

import chapter17.Member;

public class MemberLinkedListMain {

	public static void main(String[] args) {
		// 순서 O, 중복 O
		MemberLinkedList memberlinkedList = new MemberLinkedList();
		//팀원들의 정보
		Member member1 = new Member(1001, "박창훈");
		Member member2 = new Member(1002, "이석진");
		Member member3 = new Member(1003, "박찬우");
		Member member4 = new Member(1004, "이세정");
		Member member5 = new Member(1005, "장준근");
		Member member6 = new Member(1006, "한성무");
		
		memberlinkedList.addMember(member1);
		memberlinkedList.addMember(member2);
		memberlinkedList.addMember(member3);
		memberlinkedList.addMember(member4);
		memberlinkedList.addMember(member5);
		memberlinkedList.addMember(member6);
		
		
		memberlinkedList.showall();		
		
		Member member7  =new Member(1003, "김철수");
		memberlinkedList.addMember(member7);
		
		memberlinkedList.removeMember(member1.getMemberId());
		
		memberlinkedList.showall();

	}

}
