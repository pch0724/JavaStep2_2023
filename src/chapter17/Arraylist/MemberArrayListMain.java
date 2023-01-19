package chapter17.Arraylist;

import chapter17.Member;

public class MemberArrayListMain {

	public static void main(String[] args) {

		MemberArrayList memberArrayList = new MemberArrayList();
		//팀원들의 정보
		Member member1 = new Member(1001, "박창훈");
		Member member2 = new Member(1002, "이석진");
		Member member3 = new Member(1003, "박찬우");
		Member member4 = new Member(1004, "이세정");
		Member member5 = new Member(1005, "장준근");
		Member member6 = new Member(1006, "한성무");
		
		memberArrayList.addM(member1);
		memberArrayList.addM(member2);
		memberArrayList.addM(member3);
		memberArrayList.addM(member4);
		memberArrayList.addM(member5);
		memberArrayList.addM(member6);
		
		
		memberArrayList.showall();		
		
		memberArrayList.removeM(member1.getMemberId());
		
		memberArrayList.showall();
		
	}

}

