package chapter17.Hashset;

import chapter17.Member2;

public class MemberHashsetTest {

	public static void main(String[] args) {
		// 순서 O, 중복 O
		MemberHashSet memberlinkedList = new MemberHashSet();
		//팀원들의 정보
		Member2 member1 = new Member2(1001, "박창훈");
		Member2 member2 = new Member2(1002, "이석진");
		Member2 member3 = new Member2(1003, "박찬우");
		Member2 member4 = new Member2(1004, "이세정");
		Member2 member5 = new Member2(1005, "장준근");
		Member2 member6 = new Member2(1006, "한성무");
		
		memberlinkedList.addMember(member1);
		memberlinkedList.addMember(member2);
		memberlinkedList.addMember(member3);
		memberlinkedList.addMember(member4);
		memberlinkedList.addMember(member5);
		memberlinkedList.addMember(member6);
		
		
		memberlinkedList.showall();		
		
		Member2 member7  =new Member2(1003, "김철수");
		memberlinkedList.addMember(member7);
		
		memberlinkedList.removeMember(member1.getMemberId());
		
		memberlinkedList.showall();

	}

}
