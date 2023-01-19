package chapter17.Arraylist;

import java.util.ArrayList;
import java.util.Iterator;

import chapter17.Member;

public class MemberArrayList {

	//ArrayList 선언 
	private ArrayList<Member> arrayList; 
	
	public MemberArrayList() {
		//heap 생성
		arrayList = new ArrayList<Member>();
	}
	
	//저장 : arrayList에 add하는 메서드
	public void addM(Member member) {
		arrayList.add(member);
	}
	
	//삭제 : arrayList에 remove하는 메서드
	public boolean removeM(int memberid) {
		Iterator<Member>it = arrayList.iterator();
		
		while(it.hasNext()) {
			Member member = it.next();
			int tempId = member.getMemberId();
			if(tempId == memberid) {
				arrayList.remove(member);
				return true;
			}//if
		}//while
		System.out.println(memberid + "가 존재하지 않습니다.");
		return false;
	}//remove
	
	//정보출력 메서드 : arrayList 출력하기
	public void showall() {
		for(Member member : arrayList) {
			System.out.println(member);
		}
		System.out.println();
	}
}
