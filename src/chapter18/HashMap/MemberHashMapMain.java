package chapter18.HashMap;

import chapter17.Member2;

public class MemberHashMapMain {

	public static void main(String[] args) {

		MemberHashMap memHashMap = new MemberHashMap();
		
		//가방에 넣을 Member 데이터
		Member2 memberLee=new Member2(1003, "이지원");
		Member2 memberSon=new Member2(1005, "손민국");
		Member2 memberPark=new Member2(1004, "박서연");
		Member2 memberHong=new Member2(1002, "홍길동");
		
		//가방에 넣기
		memHashMap.addMember(memberHong);
		memHashMap.addMember(memberLee);
		memHashMap.addMember(memberPark);
		memHashMap.addMember(memberSon);
		memHashMap.addMember(new Member2(1001, "이민정"));
		memHashMap.addMember(new Member2(1001, "임민정"));
		
		memHashMap.showall();
		
		memHashMap.removeMember(1003);
		
		memHashMap.showall();
	}

}
